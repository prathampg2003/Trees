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
    ArrayList<Integer> arr=new ArrayList<>();
    ArrayList<Integer> arr1=new ArrayList<>();
    public boolean isSameTree(TreeNode p, TreeNode q) {
    //     if(p==q){
           
    //         return true;
    //     }
    //     if(p==null||q==null){
    //         return false;
    //     }
        
    //     if(p.val!=q.val){
    //         return false;
    //     }
    //    return(isSameTree(p.left,q.left) && isSameTree(p.right,q.right));
           
       
       
       
        
    
        
        
        
        
        inorder(p,arr);
        inorder(q,arr1);
        if(arr.equals(arr1))return true;
         else return false; 

        

        
    }
    public void inorder(TreeNode tree,ArrayList<Integer> arr){
        if(tree==null){
            return;
        }
        
        inorder(tree.left,arr);
        arr.add(tree.val);
        inorder(tree.right,arr);
        if(tree.left==null ||tree.right==null){
            arr.add(null);
        }
        

    }
}