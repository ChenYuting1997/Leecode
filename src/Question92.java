public class Question92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        for(int i = 1; i < m; i++){
            pre = pre.next;
        }
        head = pre.next;
        for(int i = m; i < n; i++){
            ListNode nex = head.next;
            //2->4
            head.next = nex.next;
            //3->2
            nex.next = pre.next;
            //1->3
            pre.next = nex;




        }
        return dummy.next;
    }
}

