class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        
         if(root==null)
            return 0;
        
        ArrayList<Long> levelsum=new ArrayList<>();
         
        Queue<TreeNode> Q=new LinkedList<>();
        
        Q.add(root);
        
        while(!Q.isEmpty())
        {
            long sum=0;
            int size=Q.size();
            
            for(int i=1;i<=size;i++)
            {
                TreeNode temp=Q.remove();

                sum+=temp.val;
                
                
                if(temp.left!=null)
                    Q.add(temp.left);
                if(temp.right!=null)
                    Q.add(temp.right);
                
            }
            
            levelsum.add(sum);
            
        }

        Collections.sort(levelsum);
        
        if(levelsum.size()<k)
            return -1;
        
        return levelsum.get(levelsum.size()-k);
        
    }
}