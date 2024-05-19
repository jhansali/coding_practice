public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> hs = new HashSet<>();

        if(head==null || head == null)
            return head;
        
        while(head.next!=null){
            if(hs.contains(head)) return head;
            hs.add(head);
            head = head.next;
        }
        return null;
    }
