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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> arr=new ArrayList<String>();
        ArrayList<String> arr2=new ArrayList<String>();
        trav(root,arr,"");
        return arr;
        
    }
    void trav(TreeNode root,ArrayList<String> arr,String s){
        if(root==null){
            return;
        }
        
        if(root!=null && root.left==null && root.right==null){
            
           arr.add(s+root.val);
            return; 
        }
        if(root!=null){
        trav(root.left,arr,s+root.val+"->");
        trav(root.right,arr,s+root.val+"->");
        }
       
    }
}