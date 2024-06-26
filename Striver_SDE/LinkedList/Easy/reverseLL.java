class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        if(head == null || head.next==null)
            return head;
        
        ListNode next = null;

        while(cur!=null){
            next = cur.next;
            cur.next=prev;
            prev = cur;
            cur = next;
        }
        head = prev;
        return head;
    }
}
