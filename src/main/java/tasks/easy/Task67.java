package tasks.easy;

public class Task67 {

    public static void main(String[] args) {

        System.out.println(addBinary("11", "1001"));

    }

    public static String addBinary(String a, String b) {

        String res = "";

        int lengthA = a.length() - 1;
        int lengthB = b.length() - 1;
        int nextAdd = 0;

        char value;

        while (true) {

            if (lengthA < 0 && lengthB < 0) break;

            if (lengthA >= 0) {

                if (nextAdd == 0) {
                    value = a.charAt(lengthA);
                } else {
                    if (a.charAt(lengthA) == '1') {
                        value = '0';
                        nextAdd = 1;
                    } else {
                        value = '1';
                        nextAdd = 0;
                    }
                }
                lengthA--;

            } else {

                if (nextAdd == 0) value = '0';
                else value = '1';
            }

            if (lengthB >= 0) {

                if (value == '0') {
                    value = b.charAt(lengthB);
                } else {
                    if (b.charAt(lengthB) == '1') {
                        value = '0';
                        nextAdd = 1;
                    } else {
                        value = '1';
                        nextAdd = 0;
                    }
                }
                lengthB--;
            }

            res += value;
        }

        if (nextAdd == 1) {
            res += '1';
        }

        return new StringBuilder(res).reverse().toString();
    }
}
