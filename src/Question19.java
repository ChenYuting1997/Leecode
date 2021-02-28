public class Question19 {
    //2次遍历
    /*public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode node = head;
        while(node != null){
            length++;
            node = node.next;
        }
        ListNode dummy = new ListNode(0,head);
        ListNode first = dummy;
        for(int i=0;i<length-n;i++){
            first = first.next;
        }
        first.next = first.next.next;

        return dummy.next;
    }*/
    //双指针（快慢指针）
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode dummy = new ListNode(0,head);
        ListNode slow = dummy;
        for(int i=0;i<n;i++){
            fast = fast.next;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }
}
