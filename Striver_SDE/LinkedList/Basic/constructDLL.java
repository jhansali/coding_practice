class Solution {
    Node constructDLL(int arr[]) {
        int len = arr.length;
        
        if(arr==null)
            return null;
        
        Node head = new Node(arr[0]);
        Node mov = head;
        Node prev = head;
        
        for(int i=1;i<len;i++){
            Node newNode = new Node(arr[i]);
            mov.next = newNode;
            mov = newNode;
            mov.prev = prev;
            prev = prev.next;
        }
        
        return head;
    }
}
