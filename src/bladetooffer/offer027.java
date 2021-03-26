package bladetooffer;

public class offer027 {
    public TreeNode mirrorTree(TreeNode root) {
        if(root==null)
            return root;
        TreeNode head=root;
        turntree(root);
        return head;
    }
    public void turntree(TreeNode root){
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        if(root.right!=null){
            turntree(root.right);
        }
        if(root.left!=null){

            turntree(root.left);
        }

    }
}
