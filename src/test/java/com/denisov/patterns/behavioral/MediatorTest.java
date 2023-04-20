package com.denisov.patterns.behavioral;

import com.denisov.patterns.behavioral.mediator.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MediatorTest {


    public static final String ADMIN_NAME  = "admin";
    public static final String USER_1_NAME = "first";
    public static final String USER_2_NAME = "second";

    public static final String MESSAGE = "Hello guys!";

    public static final String SAMPLE_EXCEPTED = "sample user got message admin got message";
    public static final String ADMIN_EXCEPTED  = "sample user got message sample user got message admin got message";

    @Test
    void test() {
        SampleTextChat chat = new SampleTextChat();

        User admin = new Admin(chat, ADMIN_NAME);
        User firstSampleUser = new SampleUser(chat, USER_1_NAME);
        User secondSampleUser = new SampleUser(chat, USER_2_NAME);

        chat.setAdmin(admin);
        chat.addUser(firstSampleUser);
        chat.addUser(secondSampleUser);

        assertEquals(SAMPLE_EXCEPTED, firstSampleUser.sendMessage(MESSAGE));
        assertEquals(ADMIN_EXCEPTED, admin.sendMessage(MESSAGE));
    }
}
