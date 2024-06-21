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
		
		public int getData() {
			return data;
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
		
		
		//Binary search
		public Node binarySearch(int key) {
			Node trav = root;
			//check root
			while(trav != null) {
				if(trav.data == key)//check if key is equal to current
					return trav;//yes then return current node
				else if(key < trav.data) {//check if key is less than current data
					trav = trav.left;//switch trav to left 
				}else {//if key is greater than current data
					trav = trav.right;//switch trav to right
					
				}
				
			}
			return null;//if not key is not found then return null
		}
		
		//Binary search using recursion
		public Node binarySearchRecursion(int key) {
			return binarySearchRecursion(root, key);
		}
		
		//Binary search using recursion function
		public Node binarySearchRecursion(Node trav, int key) {
			//if current data is equal to key return current Node
			if(trav.data == key)
				return trav;
			else if(key < trav.data) {
				
			}
			
			return null;
		}
		
		
		//binary search with parent
		public Node[] binarySearchWithParent(int key) {
			//create trav and parent
			Node trav = root;
			Node parent = null;
			//run loop until current node becomes empty
			while(trav != null) {
				//check current node data with key
				if(key == trav.data)
					break;
				//if not then make it parent
				parent = trav;
				if(key < trav.data) {//if key is less than current data
					trav = trav.left;//switch to left
				}else {//if key is greater than current data
					trav = trav.right;//switch to right
				}
			}
			
			if(trav == null)
				return null;
			
			return new Node[] {trav, parent}; 
			
		}
		
		//delete Node from tree
		public void deleteNode(int key) {
			//1. search Node with it's parent
			Node arr[] = binarySearchWithParent(key);
			//save key's Node to temp
			Node temp = arr[0];
			//save parent
			Node parent = arr[1];
			
			//2. if Node is not found
			if(temp == null) {
				return;
			}
			
			//3. if Node has 2 childs
			if(temp.right != null && temp.left != null) {
				//1. find the predecessor of temp.data
				Node pred = temp.left;
				parent = temp;
				while(pred.right != null) {
					parent = pred;
					pred = pred.right;
				}
				//2. replace temp's data by predecessor's data
				temp.data = pred.data;
				//3. delete predecessor
				temp = pred;
			}
			
			
			//delete node which has single child (child Right)
			if(temp.left == null) {//if current Node does not have left Node
				if(temp == root)//if current Node is equal to root
					root = temp.right;//then save right Node to the root
				else if(temp == parent.left)//if current Node is equal to parent left
					parent.left = temp.right;//then save current Node's right to Parent left
				else if(temp == parent.right)//if current Node is equal to parent right
					parent.right = temp.right;//then save current Node's right to parent right
			}
			
			//delete node which has single child (child Left)
			if(temp.right == null) {//if current Node does not have right Node
				if(temp == root)//if current Node is equal to root
					root = temp.right;//then save right Node to the root
				else if(temp == parent.left)//if current Node is equal to parent left
					parent.left = temp.left;//then save current Node's left to Parent right
				else if(temp == parent.right)//if current Node is equal to parent right
					parent.right = temp.left;//then save current Node's left to parent right
			}
		}
		
		
		
		//Binary search using recursion
		public Node binarySearchWithRecursion(int key) {
			return SearchRecursion(root, key);
		}
		
		//Binary search recursion function
		public Node SearchRecursion(Node trav, int key) {
			//terminating condition
			if(trav == null)
				return null;
			
			//if value is equal to current Node data
			if(key == trav.data)
				return trav;//than return current Node
			else if(key < trav.data)//if value is less than current Node
				return SearchRecursion(trav.left, key);//then go to left Node
			else//if value is greater than current Node
				return SearchRecursion(trav.right, key);//then go to right Node
				
		}

}
