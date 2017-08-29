import java.util.Random;

public class RandomMony {
	
	public static double getRandomMoney(int moneyPakage,double leaveMoney){
		if(moneyPakage == 1){
			moneyPakage --;
			return Math.round(leaveMoney*100)/100;
		}
		Random r = new Random();
		double min = 0.01;
		double max = leaveMoney / moneyPakage * 2;
		double money = r.nextDouble()*max;
		money = money <= min ? 0.01:money;
		moneyPakage --;
		leaveMoney -= money;
		System.out.println(money+"	");
		if(moneyPakage != 0 ){
			getRandomMoney( moneyPakage, leaveMoney);
		}
		return money;
	}
	
	public static void main(String []args){
	         System.out.println(RandomMony.getRandomMoney(10, 20));
	}
}
