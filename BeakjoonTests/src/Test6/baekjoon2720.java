package Test6;

//그리디 알고리즘
import java.util.*;

public class baekjoon2720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int C;
		
		for(int i = 0; i < tc; i++) {
			C = sc.nextInt();
			
			int quarter = C / 25;
			C %= 25;
			int dime = C / 10;
			C %= 10;
			int nickel = C / 5;
			C %= 5;
			int penny = C;
			
			System.out.println(quarter + " "+ dime +" "+ nickel +" " + penny);
			
			
		}	
		sc.close();	
		
	}

}
