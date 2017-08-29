
public class UglyNumber {
		public static int getUglyNumber(int num){
			int[]nums = new int[num];
			int index =0 ;
			nums[index++] = 1;
			int uglyNumber2 = 0;
			int uglyNumber3 = 0;
			int uglyNumber5 = 0;
			
			while(index < num){
				int min = finMin(nums[uglyNumber2] *2,nums[uglyNumber3] *3,nums[uglyNumber5] *5);
				nums[index++] = min;
				while(nums[uglyNumber2]*2 <= min){
					uglyNumber2 ++;
				}
				while(nums[uglyNumber3]*3 <= min){
					uglyNumber3 ++;
				}
				while(nums[uglyNumber5]*5 <= min){
					uglyNumber5 ++;
				}
			}
			return nums[num - 1];
		}
		public static int finMin(int nums1,int nums2,int nums3){
			int min = nums1;
			if(min > nums2){
				min = nums2;
			}
			if(min > nums3){
				min = nums3;
			}
			return min;
		}
		
		public static void main(String []args){
			System.out.println(getUglyNumber(7));
		}
}
