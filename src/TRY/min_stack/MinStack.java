package TRY.min_stack;

public class MinStack {

    int n = 0;
    int[] m = new int[9999999];
    int min = 0;// 这个是最小值所在的位置，不是最小值本身

    public void push(int x) {
        m[n] = x;
        if (x <= m[min]) {
            min = n;
        }
        n++;
    }

    public void pop() {
        n--;
    }

    public int top() {
        return m[n];
    }

    public int getMin() {
        return min;
    }

}
