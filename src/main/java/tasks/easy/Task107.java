package tasks.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task107 {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> resultList = new ArrayList<>();

        fillingList(root, resultList, 0);

        Collections.reverse(resultList);

        return resultList;
    }

    public static void fillingList(TreeNode node, List<List<Integer>> resultList, int depth) {

        if (node == null) return;

        boolean isCreated = resultList.size() < depth + 1;
        List<Integer> list = isCreated ? new ArrayList<>() : resultList.get(depth);

        if (isCreated) resultList.add(list);

        fillingList(node.left, resultList, depth + 1);
        fillingList(node.right, resultList, depth + 1);

        list.add(node.val);
    }
}
