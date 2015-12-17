package FIN.intersection_of_two_linked_lists;

import java.util.HashMap;

public class Solution {

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		if (headA == null || headB == null) {
			return null;
		}

		HashMap<ListNode, Integer> a = new HashMap<>();// ����Ҫ��ƺã���Ϊp.next�϶���һ������Ϊ����ɻ�������p.val���ܻ�һ��������Ӧ����ListNode��Key
		ListNode p = headA;

		while (p.next != null) {
			a.put(p.next, p.val);
			p = p.next;
		}
		a.put(p.next, p.val);

		p = headB;

		while (p.next != null) {
			if (a.get(p.next) != null && a.get(p.next) == p.val) {// a.get(p.next) != null����ʡ�ԣ�����ᱨNullPointer�쳣
				return p;
			}
			p = p.next;
		}
		if (a.get(p.next) != null && a.get(p.next) == p.val) {
			return p;
		}

		return null;
	}

	public static void main(String arg[]) {

		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		ListNode e = new ListNode(5);
		// ListNode f = new ListNode(6);

		a.next = null;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = null;

		System.out.println(getIntersectionNode(a, b).val);

	}
}
