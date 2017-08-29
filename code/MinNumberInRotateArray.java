
public class MinNumberInRotateArray {
	
    public int minNumberInRotateArray(int [] array) {
        int i = 0;
        int j = array.length-1;
        while(i < j){
            int middle = (i + j) >>1;
            if(middle > i && array[middle]<array[i]){
                j = middle;
            }else if(middle > i&&array[middle]>array[i]){
                i = middle;
            }else if(i+1 == j){
                break;
            }
        }
        return array[j];
    }
    
    
    public static void main(String []args){
    	MinNumberInRotateArray m = new MinNumberInRotateArray();
    	System.out.println(m.minNumberInRotateArray(new int[]{3,4,5,7,8,9,1,2}));
    }
}
