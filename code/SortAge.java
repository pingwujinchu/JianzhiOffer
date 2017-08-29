import java.util.Arrays;

public class SortAge {
	
	public static void sortAge(int []ages) throws Exception{
		if(ages == null || ages.length == 0){
			return;
		}
		int oldestAge = 99;
		int timesOfAge[] = new int[oldestAge + 1];
		for(int i = 0 ; i < ages.length ; i++){
			int age = ages[i];
			if(age <0 || age > oldestAge){
				throw new Exception("age out of range.");
			}
			timesOfAge[age]++;
		}
		
		int index = 0;
		for(int i = 0 ; i <= oldestAge ; i++){
			for(int j = 0; j < timesOfAge[i] ; j++){
				ages[index++] = i;
			}
		}
	}
	
	public static void main(String []args){
		try {
			int []ages = new int[]{1,2,5,9,3,6,5,3,2,1,5};
			SortAge.sortAge(ages);
			System.out.println(Arrays.toString(ages));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
