package Lec27;

import java.util.Stack;

public class Reverse_Nodes_in_k_Group {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {
		public ListNode reverseKGroup(ListNode head, int k) {
			Stack<ListNode> st = new Stack<>();
			ListNode Dummy = new ListNode();
			ListNode temp = Dummy;
			ListNode A = head;
			while (head != null) {
				int t = k;
				while (head != null && t > 0) {
					st.push(head);
					t--;
					head = head.next;
				}
				if (t == 0) {
					A = head;
					while (!st.isEmpty()) {
						ListNode rv = st.pop();
						Dummy.next = rv;
						Dummy = Dummy.next;
					}
					Dummy.next = null;
				} else {

					Dummy.next=A;
				}
			}
			return temp.next;

		}
	}

}
