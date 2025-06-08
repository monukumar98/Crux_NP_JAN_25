package Lec29;

import java.util.*;

public class Binary_Tree_Right_Side_View {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		int maximumdepth = 0;

		public List<Integer> rightSideView(TreeNode root) {
			List<Integer> ll = new ArrayList<>();
			righView(root, 1, ll);
			return ll;
		}

		public void righView(TreeNode root, int curr_level, List<Integer> ll) {
			if (root == null) {
				return;
			}
			if (maximumdepth < curr_level) {
				ll.add(root.val);
				maximumdepth = curr_level;
			}
			righView(root.right, curr_level + 1, ll);
			righView(root.left, curr_level + 1, ll);
		}
	}
}








