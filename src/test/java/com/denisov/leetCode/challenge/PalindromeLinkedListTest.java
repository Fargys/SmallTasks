package com.denisov.leetCode.challenge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.denisov.util.ListNode;

class PalindromeLinkedListTest {

    private final PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();

    @Test
    void positive() {
        ListNode head = new ListNode(1);
        Assertions.assertTrue(palindromeLinkedList.isPalindrome(head));

        head = new ListNode(1);
        head.next = new ListNode(1);
        Assertions.assertTrue(palindromeLinkedList.isPalindrome(head));

        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        Assertions.assertTrue(palindromeLinkedList.isPalindrome(head));

        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        Assertions.assertTrue(palindromeLinkedList.isPalindrome(head));

        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);
        Assertions.assertTrue(palindromeLinkedList.isPalindrome(head));
    }

    @Test
    void negative() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        Assertions.assertFalse(palindromeLinkedList.isPalindrome(head));

        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        Assertions.assertFalse(palindromeLinkedList.isPalindrome(head));

        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        Assertions.assertFalse(palindromeLinkedList.isPalindrome(head));

        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        Assertions.assertFalse(palindromeLinkedList.isPalindrome(head));
    }
}
