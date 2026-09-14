
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class RemoveDuplicatesFromSortedListLinkedList {

    public static void main(String[] args) {

        RemoveDuplicatesFromSortedListLinkedList.ListNode linkedList = new RemoveDuplicatesFromSortedListLinkedList.ListNode(
                1,
                new RemoveDuplicatesFromSortedListLinkedList.ListNode(1,
                        new RemoveDuplicatesFromSortedListLinkedList.ListNode(2)));
        // LinkedList<Integer> list = new LinkedList<>();
        // int i = 0;
        // RemoveDuplicatesFromSortedListLinkedList.ListNode ansLinkedList = new ListNode();
        // getUniqueNumber(linkedList, list);
        // for (int k = 0; k < list.size(); k++) {
        //     ansLinkedList.val = list.get(k);
        //     if(++k<=list.size()-1) {
        //         ansLinkedList.next = new ListNode(list.get(++k));
        //     }
        // }

        ListNode current = linkedList;

        // while (current != null && current.next != null) {
        //     if (current.val == current.next.val) {
        //         current.next = current.next.next;
        //     } else {
        //         current = current.next;
        //     }
        // }
        deleteDuplicateRec(current);
        System.out.println("got here no call stack");


    }

    public static void getUniqueNumber(ListNode list, List<Integer> ansList) {
        if (Objects.isNull(list.next)) {
            if (!ansList.contains(list.val)) {
                ansList.add(list.val);
            }
            return;
        } else {
            if (!ansList.contains(list.val)) {
                ansList.add(list.val);
            }
            list = list.next;
            getUniqueNumber(list, ansList);
        }
    }

    public static void deleteDuplicateRec(ListNode head) {
        if(Objects.isNull(head.next)) {
            return;
        } else {
            if(head.val == head.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        deleteDuplicateRec(head);
    }

    public static class ListNode {

        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
}
