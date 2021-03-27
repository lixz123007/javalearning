package bladetooffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrderoffer33 {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> levelOrder(TreeNode root) {

        if(root == null) return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>(){{ add(root); }};

        List<List<Integer>> res = new ArrayList<>();
        while(true) {
            ArrayList<Integer> ans = new ArrayList<>();
            Queue<TreeNode> queueback = new LinkedList<>();

            while (!queue.isEmpty()) {
                TreeNode temp = queue.poll();
                //System.out.println(temp.val);
                ans.add(temp.val);

                if (temp.left != null) queueback.add(temp.left);
                if (temp.right != null) queueback.add(temp.right);
            }
            res.add(ans);
            if(queueback.isEmpty())
                return res;
            queue=queueback;
            // while(!queueback.isEmpty())
            //     queue.add(queueback.poll());


        }

    }
}
