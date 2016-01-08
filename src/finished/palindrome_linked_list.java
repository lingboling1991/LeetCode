package finished;

import util.ListNode;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/1/7.
 */
public class palindrome_linked_list {
    public static boolean isPalindrome(ListNode head) {

        if (head == null)
            return true;

        ArrayList<Integer> x = new ArrayList<>();
        while (head != null) {
            x.add(head.val);
            head = head.next;
        }
        for (int j = 0; j < x.size() / 2; j++) {
            if (!(x.get(j).equals(x.get(x.size() - 1 - j))))//这里注意不要==，而要.equals
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(-10914);
        ListNode b = new ListNode(-10914);

        a.next = b;
        b.next = null;

        System.out.println(isPalindrome(a));
    }
}
