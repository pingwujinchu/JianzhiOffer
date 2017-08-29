import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FourSplit {
	   Map map;
	   Map value;
       public boolean canSplitFourPart(int [] arr){
    	   boolean canSplit = false;
    	   map = new HashMap();
    	   value  = new HashMap();
    	   
    	   findAll(arr,0,arr.length - 1,0,0);
    	   Iterator it = map.keySet().iterator();
    	   while(it.hasNext()){
    		   int i = (Integer)it.next();
    		   int j = (Integer)map.get(i);
    		   int currValue = (Integer) value.get(i);
    		   int newi = i + 1;
    		   int newj = j - 1;
    		   int befor = 0;
    		   int end = 0;
    		   while(newi < newj -1){
    			   befor = befor + arr[newi];
    			   end = befor + arr[newj];
    			   if(befor < end){
    				   newi ++;
    			   }
    			   if(end > befor){
    				   newj --;
    			   }
    			   if(end == befor){
    				   newi ++;
    				   newj --;
    			   }
    		   }
    		   if(befor == end && befor == currValue){
    			   return true;
    		   }else{
    			   continue;
    		   }
    	   }
    	   return canSplit;
       }
       
       public void findAll(int [] arr,int i , int j,int befor ,int end){
    	   if(i < j){
    		   befor = befor + arr[i];
    		   end = end + arr[j];
    		   if(befor == end){
    		     map.put(i, j);
    		     value.put(i, befor);
    		     findAll(arr,i+1,j-1,befor,end);
    		   }else{
    			   if(befor > end){
    				   findAll(arr,i,j-1,befor,end);
    			   }else{
    				   findAll(arr,i+1,j,befor,end);
    			   }
    		   }
    	   }    	   
       }
       
       public static void main(String[]args){
//    	   FourSplit fs = new FourSplit();
//    	   System.out.println(fs.canSplitFourPart(new int[]{1,2,3,5,1,2,3,5,1,2,3,5,1,2,3}));
    	  
    	        int[] input = {2,5,1,1,1,1,4,3,7,5,7};  
    	        int[] sums = new int[input.length];  		//存储前n项之和
    	        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();  
    	  
    	        int tmp = 0;  
    	        for (int i = 0; i < input.length; ++i) {  
    	            tmp += input[i];  
    	            sums[i] = tmp;  
    	            hashMap.put(tmp, i);  
    	        }  
    	  
    	        for (int pos1 = 1; pos1 < input.length; ++pos1) {  
    	            int sum = sums[pos1] - input[pos1];  
    	            if (hashMap.containsKey(sum + sums[pos1])) {  
    	                int pos2 = hashMap.get(sum + sums[pos1]) + 1;  
    	                if (pos2 < input.length && hashMap.containsKey(sum + sums[pos2])) {  
    	                    int pos3 = hashMap.get(sum + sums[pos2]) + 1;  
    	                    if (pos3 < input.length && sums[sums.length - 1] - sums[pos3] == sum) {  
    	                        System.out.println("result:"+pos1 + "---"+pos2+"----"+pos3);  
    	                        return;  
    	                    }  
    	                }  
    	            }  
    	        }  
    	        return;  
    	  
    	    
       }
}
