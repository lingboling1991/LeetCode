package TRY.reverse_linked_list;

public class Solution {//这个题看了Hints，使用了递归，注意函数返回的是转过来的链表的头
	public static ListNode reverseList(ListNode head) {

		if (head == null) {
			return null;
		}

		if (head.next == null) {
			return head;
		} else {
			ListNode newHead = reverseList(head.next);
			// 找到newHead的尾节点，把head填到尾节点的next上
			ListNode tmp = newHead;
			while (tmp.next != null) {
				tmp = tmp.next;
			}
			tmp.next=head;
			head.next=null;//这里需要把新尾的next置null，不然的话，会变成新尾指旧尾，死循环
			return newHead;
		}
	}

	public static void main(String args[]) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		ListNode e = new ListNode(5);
		ListNode f = new ListNode(6);

		a.setNext(b);
		b.setNext(c);
		c.setNext(d);
		d.setNext(e);
		e.setNext(f);
		f.setNext(null);

		ListNode res = reverseList(a);
		System.out.println(res.val);
		System.out.println(res.next.val);
		System.out.println(res.next.next.val);
		System.out.println(res.next.next.next.val);
		System.out.println(res.next.next.next.next.val);
		System.out.println(res.next.next.next.next.next.val);
	}
}
