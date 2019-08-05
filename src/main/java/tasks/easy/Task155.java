package tasks.easy;

public class Task155 {

    public static void main(String[] args) {

        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(1);
        minStack.push(2);

        System.out.println(minStack.top());

        minStack.pop();
        System.out.println(minStack.top());
    }
}

class MinStack {

    private int[] stack;
    private int counter = 0;

    MinStack() {
        stack = new int[2];
    }

    private void resize() {

        int[] tmp = stack;
        stack = new int[tmp.length + 10];

        System.arraycopy(tmp, 0, stack, 0, tmp.length);
    }

    void push(int x) {

        stack[counter++] = x;

        if (stack.length == counter) resize();
    }

    void pop() {
        counter--;
    }

    int top() {
        return stack[counter - 1];
    }

    int getMin() {

        int min = stack[0];

        for (int i = 1; i < counter; i++) {
            if (min > stack[i]) min = stack[i];
        }

        return min;
    }
}
