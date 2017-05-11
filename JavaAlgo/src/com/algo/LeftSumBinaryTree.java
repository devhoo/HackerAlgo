
public class LeftSumBinaryTree {
	
	int sum = 0;
	
	public int leftSum(BTree root , BTree parent){
		
		if(root != null){
			leftSum(root.left, root);
			if(root.left == null && root.right == null && parent.left == root){
				sum += root.data;
			}
			leftSum(root.right, root);
		}
		return sum;
		
	}
	
	
	public static void main(String[] args) {
		
		BTree root = new BTree(40);
		
		root.left = new BTree(30);
		root.right = new BTree(45);
		
		root.left.left = new BTree(25);
		root.left.right = new BTree(35);
		
		root.right.left = new BTree(50);
		
		LeftSumBinaryTree tree = new LeftSumBinaryTree();
		
		int gg = tree.leftSum(root, root);
		
		System.out.println(gg);
		
	}

}
