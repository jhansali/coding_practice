class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        if(head == null && head.next == null)
            return 0;
            
        Node slow = head;
        Node fast = head;
        boolean flag = false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = true;
                break;
            }
        }
         if(!flag){
            return 0;
        }
        int len=1;
        while(fast.next!=slow){
            len+=1;
            fast = fast.next;
        }
        return len;
    }
}
