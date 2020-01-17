package tasks.easy;

public class Task110 {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static int maxDepth(TreeNode root) throws Exception {

        if (root == null) return 0;

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        if (Math.abs(leftDepth - rightDepth) > 1) {
            throw new Exception();
        }

        return Math.max(leftDepth, rightDepth) + 1;
    }

    public static boolean isBalanced(TreeNode root) {

        try {
            maxDepth(root);
        } catch (Exception e) {
            return false;
        }

        return true;
    }
}
