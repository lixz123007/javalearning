package bladetooffer;

public class offer028 {
    public static void main(String[] args) {
        System.out.println(isSymmetric(buildtree()));
        System.out.println(bzisSymmetric(buildtree()));


    }
    static public TreeNode buildtree() {
    TreeNode hade=new TreeNode(1);
    TreeNode left1=new TreeNode(2);
    TreeNode right1=new TreeNode(3);
    hade.left=left1;
    hade.right=right1;
        return hade;
    }

    static public boolean isSymmetric(TreeNode root) {
        readtree(root);
        TreeNode head=root;
        //readtree(head);
        TreeNode Ttree=mirrorTree(head);
        readtree(Ttree);
        readtree(root);
        if(ismir(root,Ttree))
            return true;

        return false;
    }
    static public TreeNode mirrorTree(TreeNode root) {
        if(root==null)
            return root;
        TreeNode head=root;
        turntree(root);
        return head;
    }
    static public void turntree(TreeNode root){
        System.out.println("turn+"+root.val);
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
    static public boolean ismir(TreeNode root,TreeNode troot){
        System.out.println(root.val+" "+troot.val);
        if(root.val!=troot.val){
            System.out.println(root.val+" error "+troot.val);
            return false;
        }
        if((root.left!=null&&troot.left==null)||(root.left==null&&troot.left!=null)){
            System.out.println(" error left ");
            return false;}
        if((root.right!=null&&troot.right==null)||(root.right==null&&troot.right!=null)){
            System.out.println(" error right ");
            return false;}

        if(root.left!=null&&troot.left!=null){
            if(!ismir(root.left,troot.left))
                return false;
        }

        if(root.right!=null&&troot.right!=null){
            if(!ismir(root.right,troot.right))
                return false;
        }
        if((root.left==null&&troot.left==null)&&(root.right==null&&troot.right==null)){
            return true;
        }

        //return false;

        return true;

    }
    static public void readtree(TreeNode root){
        System.out.println(root.val);
        if(root.right!=null)
            readtree(root.right);
        if(root.left!=null)
            readtree(root.left);
        return;
    }

    static public boolean bzisSymmetric(TreeNode root) {
        return root == null ? true : recur(root.left, root.right);
    }
    static boolean recur(TreeNode L, TreeNode R) {
        if(L == null && R == null) return true;
        if(L == null || R == null || L.val != R.val) return false;
        return recur(L.left, R.right) && recur(L.right, R.left);
    }


}
