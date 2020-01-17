package tasks.easy;

public class Task108 {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
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

                boolean equalsDeep = leftRightNull || bothLeftEquals || bothRightEquals;

                return other.val == this.val && equalsDeep;
            }
            return false;
        }

        @Override
        public String toString() {
            return this.val + "";
        }
    }

    // функция для получения высоты дерева
    private static int depth(TreeNode treeNode) {

        if (treeNode == null) return 0;
        return Math.max(depth(treeNode.left), depth(treeNode.right)) + 1;
    }

    // функция для правого поворота поддерева с корнем у
    private static TreeNode rightRotate(TreeNode root) {

        TreeNode node = root.left;
        TreeNode node2 = node.right;

        // вращение
        node.right = root;
        root.left = node2;

        // возвращаем новый корень
        return node;
    }

    // функция левого поворота поддерева с корнем x
    private static TreeNode leftRotate(TreeNode root) {

        TreeNode node = root.right;
        TreeNode node2 = node.left;

        // вращение
        node.left = root;
        root.right = node2;

        // возвращаем новый корень
        return node;
    }

    static TreeNode insert(TreeNode treeNode, int val) {

        // 1. Выполнить обычную вставку BST:
        if (treeNode == null)
            return (new TreeNode(val));

        if (val < treeNode.val)
            treeNode.left = insert(treeNode.left, val);
        else if (val > treeNode.val)
            treeNode.right = insert(treeNode.right, val);
        else
            return treeNode;

        // 2. Получить фактор баланса предка TreeNode, чтобы проверить, стал ли он несбалансированным:
        int balance = depth(treeNode.left) - depth(treeNode.right);

        // Если этот treeNode является несбалансированным, тогда есть 4 случая:

        // Left Left Case
        if (balance > 1 && val < treeNode.left.val)
            return rightRotate(treeNode);

        // Right Right Case
        if (balance < -1 && val > treeNode.right.val)
            return leftRotate(treeNode);

        // Left Right Case
        if (balance > 1 && val > treeNode.left.val) {
            treeNode.left = leftRotate(treeNode.left);
            return rightRotate(treeNode);
        }

        // Right Left Case
        if (balance < -1 && val < treeNode.right.val) {
            treeNode.right = rightRotate(treeNode.right);
            return leftRotate(treeNode);
        }

        // возвращаем неизменный указатель treeNode
        return treeNode;
    }


    public static TreeNode sortedArrayToBST(int[] nums) {

        if (nums.length == 0) return null;

        TreeNode treeNode = new TreeNode(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            treeNode = insert(treeNode, nums[i]);
        }

        return treeNode;
    }
}