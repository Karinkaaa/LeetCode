package tasks.easy;

public class Task112 {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static boolean hasPathSum(TreeNode root, int sum) {

        if (root == null) return false;

        return checkPathSum(root, 0, sum);
    }

    public static boolean checkPathSum(TreeNode root, int sum, int target) {

        if (root == null) return false;

        sum += root.val;

        if (sum == target && root.left == null && root.right == null) {
            return true;
        }

        return checkPathSum(root.left, sum, target) || checkPathSum(root.right, sum, target);
    }
}