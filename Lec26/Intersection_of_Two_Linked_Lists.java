package Lec26;

public class Intersection_of_Two_Linked_Lists {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public class Solution {
		public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
			ListNode D = headA;
			ListNode DVGF = headB;
			while (D != DVGF) {
				if (D == null) {
					D = headB;
				} else {
					D = D.next;
				}
				if (DVGF == null) {
					DVGF = headA;
				} else {
					DVGF = DVGF.next;
				}
			}
			return D;
		}
	}

}
