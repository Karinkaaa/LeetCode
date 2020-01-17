package tasks.easy;

public class Task66 {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 9};

        arr = plusOne(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] plusOne(int[] digits) {

        int length = digits.length;

        if (digits[length - 1] == 9) {

            digits[length - 1] = 0;

            for (int i = length - 2; i >= 0; i--) {

                if (digits[i] == 9) {
                    digits[i] = 0;
                } else {
                    digits[i]++;
                    break;
                }
            }

            if (digits[0] == 0) {

                System.arraycopy(digits, 0, digits = new int[length + 1], 1, length);
                digits[0] = 1;
            }
        } else {
            digits[length - 1]++;
        }
        return digits;
    }
}