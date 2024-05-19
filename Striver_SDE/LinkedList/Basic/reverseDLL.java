public static Node reverseDLL(Node  head)
{
    //Your code here
    if (head ==null || head.next == null )return head; 
    
    Node prevPtr =null ,currPtr, nextPtr=null ; 
    
    currPtr= head ; 
    
    while(currPtr != null ){
        nextPtr = currPtr.next ; 
        currPtr.next =currPtr.prev; 
        currPtr.prev= nextPtr ; 
        prevPtr=currPtr; 
        currPtr= nextPtr; 
        
    }
    head = prevPtr ; 
    return  head;
}
