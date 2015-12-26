package finished;

import java.util.Stack;

/**
 * Created by Administrator on 2015/12/25.
 */
public class implement_queue_using_stacks {

    Stack<Integer> stack = new Stack<>();
    int low = 0, high = 0;

    // Push element x to the back of queue.
    public void push(int x) {
        stack.push(x);
        high++;
    }

    // Removes the element from in front of queue.
    public void pop() {
        low++;
    }

    // Get the front element.
    public int peek() {
        return stack.get(low);
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return high == low;
    }
}
