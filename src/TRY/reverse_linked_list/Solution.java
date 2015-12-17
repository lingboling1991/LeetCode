package TRY.reverse_linked_list;

public class Solution {//����⿴��Hints��ʹ���˵ݹ飬ע�⺯�����ص���ת�����������ͷ
	public static ListNode reverseList(ListNode head) {

		if (head == null) {
			return null;
		}

		if (head.next == null) {
			return head;
		} else {
			ListNode newHead = reverseList(head.next);
			// �ҵ�newHead��β�ڵ㣬��head�β�ڵ��next��
			ListNode tmp = newHead;
			while (tmp.next != null) {
				tmp = tmp.next;
			}
			tmp.next=head;
			head.next=null;//������Ҫ����β��next��null����Ȼ�Ļ���������βָ��β����ѭ��
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
