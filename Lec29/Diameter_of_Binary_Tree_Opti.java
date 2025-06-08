package Lec29;

public class Diameter_of_Binary_Tree_Opti {
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
	    public int diameterOfBinaryTree(TreeNode root) {
	        
	    }
	    public DiaPair diameter(TreeNode root) {
	    	DiaPair ldp = diameter(root.left);
	    	DiaPair rdp = diameter(root.right);
	    	int sd = ldp.ht+ rdp.ht + 2;
	    	DiaPair sdp = new DiaPair();
	    	sdp.ht=
	    }
	    class DiaPair{
	    	int dt=0;// base case wali value
	    	int ht=-1;// base case wali value
	    	
	    }
	}
}









