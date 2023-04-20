package com.denisov.patterns.behavioral;

import com.denisov.patterns.behavioral.chainofresponsobility.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChainOfResponsibilityTest {
    private static final String OK              = " OK";
    private static final String SOMETHING_WRONG = " something wrong";
    private static final String NOT_OK          = " NOT OK!!!";

    private static final String SIMPLE_REPORT = "simple report";
    private static final String EMAIL_REPORT  = "sending email";
    private static final String SMS_REPORT    = "send sms";

    private static final String OK_EXPECTED              = SIMPLE_REPORT + OK;

    private static final String SOMETHING_WRONG_EXPECTED = SIMPLE_REPORT + SOMETHING_WRONG + " " +
                                                           EMAIL_REPORT + SOMETHING_WRONG;

    private static final String NOT_OK_EXPECTED          = SIMPLE_REPORT + NOT_OK + " " +
                                                           EMAIL_REPORT + NOT_OK + " " +
                                                           SMS_REPORT + NOT_OK;


    @Test
    void test() {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailReportNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SmsNotifier(Priority.ASAP);

        reportNotifier.setNext(emailNotifier);
        emailNotifier.setNext(smsNotifier);

        String report = reportNotifier.notifyManager(OK, Priority.ROUTINE);
        String email = reportNotifier.notifyManager(SOMETHING_WRONG, Priority.IMPORTANT);
        String sms = reportNotifier.notifyManager(NOT_OK, Priority.ASAP);

        assertEquals(OK_EXPECTED, report.trim());
        assertEquals(SOMETHING_WRONG_EXPECTED, email.trim());
        assertEquals(NOT_OK_EXPECTED, sms.trim());
    }
}
