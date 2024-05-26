class Solution {
    public List<Integer> result = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null){
            return result;
        }else{
            result.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return result;
    }
}
