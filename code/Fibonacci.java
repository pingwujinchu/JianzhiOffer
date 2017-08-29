
public class Fibonacci {
	public static long fibonacci(int n){
	    long fibNMinusOne = 1;
	    long fibNMinusTwo = 0;
	    long fibN = 0;
		if(n == 0){
	    	 return fibNMinusTwo;
	     }
		if(n == 1){
			return fibNMinusOne;
		}
		for(int i = 2 ; i <= n ; i ++){
			fibN = fibNMinusOne + fibNMinusTwo;
			fibNMinusTwo = fibNMinusOne;
			fibNMinusOne = fibN;
		}
	     
		return fibN;
	}
	
	public static void main(String []args){
		System.out.println(Fibonacci.fibonacci(12));
	}
}
