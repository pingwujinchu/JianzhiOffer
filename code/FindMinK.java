import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMinK {
	public List<Integer> getMinK(int []nums,int k){
		int index = partion(nums,0,nums.length-1);
		int start = 0;
		int end = nums.length - 1;
		while(index != k - 1){
			if(index > k-1){
				end = index -1;
				index = partion(nums,start,end);
			}else{
				start = index + 1;
				index = partion(nums,start,end);
			}
		}
		List result = new ArrayList();
		for(int i = 0 ; i < k ; i++){
			result.add(nums[i]);
		}
		return result;
	}
	
	public int partion(int [] nums,int start,int end){
		int middle = (start + end)/2;
		int i = start + 1;
		int j = end;
		int pivot = nums[middle];
		swap(nums,start,middle);
		while(i < j){
			while(nums[j] > pivot){
				j --;
			}
			while(i < j && nums[i] <= pivot){
				i ++;
			}
			if(i > j){
				i --;
			}
			swap(nums,i,j);
		}
		if(i > j){
			i --;
		}
		swap(nums,start,i);
		return i;
	}
	
	public void swap(int []nums,int start,int end){
		int tem = nums[start];
		nums[start] = nums[end];
		nums[end] = tem;
	}
	
	public static void main(String []args){
		FindMinK fk = new FindMinK();
		List l = fk.getMinK(new int[]{9,8,5,9,8,7,3,4,6,2,7,1}, 5);
		System.out.println(Arrays.toString(l.toArray()));
	}
}
