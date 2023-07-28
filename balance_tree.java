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

class Solution {
   public boolean isBalanced(TreeNode root) 
    {
     if(root==null){
          return true;
     }
        
     boolean l=isBalanced(root.left);
      boolean r=isBalanced(root.right);
        
        int lht=height(root.left);
        int rht=height(root.right);
        if(Math.abs(lht-rht)>=2)
            return false;
        return l&&r;
        
        
    } 
        
        
        
    
    public int height(TreeNode root){
        if(root==null){
            return -1;
        }
        return 1+max(height(root.left),height(root.right));
    }

    public int max(int a,int b){
        if(a>b){
            return a;

        }
        else{
            return b;
        }
    }
}