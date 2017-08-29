
public class MinValue {
      public static int findMin(int [] arrays,int start,int end) throws Exception{
    	  if(arrays == null || arrays.length == 0){
    		  throw new Exception("Invalid parameters");
    	  }
    	  if(start == end -1){
    		  if(arrays[start] > arrays[end]){
    			  return arrays[end];
    		  }else{
    			  return arrays[start];
    		  }
    	  }
    	  int middle = (start + end)/2;
    	  if(arrays[middle] > arrays[start]){
    		  if(middle+1 < end){
    		     return findMin(arrays,middle+1,end);
    		  }else{
    			  return arrays[start];
    		  }
    	  }else{
    		  if(middle > start+1){
    		     return findMin(arrays,start + 1,middle);
    		  }else{
    			  return arrays[middle];
    		  }
    	  }
      }
      
      public static void main(String []args) throws Exception{
    	  int []arrays = new int[]{4,5,6,7,1,2,3};
    	  System.out.println(MinValue.findMin(arrays, 0, 6));
      }
}
