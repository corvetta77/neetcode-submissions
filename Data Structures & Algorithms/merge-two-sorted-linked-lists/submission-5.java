/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode first = new ListNode(0);
        ListNode target = first;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                target.next = list1;
                list1 = list1.next;
            } else {
                target.next = list2;
                list2 = list2.next;
            }
            target = target.next;
        }

        if (list1 != null) {
            target.next = list1;
        } else {
            target.next = list2;
        }

        return first.next;
    }
}