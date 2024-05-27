class Solution {
    // public List<Integer> result = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
    //     if(root==null){
    //         return result;
    //     }else{
    //         result.add(root.val);
    //         preorderTraversal(root.left);
    //         preorderTraversal(root.right);
    //     }
    //     return result;
        List<Integer> result = new ArrayList<>();
        if(root==null)
            return result;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode temp = st.pop();
            result.add(temp.val);
            if(temp.right!=null)
                st.add(temp.right);
            if(temp.left!=null)
                st.add(temp.left);
        }
        return result;
    }
    
}
