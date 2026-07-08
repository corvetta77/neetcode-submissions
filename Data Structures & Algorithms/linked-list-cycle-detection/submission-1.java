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
    public boolean hasCycle(ListNode head) {
        ListNode currNode = head;
        HashSet<ListNode> cached = new HashSet();

        while (currNode != null) {
            if (cached.contains(currNode)) {
                return true;
            }
            cached.add(currNode);
            currNode = currNode.next;
        }    
        return false;
    }
}
