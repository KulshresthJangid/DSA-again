// 83. Remove Duplicates from Sorted List

public class RemoveDuplicateFromSortedList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {this.val = val; this.next = next;}
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode prev = dummyNode;
        ListNode cur = head;

        while (cur != null && cur.next != null) {
            if(cur.val == cur.next.val) {
                while (cur.next != null && cur.val == cur.next.val) {
                    cur= cur.next;
                }
                prev.next = cur.next;
            } else {
                prev = cur.next;
            }
            cur = cur.next;
        }
        
        return dummyNode.next;
    }
    
}
