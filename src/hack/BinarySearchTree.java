package hack;

class Tree2 {
	
	private TreeNode2 root;
	
	public void insert(int value) {
		if (root == null) {
			root = new TreeNode2(value);
		} else {
			root.insert(value);
		}
	}
	
	public int min() {
		if (root == null) {
			return Integer.MIN_VALUE;
		} else {
			return root.min();
		}
	}
	
	public int max() {
		if (root == null) {
			return Integer.MAX_VALUE;
		} else {
			return root.max();
		}
	}
	
	public void traverseInOrder() {
		if (root != null) {
			root.traverseInOrder();
		}
	}
	
	public TreeNode2 get (int value) {
		if (root != null) {
			return root.get(value);
		}
		
		return null;
	}
}

class TreeNode2 {

	private int data;
	private TreeNode2 leftChild;
	private TreeNode2 rightChild;
	
	public void insert(int value) {
		if (value == data) {
			return;
		}
		
		if (value < data) {
			if (leftChild == null) {
				leftChild = new TreeNode2(value);
			} else {
				leftChild.insert(value);
			}
		} else {
			if (rightChild == null) {
				rightChild = new TreeNode2(value);
			} else {
				rightChild.insert(value);
			}
		}
	}
	
	public int min() {
		if (leftChild == null) {
			return data;
		} else {
			return leftChild.min();
		}
	}
	
	public int max() {
		if (rightChild == null) {
			return data;
		} else {
			return rightChild.max();
		}
	}
	
	public void traverseInOrder() {
		if (leftChild != null) {
			leftChild.traverseInOrder();
		}
		System.out.print(data + ", ");
		if (rightChild != null) {
			rightChild.traverseInOrder();
		}
	}
	
	public TreeNode2 get (int value) {
		if (value == data) {
			return this;
		}
		
		if (value < data) {
			if (leftChild != null) {
				return leftChild.get(value);
			}
		} else {
			if (rightChild != null) {
				return rightChild.get(value);
			}
		}
		
		return null;
	}

	public TreeNode2 (int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode2 getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode2 leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode2 getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode2 rightChild) {
		this.rightChild = rightChild;
	}

	@Override
	public String toString() {
		return "Data = " + data;
	}
}

public class BinarySearchTree {

	public static void main(String[] args) {
		Tree2 intTree = new Tree2();
		intTree.insert(25);
		intTree.insert(20);
		intTree.insert(15);
		intTree.insert(27);
		intTree.insert(30);
		intTree.insert(29);
		intTree.insert(26);
		intTree.insert(22);
		intTree.insert(32);
		intTree.insert(17);
		
		/*
		intTree.traverseInOrder();
		System.out.println();
		
		System.out.println(intTree.get(27));
		System.out.println(intTree.get(17));
		System.out.println(intTree.get(8888));
		*/
		
		System.out.println(intTree.min());
		System.out.println(intTree.max());
	}
}
