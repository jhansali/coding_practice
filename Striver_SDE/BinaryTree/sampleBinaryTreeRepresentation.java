class Solution{
    public static void createTree(Node root0, ArrayList<Integer> v ){
        root0.val=v.get(0);
        Node l1=new Node(v.get(1));
        Node r1=new Node(v.get(2));
        Node l2=new Node(v.get(3));
        Node r2=new Node(v.get(4));
        Node l3=new Node(v.get(5));
        Node r3=new Node(v.get(6));
        root0.left=l1;
        root0.right=r1;
        l1.left=l2;
        l1.right=r2;
        r1.left=l3;
        r1.right=r3;
    }
}
