
public class MoreThanHalfNum {
		public int moreThanHalfNum(int []nums){
			if(nums == null || nums.length == 0){
				return 0;
			}
			int times = 0;
			int curr = 0;
			
			for(int i = 0 ; i < nums.length ; i++){
				if(times == 0){
					curr = nums[i];
					times ++;
				}else if(curr == nums[i]){
					times ++;
				}else{
					times --;
				}
			}
			return curr;
		}
		
		public int moreThanHalfNum2(int []nums){
			if(nums == null || nums.length == 0){
				return 0;
			}
			int start = 0;
			int end = nums.length -1;
			int middle = (start + end)/2;
			int index = partion(nums,start,end);
			while(index != middle){
				if(index > middle){
					end = index - 1;
					index = partion(nums,start,end);
				}else{
					start = index +1;
					index = partion(nums,start,end);
				}
			}
			int result = nums[middle];
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
			swap(nums,start,i);
			return i;
		}
		
		public void swap(int []nums, int start , int end){
			int tem = nums[start];
			nums[start] = nums[end];
			nums[end] = nums[start];
		}
		
		public static void main(String []args){
			MoreThanHalfNum mtl = new MoreThanHalfNum();
			int result = mtl.moreThanHalfNum(new int[]{1,2,2,3,5,6,8,2,2,2,2});
			System.out.println(result);
			System.out.println(mtl.moreThanHalfNum2(new int[]{1,2,2,3,5,6,8,2,2,2,2}));
		}
}
