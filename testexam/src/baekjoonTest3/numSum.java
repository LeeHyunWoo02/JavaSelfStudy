package baekjoonTest3;

import java.util.*;

public class numSum {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int sum = 0;
		
		String numArr = scanner.next();
		
		scanner.close();
		
		for(int i = 0; i < num; i++) {
			int tmp = numArr.charAt(i) - 48;
			sum += tmp;
		}
	
		System.out.println(sum);
		
	}

}
/*
  charAt() 은 해당 문자의 아스키코드 값을 반환하므로 
  반드시 -48 또는 -'0' 을 해주어야 우리가 입력받은 숫자 값 그대로를 사용할 수 있다.
 */
