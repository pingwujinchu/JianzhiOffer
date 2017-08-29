
public class BSTToDoubleSideList{
		class BinaryTreeNode{
			int value;
			BinaryTreeNode left;
			BinaryTreeNode right;
		}
		
		public BinaryTreeNode convert(BinaryTreeNode root){
			BinaryTreeNode lastNode = null;
			convert(root,lastNode);
			while(lastNode.left!= null){
				lastNode = lastNode.left;
			}
			return lastNode;
		}
		public void convert(BinaryTreeNode root,BinaryTreeNode lastNode){
			if(root == null ){
				return;
			}
			
			BinaryTreeNode curr = root;
			
			if(curr.left != null){
				convert(curr.left,lastNode);
			}
			
			curr.left = lastNode;
			
			if(lastNode != null){
				lastNode.right = curr;
			}
			
			lastNode = curr;
			
			if(curr.right != null){
				convert(curr.right,lastNode);
			}
		}
		
		public static void main(String []args){
			
		}
}
