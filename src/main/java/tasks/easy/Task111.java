package tasks.easy;

public class Task111 {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static int minDepth(TreeNode root) {

        if (root == null) return 0;

        if (root.left != null && root.right != null) {
            return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
        }

        if (root.left != null) {
            return minDepth(root.left) + 1;
        }

        if (root.right != null) {
            return minDepth(root.right) + 1;
        }

        return 1;
    }
}
