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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        ArrayList<List<Integer>> finalAns = new ArrayList<List<Integer>>();
        if(root==null){
            return finalAns;
        }
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        ArrayList<Integer> arr=new ArrayList<Integer>();

        while(!q.isEmpty()){
            
            
            
            TreeNode curr=q.remove();
            if(curr==null){
                ArrayList<Integer> arr2=new ArrayList<Integer>();
                for(int i=0;i<arr.size();i++){
                    arr2.add(arr.get(i));
                }
                
                
                finalAns.add(arr2);
                
                arr.removeAll(arr);
                
                
               
                
              

                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
                
            
            }

            else{

                arr.add(curr.val);

                if(curr.left!=null){
                    q.add(curr.left);
                }
                 if(curr.right!=null){
                    q.add(curr.right);
                }
               
            }
            
        }
       
        

        return finalAns;

        
    }
}