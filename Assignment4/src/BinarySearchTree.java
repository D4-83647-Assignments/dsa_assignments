//implementing Binary search tree
public class BinarySearchTree {
	//Node of tree 
	public static class Node{
		//lesser value left Node
		private Node left;
		//greater value right Node
		private Node right;
		//data of Node
		private int data;
		//initialize Node
		public Node(int value) {
			data = value;
			left = right = null;
		}
	}
	
	//root of tree
	private Node root;
			
	public BinarySearchTree() {
		root = null;
	}
	
	//check if tree is empty
	public boolean isEmpty() {
		return root == null;
	}
	
	//add Node into the tree
	public void addNodeFunction(int value) {
		//create Node
		Node newnode = new Node(value);
		
		//if tree is empty
		if(isEmpty()) {
			//add newnode to the root
			root = newnode;
		}else {//if tree is not empty
			//create trav
			Node trav = root;
			while(trav != null) {//while current Node not become null continue the loop
				//check if value is less than current data
				if(value < trav.data) {
					//check if left of current node is empty
					if(trav.left == null)
						trav.left = newnode;//add newnode to that left
					else {
						//go to left Node
						trav = trav.left;
					}
				}else if(value > trav.data){//if value is greater than current data
					//check if right of current Node is empty
					if(trav.right == null)
						trav.right = newnode;
					else {
						//if right of current Node has element then go to right
						trav = trav.right;
					}
				}
			}
			
		}
	}
	
	
	//add node using recursion
	public void addNode(int value) {
		//check is tree is empty
		if(isEmpty()) 
			root = new Node(value);
		else//is tree is not empty then add value to next node
			addNode(root, value);
	}
	
	//add Node recursion function
	public void addNode(Node trav, int value) {
		//check if value is less than current data
		if(value < trav.data) {
			if(trav.left == null)//check if left is empty
				trav.left = new Node(value);//yes then add to left
			else {//if left is not empty then send left
				addNode(trav.left, value);
			}
				
		}else {//if value is greater than current data
			if(trav.right == null)//check if right is empty
				trav.right = new Node(value);//yes then add to right
			else {//if right is not empty send right
				addNode(trav.right, value);
				
			}
		}
			
		
	}
	
	
	//display Inorder
	public void displayInorder() {
		System.out.print("Inorder: ");
		inOrder(root);
		System.out.println();
	}
	
	//display Inorder function [Left, Visit, Right]
	public void inOrder(Node trav) {
		if(trav == null)//if current Node is empty
			return;
		
		inOrder(trav.left);//Left
		System.out.print(" "+trav.data);//Visit
		inOrder(trav.right);//Right	
	}
	
	//display Preorder
	public void displayPreOrder() {
		System.out.print("Preorder: ");
		preOrder(root);
		System.out.println();
	}
	
	//display Preorder function [Visit, Left, Right]
	public void preOrder(Node trav) {
		//if current node is empty
		if(trav == null)
			return;
		
		System.out.print(" "+trav.data);//Visit
		preOrder(trav.left);//Left
		preOrder(trav.right);//Right
		
	}
	
	//display Postorder
		public void displayPostOrder() {
			System.out.print("Postorder: ");
			postOrder(root);
			System.out.println();
		}
		
		//display Postorder function [Left, Right, Visit]
		public void postOrder(Node trav) {
			//if current node is empty
			if(trav == null)
				return;
			
			preOrder(trav.left);//Left
			preOrder(trav.right);//Right
			System.out.print(" "+trav.data);//Visit
			
		}

}
