package tasks.easy;

public class Task101 {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static boolean isSymmetric(TreeNode root) {

        if (root == null) return true;

        return isEquals(root.left, root.right);
    }

    public static boolean isEquals(TreeNode leftNode, TreeNode rightNode) {

        if (leftNode == null && rightNode == null) return true;
        if (leftNode == null || rightNode == null) return false;

        boolean equalsDeep = isEquals(rightNode.left, leftNode.right) &&
                isEquals(rightNode.right, leftNode.left);

        return leftNode.val == rightNode.val && equalsDeep;
    }
}
