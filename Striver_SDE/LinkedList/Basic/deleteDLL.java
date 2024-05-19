class Solution
{
    // function returns the head of the linkedlist
    Node deleteNode(Node head,int x)
    {
    	if(x==1){
            head = head.next;
            head.prev = null;
            return head;
        }
    
        Node temp = head;
        int count = 1;
        
        while(temp!=null && count<x-1){
            temp=temp.next;
            count++;
        }
        temp.next.prev=null;
        temp.next = temp.next.next;
        return head;
    }
}
