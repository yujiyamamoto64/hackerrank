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
	
	public void traverseInOrder() {
		if (root != null) {
			root.traverseInOrder();
		}
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
	
	public void traverseInOrder() {
		if (leftChild != null) {
			leftChild.traverseInOrder();
		}
		System.out.print(data + ", ");
		if (rightChild != null) {
			rightChild.traverseInOrder();
		}
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
		
		intTree.traverseInOrder();
	}
}
