
public class SearchInMatrix {
     public boolean search(int [][] matrix,int target){
    	    boolean result = false;
    	    int row = 0;
    	    if(matrix.length == 0){
    	    	return false;
    	    }
    	    int column = matrix[0].length - 1;
    	      while(row < matrix.length && column >= 0){
    	    	  if(matrix [row][column] == target ){
    	    		  return true;
    	    	  }else if(matrix[row][column] > target){
    	    		  column --;
    	    	  }else{
    	    		  row ++;
    	    	  }
    	      }
    	    
    	    return result;
     }
     
     public static void main(String []args){
    	 int [][] curr =new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
    	 SearchInMatrix sm = new SearchInMatrix();
    	 System.out.println(sm.search(curr, 6));
     }
}
