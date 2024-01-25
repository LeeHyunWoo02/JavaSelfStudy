package baekjoonTest3;

import java.util.*;

public class test9086 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int testCase = 0;
		System.out.println("TestCase >> ");
		testCase = scanner.nextInt();
		//if(testCase < 1 && testCase > 10) {
		//	System.out.println("범위 초과입니다. 프로그램 종료합니다.");
		//	System.exit(0);
		//}
		
		String[] arr = new String[testCase];
		System.out.println("String >> ");
		for(int i = 0; i < testCase; i++) {
			String tmp = scanner.next();
			arr[i] = tmp.substring(0,1) + tmp.substring(tmp.length()-1, tmp.length());
		}
		scanner.close();
		for(int i = 0; i < testCase; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
