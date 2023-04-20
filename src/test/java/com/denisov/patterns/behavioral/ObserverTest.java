package com.denisov.patterns.behavioral;

import com.denisov.patterns.behavioral.observer.JavaDeveloperJobSite;
import com.denisov.patterns.behavioral.observer.Observer;
import com.denisov.patterns.behavioral.observer.Subscriber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObserverTest {

    public static final String JAVA_JUNIOR = "Junior";
    public static final String JAVA_MIDDLE = "Middle";
    public static final String JAVA_SENIOR = "Senior";

    public static final String SUBSCRIBER_1_NAME = "name1";
    public static final String SUBSCRIBER_2_NAME = "name2";

    public static final String NO_ONE_SUBSCRIBER_EXPECTED  = "";
    public static final String ONE_SUBSCRIBER_EXPECTED     = "Junior Middle";
    public static final String TWO_SUBSCRIBERS_EXPECTED    = "Junior Middle Senior Junior Middle Senior";


    @Test
    void test() {
        JavaDeveloperJobSite site = new JavaDeveloperJobSite();
        assertEquals(NO_ONE_SUBSCRIBER_EXPECTED, site.addVacancy(JAVA_JUNIOR));

        Observer firstObserver = new Subscriber(SUBSCRIBER_1_NAME);
        site.addObserver(firstObserver);
        assertEquals(ONE_SUBSCRIBER_EXPECTED, site.addVacancy(JAVA_MIDDLE));

        Observer secondObserver = new Subscriber(SUBSCRIBER_2_NAME);
        site.addObserver(secondObserver);
        assertEquals(TWO_SUBSCRIBERS_EXPECTED, site.addVacancy(JAVA_SENIOR));
    }
}
