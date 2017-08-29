
public class MathPow {
    public static double pow(double base,int exponent){
    	double result = 0;
    	if(equals(base,0.0)){
    		return 0;
    	}
    	
    	int pow = exponent;
    	if(pow < 0){
    		pow = - pow;
    	}
    	
    	result = calPow(base,pow);
    	if(exponent < 0){
    		result = 1.0/result;
    	}
    	return result;
    }
    
    public static double calPow(double base,int exponent){
    	double result = 0;
    	if(exponent == 0){
    		return 1;
    	}
    	if(exponent == 1){
    		return base;
    	}
    	result = calPow(base,exponent >> 1);
    	result *= result;
    	
    	if((exponent & 1) > 0){
    		result *= base;
    	}
    	return result;
    }
    
    public static boolean equals(double db1,double db2){
    	if((db1 - db2)> - 0.0000001 && (db1 - db2)<0.0000001){
    		return true;
    	}else{
    		return false;
    	}
    }
    
    
    public static void main(String []args){
    	System.out.println(pow(2,-5));
    }
}
