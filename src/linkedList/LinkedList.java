package linkedList;

public class LinkedList {

    ListNode head;

    public void add(int val){

    }



    class ListNode{
        int val;
        ListNode next;

        ListNode(){}
        ListNode(int val){this.val = val;}
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
}
