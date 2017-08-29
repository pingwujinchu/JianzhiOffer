import java.math.BigInteger;

public class PrintN {
	public static void print(int n){
		BigInteger bi = new BigInteger("1");
		String max ="";
		for(int i = 0 ; i < n ; i++){
			max = max + "9";
		}
		BigInteger bi2 = new BigInteger(max);
		
		while(!bi.equals(bi2)){
			System.out.println(bi.toString());
			bi = bi.add(new BigInteger("1"));
		}
		System.out.println(bi.toString());
	}
	
	
	public static void main(String []args){
		print(6);
	}
}
