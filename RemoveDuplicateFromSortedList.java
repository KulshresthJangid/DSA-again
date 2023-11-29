// 83. Remove Duplicates from Sorted List

public class RemoveDuplicateFromSortedList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {this.val; this.next = next;}
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode nextNode = head.next;
        while (head.val == nextNode.val && head.next != null) {
            if(head.val == nextNode.val) {
                 
            }
        }

        return head;
    }
    
}
