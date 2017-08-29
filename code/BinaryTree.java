
public class BinaryTree {
	   class TreeNode{
			int val;
			TreeNode left;
			TreeNode right;
			
			public TreeNode(int val) {
				super();
				this.val = val;
			}
		}
		
		public static TreeNode buildBinaryTree(int []first,int lstart,int lend,int []end,int rstart,int rend){
			int rootValue = first[lstart];
			BinaryTree bt = new BinaryTree();
			TreeNode root =bt.new TreeNode(rootValue);
			
			if(lstart > lend){
				return null;
			}
			int startInOrder = rstart;
			while(startInOrder < first.length && end[startInOrder] != rootValue){
				startInOrder ++;
			}
			
			if(startInOrder > rstart ){
				root.left = buildBinaryTree(first,lstart + 1,lstart + startInOrder - rstart,end,rstart,startInOrder - 1);
			}
			
			if(startInOrder < rend){
				root.right = buildBinaryTree(first,lstart + startInOrder - rstart +1 ,lend,end,startInOrder + 1,rend);
			}
			return root;
		}
		
		public static void print(TreeNode root){
			if(root != null){
				System.out.println(root.val);
				print(root.left);
				print(root.right);
			}
		}
		
		public static void printMiddle(TreeNode root){
			if(root != null){
				printMiddle(root.left);
				System.out.println(root.val);
				printMiddle(root.right);
			}
		}

		public static void main(String []args){
			BinaryTree.print(BinaryTree.buildBinaryTree(new int []{1,2,4,7,3,5,6,8}, 0, 7, new int []{4,7,2,1,5,3,6,8}, 0, 7));
			System.out.println("=========================");
			BinaryTree.printMiddle(BinaryTree.buildBinaryTree(new int []{1,2,4,7,3,5,6,8}, 0, 7, new int []{4,7,2,1,5,3,6,8}, 0, 7));
		}
}
