import java.util.Arrays;

public class QuickSort {
       public static void quickSort(int []arrays,int start,int end){
    	   if(start == end){
    		   return;
    	   }
    	   int index = partion(arrays,start,end);
    	   if(index > start){
    		   quickSort(arrays,start,index - 1);
    	   }
    	   if(index < end){
    		   quickSort(arrays,index +1 , end);
    	   }
       }
       
       public static int partion(int[] arrays,int start,int end){
   
    	   int pivot = arrays[start];
    	   int i = start + 1;
    	   int j = end;
    	   while(i < j){
	    	   while(arrays[j] > pivot){
	    		   j --;
	    	   }
    	   
	    	   while(i < j && arrays[i] <= pivot){
	    		   i ++;
	    	   }
	    	   if(i > j){
	    		   i--;
	    	   }
	    	   swap(arrays,i,j);
    	   }
    	   swap(arrays,start,i);
    	   return i;
       }
       
       public static void swap(int []arrays,int start,int end){
    	   int tem = arrays[start];
    	   arrays[start] = arrays[end];
    	   arrays[end] = tem;
       }
       
       public static void swap(String []arrays,int start,int end){
    	   String tem = arrays[start];
    	   arrays[start] = arrays[end];
    	   arrays[end] = tem;
       }
       
       public static void main(String []args){
    	   int arrays[] = new int[]{10,4,6,8,25};
    	   QuickSort.quickSort(arrays, 0, arrays.length - 1);
    	   System.out.println(Arrays.toString(arrays));
       }
       
}
