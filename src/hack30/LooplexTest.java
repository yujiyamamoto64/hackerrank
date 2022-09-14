package hack30;

class Tree {
	private LNode root;
	
	public void insert(String value) {
		if (root == null) root = new LNode(value);
		else root.insert(value);
	}
	
	public void traverseInOrder() {
		if (root != null) {
			root.traverseInOrder();
		}
	}
}

class LNode {

	private String data;
	private LNode right;
	private LNode left;
	
	public void traverseInOrder() {
		if (left != null) left.traverseInOrder();
		System.out.print(data + ", ");
		if (right != null) right.traverseInOrder();
	}
	
	public void insert(String value) {
		if (value == data) {
			return;
		}
		
		if (value.compareTo(data) > 1) {
			if (left == null) left = new LNode(value);
			else left.insert(value);
		}
		else {
			if (right == null) right = new LNode(value);
			else right.insert(value);
		}
	}

	public LNode(String data) {
		super();
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public LNode getRight() {
		return right;
	}

	public void setRight(LNode right) {
		this.right = right;
	}

	public LNode getLeft() {
		return left;
	}

	public void setLeft(LNode left) {
		this.left = left;
	}
	
}

public class LooplexTest {

	public static void main(String[] args) {
		Tree t = new Tree();
		t.insert("msg1");
		t.insert("msg2");
		t.insert("msg3");
		t.insert("msg4");
		t.insert("msg5");
		t.insert("msg6");
		
		t.traverseInOrder();
	}
}
