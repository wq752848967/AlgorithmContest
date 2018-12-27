public class House_Robber_3 {
    public static void main(String[] args) {

    }
     public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
     }
    public static int rob(TreeNode root) {
        if(root==null){
            return 0;
        }
        int max = Math.max(robOne(root,true),robOne(root,false));
        return max;
    }
    public static int robOne(TreeNode root,boolean canRob){
        if(root==null){
            return 0;
        }
        int result = 0;
        if(canRob){
            result = Math.max(root.val+robOne(root.left,false)+robOne(root.right, false),robOne(root.left,true)+robOne(root.right, true));

        }
        else{
            result = robOne(root.left,true)+robOne(root.right, true);
        }
        return result;
    }

}
