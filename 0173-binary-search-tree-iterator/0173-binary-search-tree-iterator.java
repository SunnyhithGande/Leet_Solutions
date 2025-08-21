/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {
    List<Integer> list=new ArrayList<>();
    int idx=0;
    public BSTIterator(TreeNode root) {
        dfs(root);
    }
    public void dfs(TreeNode node){
        if(node==null)
        return ;
        dfs(node.left);
        list.add(node.val);
        dfs(node.right);
    }
    
    public int next() {
        return list.get(idx++);
    }
    
    public boolean hasNext() {
        if(idx<list.size())
        return true;
        return false;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */