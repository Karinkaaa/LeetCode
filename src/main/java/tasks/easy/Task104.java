package tasks.easy;

public class Task104 {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static int maxDepth(TreeNode node) {

        if (node == null) return 0;

        return Math.max(maxDepth(node.left), maxDepth(node.right)) + 1;
    }
}