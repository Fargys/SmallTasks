package com.denisov.leetCode.challenge;

import org.junit.Test;
import com.denisov.util.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiddleNodeTest {

    private final MiddleNode middleNode = new MiddleNode();

    @Test
    public void positive() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode expected = new ListNode(3);
        expected.next = new ListNode(4);
        expected.next.next = new ListNode(5);

        ListNode actual = middleNode.middleNode(head);

        while(expected.next != null) {
            assertEquals(expected, actual);
            assertEquals(expected.next, actual.next);

            expected = expected.next;
            actual = actual.next;
        }
    }

    @Test
    public void positive2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        ListNode expected = new ListNode(4);
        expected.next = new ListNode(5);
        expected.next.next = new ListNode(6);

        ListNode actual = middleNode.middleNode(head);

        while(expected.next != null) {
            assertEquals(expected, actual);
            assertEquals(expected.next, actual.next);

            expected = expected.next;
            actual = actual.next;
        }
    }
}
