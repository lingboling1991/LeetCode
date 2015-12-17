package FIN.remove_linked_list_elements;

public class Solution {//���������ܸĽ�
	public static ListNode removeElements(ListNode head, int val) {

		if (head == null) {
			return null;
		} else if (head.next == null) {
			if (head.val == val) {
				return null;
			} else {
				return head;
			}
		}

		ListNode p = head;
		ListNode n = head.next;

		while (p.next != null) {//һֱѭ����p�ǽ�β�Ǹ��ڵ�
			if (head.val == val) {
				head = n;
				p = head;
			} else if (n.val == val) {
				p.next = n.next;
			} else {
				p = n;
			}
			n = n.next;
		}

		if (p.val == val) {//����pָ�������һ���������Ҳ��val����ô��Ҫɾ����
			if (head == p) {
				return null;
			} else {
				ListNode t = head;
				while (t.next != p) {
					t = t.next;
				}
				t.next = null;
			}
		}

		return head;
	}

	public static void main(String arg[]) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(1);
		// ListNode c = new ListNode(3);
		// ListNode d = new ListNode(1);
		// ListNode e = new ListNode(3);

		a.next = b;
		// b.next = c;
		// c.next = d;
		// d.next = e;

		ListNode next = removeElements(a, 1);
		System.out.println(next.val);
	}
}
