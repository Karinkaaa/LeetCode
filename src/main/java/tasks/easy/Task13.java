package tasks.easy;

import java.util.HashMap;
import java.util.Map;

public class Task13 {

    public static int romanToInt(String s) {

        Map<String, Integer> map = new HashMap<>(7);
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        if (s.length() == 1) {
            return map.get(s);
        }

        int res = 0;
        String tmp = new StringBuilder(s).reverse().toString();

        for (int i = 0; i < s.length() - 1; i++) {

            int firstNum = map.get(tmp.substring(i, i + 1));
            int secondNum = map.get(tmp.substring(i + 1, i + 2));

            if (i == 0) {
                res = firstNum;
            }

            if (firstNum > secondNum) {
                res -= secondNum;
            } else {
                res += secondNum;
            }
        }

        return res;
    }
}
