package com.denisov.util;

public class ListNode {
    public final int val;
    public ListNode next;

    public ListNode(int val) { this.val = val; }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof ListNode))
            return false;

        ListNode listNode = (ListNode) o;

        return listNode.val == this.val;
    }
}
