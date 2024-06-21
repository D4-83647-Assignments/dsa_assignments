
public class Question2 {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		//adding Node
		bst.addNode(8);
		bst.addNode(3);
		bst.addNode(10);
		bst.addNode(6);
		bst.addNode(1);
		bst.addNode(14);
		bst.addNode(13);
		bst.addNode(7);
		bst.addNode(4);
		
		//calling recursive search function using object and returning it's node
		BinarySearchTree.Node node = bst.binarySearchWithRecursion(14);//searching for 
		
		//if node is null then key is not found
		if(node == null)
			System.out.println("key not found!");
		else//if node is not null then key is found
			System.out.print("key found!\nand Node data is: "+node.getData());

	}

}
