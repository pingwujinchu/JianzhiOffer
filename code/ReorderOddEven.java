import java.util.Arrays;

public class ReorderOddEven {
       public static void reorder(int []arr){
    	   int i = 0;
    	   int j = arr.length - 1;
    	   
    	   while(i < j){
	    	   while(j > i && arr[j] % 2 == 0){
	    		   j --;
	    	   }
    	   
	    	    while(i < j && arr[i] % 2 == 1){
	    		    i ++;
	    	    }
    	      swap(arr,i,j);
    	   }
       }
       
       public static void swap(int []arr,int i,int j){
    	   int tem = arr[i];
    	   arr[i] = arr[j];
    	   arr[j] = tem;
       }
       
       public static void main(String []args){
    	   int []arr =new int[]{1,2,3,4,5,6};
    	   reorder(arr);
    	   System.out.println(Arrays.toString(arr));
       }
}
