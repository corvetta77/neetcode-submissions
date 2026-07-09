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
    public void reorderList(ListNode head) {
        List<ListNode> nodesList = new ArrayList();
        ListNode curr = head;
        while (curr != null) {
            nodesList.add(curr);
            curr = curr.next;
        } 

        int j = nodesList.size() - 1;
        int i = 0;
        while (i<j) {
            nodesList.get(i).next = nodesList.get(j);
            i++;

            if (i>=j) {
                break;
            }

            nodesList.get(j).next = nodesList.get(i);
            j--;
        }
        nodesList.get(i).next = null;
    }
}
