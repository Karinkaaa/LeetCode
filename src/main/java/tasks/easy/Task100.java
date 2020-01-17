package tasks.easy;

public class Task100 {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

        @Override
        public boolean equals(Object obj) {

            if (obj instanceof TreeNode) {

                TreeNode other = (TreeNode) obj;

                boolean bothLeftIsNull = other.left == null && this.left == null;
                boolean bothRightIsNull = other.right == null && this.right == null;
                boolean bothLeftEquals = this.left != null && this.left.equals(other.left);
                boolean bothRightEquals = this.right != null && this.right.equals(other.right);
                boolean leftRightNull = bothLeftIsNull && bothRightIsNull;
                boolean leftRightEquals = bothLeftEquals && bothRightEquals;

                boolean equalsDeep = leftRightNull || leftRightEquals;

                return other.val == this.val && equalsDeep;
            }
            return false;
        }
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) return true;
        return p != null && p.equals(q);
    }
}