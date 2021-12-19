package linkedList;

public class MiddleNode_876 {

    public int countSize(ListNode head){
        int size = 0;

        ListNode temp = head;
        while (temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }

    public ListNode middleNode(ListNode head) {

        int size = countSize(head);
        int mid = size / 2;
        int i = 1;

        ListNode temp = head;
        ListNode node = null;
        while (i < mid){
            temp = temp.next;
            i++;
        }
        node = temp.next;
        return node;
    }



    class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
