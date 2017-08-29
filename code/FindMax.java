import java.util.Arrays;
import java.util.Comparator;

public class FindMax {
      public static String getMax(int []nums){
    	  String []str = new String[nums.length];
    	  for(int i = 0 ; i < nums.length ; i++){
    		  str[i] = String.valueOf(nums[i]);
    	  }
    	  Arrays.sort(str, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return (o2.compareTo(o1));
			}     
    	  });
    	  StringBuilder strBuilder = new StringBuilder();
    	  for(int j= 0 ; j < nums.length ; j++){
    		  strBuilder.append(str[j]);
    	  }
    	  return strBuilder.toString();
      }
      
      
      public static void main(String[]args){
    	  int []nums = new int[]{3,32,321};
    	  System.out.println(getMax(nums));
    	  String str = "32";
    	  String str2 = "221";
    	  System.out.println(str.compareTo(str2));
      }
}
