package TRY.min_stack;

public class MinStack {

	int n = 0;
	int[] m = new int[9999999];
	int min = 0;// �������Сֵ���ڵ�λ�ã�������Сֵ����

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
