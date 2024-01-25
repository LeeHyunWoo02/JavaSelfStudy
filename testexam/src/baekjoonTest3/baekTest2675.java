package baekjoonTest3;

import java.util.*;

public class baekTest2675 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int testCase = scanner.nextInt();

		for(int i = 0; i < testCase; i++) {
			
			int rePeatCase = scanner.nextInt();
			String str = scanner.next();
			
			String newStr = "";
			for(int j = 0; j < str.length(); j++) {
				for(int k = 0; k<rePeatCase; k++) {
					newStr += str.charAt(j);
				}
			}
		
			System.out.println(newStr);
		}
		scanner.close();
		
	}

}
