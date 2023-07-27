
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot==null){
            return true;
        }
         if(root==null){
            return false;
        }
        if(root.val==subRoot.val){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        boolean left=isSubtree(root.left, subRoot);
        boolean right=isSubtree(root.right, subRoot);
        return left||right;
    }
     public static boolean isIdentical(TreeNode root,TreeNode subRoot){
        if(root==null && subRoot==null){
            return true;
        }
        else if(root==null || subRoot==null){
            return false;
        }
        if(root.val==subRoot.val){
            return isIdentical(root.left,subRoot.left) && isIdentical(root.right,subRoot.right);
        }
        
        return false;
    }
   
}