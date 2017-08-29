
public class BackTraceBinaryTree {
          public static boolean isBackTraceBinaryTree(int[]list){
        	  boolean isBackTraceBinaryTree = false;
        	  isBackTraceBinaryTree = isMatch(list,0,list.length - 1);
        	  
        	  return isBackTraceBinaryTree;
          }
          
          public static boolean isMatch(int []list,int start,int end){
        	  boolean result = true;
        	  if(start == end){
        		  return true;
        	  }
        	  int curr = list[end];
        	  
        	  int currLeft = 0;
        	  int currRight =0;
        	  int i = 0;
        	  for( ; i < end ; i++){
        		  if(list[i] > curr){
        			  currLeft = i - 1;
        			  break;
        		  }
        	  }
        	  int j = i;
        	  for(;j < end; j++){
        		  if(list[j]<curr){
        			  return false;
        		  }
        	  }
        	  currRight = currLeft + 1;
        	  if(currLeft > start){
        		  result  &=  isMatch(list,start,currLeft);
        	  }
        	  if(currRight < end){
        		  result &=  isMatch(list,currRight,end - 1);
        	  }
        	  return result;
          }
          
          
          public static void main(String []args){
        	  System.out.println(isBackTraceBinaryTree(new int[]{7,4,6,5}));
          }
}
