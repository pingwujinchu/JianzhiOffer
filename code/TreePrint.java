import java.util.LinkedList;

public class TreePrint {
	    
		class TreeNode{
			int value;
			TreeNode left;
			TreeNode right;
			public TreeNode(int value) {
				super();
				this.value = value;
			}
		}
		
		public static void printTree(TreeNode root){
			LinkedList queue = new LinkedList();
			queue.offer(root);
			print(queue);
		}
		
		public static void print(LinkedList queue){
			TreeNode root;
			if(queue.isEmpty()){
				return;
			}else{
				root = (TreeNode) queue.poll();
			}
			if(root != null){
				System.out.println(root.value);
				if(root.left != null){
					queue.offer(root.left);
				}
				if(root.right != null){
					queue.offer(root.right);
				}
				print(queue);
			}else{
				return ;
			}
		}
		
		
		public static void main(String []args){
			TreeNode tree = new TreePrint().new TreeNode(10);
			TreeNode treel1 = new TreePrint().new TreeNode(9);
			TreeNode treer1 = new TreePrint().new TreeNode(8);
			TreeNode treel2 = new TreePrint().new TreeNode(7);
			TreeNode treer2 = new TreePrint().new TreeNode(6);
			TreeNode treel3 = new TreePrint().new TreeNode(5);
			TreeNode treer3 = new TreePrint().new TreeNode(4);
			TreeNode treel4 = new TreePrint().new TreeNode(3);
			TreeNode treer4 = new TreePrint().new TreeNode(2);
			TreeNode treel5 = new TreePrint().new TreeNode(1);
			tree.left = treel1;
			tree.right = treer1;
			treel1.left = treel2;
			treel1.right = treer2;
			printTree(tree);
		}
}
