package bladetooffer;

public class offer026 {
    public static void main(String[] args) {

    }
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(!find(A,B))
            return false;

        return true;
    }
    public boolean find(TreeNode A,TreeNode B){
        if(B==null||A==null)return false;
        //System.out.println(A.val+" "+B.val);
        if(A.val==B.val){
            //System.out.println(A.val+" yes "+B.val);
            if(comparetree(A,B))
                return true;
        }
        if(A.left!=null){
            if(find(A.left,B))
                return true;
        }
        if(A.right!=null){
            if(find(A.right,B))
                return true;
        }
        return false;

    }
    public boolean comparetree(TreeNode A,TreeNode B){
        if(A.val!=B.val){return false;}
        if(A.left!=null&&B.left!=null){
            if(!comparetree(A.left,B.left))
                return false;
        }else if(A.left==null&&B.left!=null){
            return false;
        }
        if(A.right!=null&&B.right!=null){
            if(!comparetree(A.right,B.right))
                return false;
        }else if(A.right==null&&B.right!=null){return false;}
        if(B.right==null&&B.left==null){
            return true;
        }

        return true;
    }
}
