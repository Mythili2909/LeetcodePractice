class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        leaf(root1,list1);
        leaf(root2,list2);
        return list1.equals(list2);
    }
    public void leaf(TreeNode root,List<Integer> list){
        if(root==null)return;
        if(root.left==null&&root.right==null){
            list.add(root.val);
            return;
        }    
        leaf(root.left,list);
        leaf(root.right,list);
    }
}