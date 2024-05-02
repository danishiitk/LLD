package tree;

import java.util.LinkedList;
import java.util.Queue;

//Given two nodes and root of the tree, return whether the 2 nodes are cousin or not
//Cousin: present in the same level and parent not same
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}
public class Cousin {
    public static boolean areCousin(TreeNode root, TreeNode a, TreeNode b){
        if(root == null)
            return false;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int size = q.size();
            TreeNode parentA = null; //To tell that a is found in the Next level and store its' parent
            TreeNode parentB = null; // Above comment for b
            for (int i=0;i<size;i++){
                TreeNode curNode = q.poll();
                //Add the next level nodes and also finding a and b at the same time
                if(curNode.left != null){
                    q.add(curNode.left);
                    if(curNode.left == a)
                        parentA = curNode;
                    else if (curNode.left == b) {
                        parentB = curNode;
                    }
                }
                if(curNode.right != null){
                    q.add(curNode.right);
                    if(curNode.right == a)
                        parentA = curNode;
                    else if (curNode.right == b) {
                        parentB = curNode;
                    }
                }
            }
            //After a level traversal check if found a and b in the next level with different parents
            if(parentA != parentB && parentA != null && parentB != null)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
//               5
//            6     7
//          8  9  10  11
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(6);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(11);

        System.out.println(areCousin(root, root.left, root.right));
        System.out.println(areCousin(root, root.left.left, root.right.right));
    }
}
