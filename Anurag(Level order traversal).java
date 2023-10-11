class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> ans  = new ArrayList<>();
    if(root==null)
    {
        return ans;
    }
     Queue<TreeNode> Q = new LinkedList<>();
    Q.add(root);
    while(!Q.isEmpty())
    {
        int size=Q.size();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<size;i++)
        {
         TreeNode temp=Q.remove();
         list.add(temp.val);
         if(temp.left!=null)
        {
            Q.add(temp.left);
        }
        if(temp.right!=null)
        {
            Q.add(temp.right);
        }
      }
      ans.add(list);  
     }
    return ans;
  
   }
}
