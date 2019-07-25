package tasks.easy;

public class Task14 {

    public static String longestCommonPrefix(String[] strs) {

        String res = "";

        if (strs.length == 1) {
            return strs[0];
        }

        if (strs.length > 0) {

            int minSize = strs[0].length();

            for (int i = 1; i < strs.length; i++) {

                if (minSize > strs[i].length()) {
                    minSize = strs[i].length();
                }
            }

            boolean isEquals = false;
            char letter;

            for (int indexOfLetter = 0; indexOfLetter < minSize; indexOfLetter++) {

                letter = strs[0].charAt(indexOfLetter);

                for (int indexOfArray = 1; indexOfArray < strs.length; indexOfArray++) {

                    if (letter == strs[indexOfArray].charAt(indexOfLetter)) {
                        isEquals = true;
                    } else {
                        return res;
                    }
                }

                if (isEquals) {
                    res += letter;
                }
            }
        }
        return res;
    }
}
