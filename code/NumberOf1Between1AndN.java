
public class NumberOf1Between1AndN {
	public int numberOf1(int n){
		return numberOf1(String.valueOf(n));
		}
	
	public int numberOf1(String str){
		if(str == null){
			return 0;
		}
		int curr = Integer.parseInt(str);
		if(curr == 0){
			return 0 ;
		}
		if(curr > 0 && curr < 9){
			return 1;
		}
		int numFirstDigit = 0;
		int first = str.charAt(0);
		int firstNum = Integer.parseInt(String.valueOf(first));
		if(firstNum > 1){
			 numFirstDigit =  (int) Math.pow(10, str.length()-1);
		}else if(firstNum == 1){
			numFirstDigit = Integer.parseInt(str.substring(1, str.length()))+1;
		}
		
		int numOtherDigit = (int) (curr * (str.length()-1)*Math.pow(10,(str.length()-2)));
		
		int low = numberOf1(str.substring(1, str.length()));
		
		return numFirstDigit + numOtherDigit + low;
	}
	
	public static void main(String []args){
		NumberOf1Between1AndN nm = new NumberOf1Between1AndN();
		System.out.println(nm.numberOf1(21345));
	}
}
