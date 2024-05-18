// User function Template for Java

/*
class Node { 
    int data; 
    Node next; 

    Node() { data = 0; }
    Node(int d) { data = d; }  //constructor to create a new node
} 
*/
class Solution {
    static Node constructLL(int arr[]) {
        int len = arr.length;
        
        if(arr==null)
            return null;
        
        Node head = new Node(arr[0]);
        Node mov = head;
        
        for(int i=1;i<len;i++){
            Node newNode = new Node(arr[i]);
            mov.next = newNode;
            mov = newNode;
        }
        
        return head;
    }
}
