
public class BitOperation {
    public static int numOfl(int n){
    	int count = 0;
    	while(n != 0){
    		if((n&1) > 0){
    			count ++;
    		}
    		n = n >>1;
    	}
    	return count;
    }
    
    public static int numOf1M(int n){
    	int count = 0;
    	while(n != 0){
    		count ++;
    		n = (n - 1)& n;
    	}
    	return count;
    }
    
    public static void main(String []args){
    	System.out.println(BitOperation.numOfl(2047));
    	System.out.println(BitOperation.numOf1M(2047));
    }
}
