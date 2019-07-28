package tasks.medium;

import java.util.HashMap;
import java.util.Map;

public class Task12 {

    public static void main(String[] args) {

        System.out.println(intToRoman(128));
    }


    public static String intToRoman(int num) {

        Map<Integer, String> map = new HashMap<>(7);
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");


        return "";
    }
}