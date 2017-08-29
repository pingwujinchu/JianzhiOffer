import java.util.Arrays;

public class HeapSort {
    int heap[];
    int length;

	public void buildHeap(int []heap){
		this.heap = heap;
		this.length = heap.length;
		
		for(int j = heap.length - 1 ; j >= 0; j--){
			lift(j);
		}
	}
	
	public void lift(int i){
		while(i != 0){
			int father = i/2;
			if(heap[i] > heap[father]){
				swap(heap,i,father);
				i = father;
			}else{
				break;
			}
		}
	}
	
	public void swap(int []heap,int i,int j){
		int tem = heap[i];
		heap[i] = heap[j];
		heap[j] = tem;
	}
	
	public void sort(int []heap){
		buildHeap(heap);
		int []result = new int[heap.length];
		for(int i = 0 ; i < heap.length ; i++){
			result[i] = getMax();
		}
		heap = result;
	}
	
	public void downLift(int i){
		while(i < length){
			int left = 2*i;
			int right = 2*i + 1;
			if(left < length){
				if(right < length && heap[right] > heap[left]){
					if(heap[right] > heap[i]){
					   swap(heap,i,right);
					   i = right;
					}else{
						break;
					}
				}else{
					if(heap[left] > heap[i]){
						   swap(heap,i,left);
						   i = left;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
	}
	
	public int getMax(){
	    int result = heap[0];
	    swap(heap,0,length - 1);
	    length = length - 1;
	    downLift(0);
	    return result;
	}
	
	public boolean isEmputy(){
		return length==0?true:false;
	}
	
	
	public static void main(String []args){
		HeapSort hs = new HeapSort();
		int []arr = new int[]{1,8,5,6,9,4,2,3,5,8};
		hs.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
