package com.denisov.leetCode.topHundred;

import org.junit.Test;
import com.denisov.util.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AddTwoNumbersTest {

    public final AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    public void positive() {
        ListNode first = new ListNode(2);
        first.next = new ListNode(4);
        first.next.next = new ListNode(3);

        ListNode second = new ListNode(5);
        second.next = new ListNode(6);
        second.next.next = new ListNode(4);

        ListNode expected = new ListNode(7);
        expected.next = new ListNode(0);
        expected.next.next = new ListNode(8);

        ListNode actual = addTwoNumbers.addTwoNumbers(first, second);

        while(expected.next != null) {
            assertEquals(expected, actual);
            assertEquals(expected.next, actual.next);

            expected = expected.next;
            actual = actual.next;
        }
    }

    @Test
    public void positive2() {
        ListNode first = new ListNode(0);
        ListNode second = new ListNode(0);

        ListNode expected = new ListNode(0);
        ListNode actual = addTwoNumbers.addTwoNumbers(first, second);

        while(expected.next != null) {
            assertEquals(expected, actual);
            assertEquals(expected.next, actual.next);

            expected = expected.next;
            actual = actual.next;
        }
    }

    @Test
    public void positive3() {
        ListNode first = new ListNode(9);
        first.next = new ListNode(9);
        first.next.next = new ListNode(9);
        first.next.next.next = new ListNode(9);
        first.next.next.next.next = new ListNode(9);
        first.next.next.next.next.next = new ListNode(9);
        first.next.next.next.next.next.next = new ListNode(9);

        ListNode second = new ListNode(9);
        first.next = new ListNode(9);
        first.next.next = new ListNode(9);
        first.next.next.next = new ListNode(9);

        ListNode expected = new ListNode(8);
        first.next = new ListNode(9);
        first.next.next = new ListNode(9);
        first.next.next.next = new ListNode(9);
        first.next.next.next.next = new ListNode(0);
        first.next.next.next.next.next = new ListNode(0);
        first.next.next.next.next.next.next = new ListNode(0);
        first.next.next.next.next.next.next.next = new ListNode(1);

        ListNode actual = addTwoNumbers.addTwoNumbers(first, second);

        while(expected.next != null) {
            assertEquals(expected, actual);
            assertEquals(expected.next, actual.next);

            expected = expected.next;
            actual = actual.next;
        }
    }
}
