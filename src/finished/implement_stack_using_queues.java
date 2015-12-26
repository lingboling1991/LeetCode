package finished;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Administrator on 2015/12/26.
 */
public class implement_stack_using_queues {

    //这个解法比较正统，在leetcode提交历史中还可以看到另一种投机取巧的，是错误的
    Queue<Integer> queue = new LinkedList<>();

    // Push element x onto stack.
    public void push(int x) {
        queue.add(x);
        for (int i = 0; i < queue.size() - 1; i++) {
            int tmp = queue.poll();
            queue.add(tmp);
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        queue.poll();
    }

    // Get the top element.
    public int top() {
        return queue.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue.isEmpty();
    }
}
