// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */

// // public int diameterOfBinaryTree(TreeNode root) {
// //         // passing an array so that it can be modified by reference.
// //         int[] result = {0};
        
// //         maxDiameter(root, result);
        
// //         return result[0];
// //     }
    
// //     private int maxDiameter(TreeNode node, int[] result){
// //         if(node == null){
// //             return 0;
// //         }
        
// //         int left = maxDiameter(node.left, result);
// //         int right = maxDiameter(node.right, result);

// //         // max of prev diameter or current        
// //         result[0] = Math.max(left + right, result[0]);
        
// //         // contribution of current node to its parent
// //         return Math.max(left, right) + 1;
// //     }

// class Solution {
//     int dia=0;
//     public int diameterOfBinaryTree(TreeNode root) {
//         height(root);
      
//         return dia;
//     }

//     public int height(TreeNode root){
//         if(root==null){
//             return 0;

//         }
//         int left=height(root.left);
//         int right=height(root.right);

//          dia = Math.max(dia, left + right);
        
//         return Math.max(left, right) + 1;
//     }

  
    
// }


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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        else
        {
            int lh=height(root.left);
            int rh=height(root.right);
            int ldia=diameterOfBinaryTree(root.left);
            int rdia=diameterOfBinaryTree(root.right);
            return Math.max(lh+rh,Math.max(ldia,rdia));
        }
    }
    public int height(TreeNode temp)
    {
        if(temp==null){
            return 0;
        }
        int left=height(temp.left);
        int right=height(temp.right);
        return Math.max(left,right)+1;
    }
}