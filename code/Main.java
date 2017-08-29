import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

/** 请完成下面这个函数，实现题目要求的功能 **/
 /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    static double leartCurve(double mu1, double sigma1, double mu2, double sigma2) {
    	 double n = 10000000;
         double count = 0;
         double i = n;
         Random random = new Random();
         
         
         while(i -- > 0){
             double x = getGaussValue(random.nextGaussian(), mu1, sigma1);
             double y = getGaussValue(random.nextGaussian(), mu2, sigma2);
             if(match(x, y)){
                 count++;
             }
         }

         return (double)count / n;

    }
    
    static double getGaussValue(double val, double mu, double sigma){
        return mu + sigma * val;
    }
    
    static boolean match(double x,double y){
        double x2 = x * x;
        double y2 = y * y;
        double z = x2 + y2 -1;
        return z * z  - x2 * y2  > 0 ? false:true;
    }

//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        double res;
//    
//        double _mu1;
//        _mu1 = Double.parseDouble(in.nextLine().trim());
//
//        double _sigma1;
//        _sigma1 = Double.parseDouble(in.nextLine().trim());
//
//        double _mu2;
//        _mu2 = Double.parseDouble(in.nextLine().trim());
//
//        double _sigma2;
//        _sigma2 = Double.parseDouble(in.nextLine().trim());
//  
//        res = leartCurve(_mu1, _sigma1, _mu2, _sigma2);
//        System.out.println(String.valueOf(res));
//    }
    
    public static void main(String []args){
    	System.out.println(leartCurve(0, 1, 0, 1));
    }
}
