package baekjoonTest3;

import java.util.*;

public class charAndString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		String S = new String();
		System.out.print("영어 소문자와 대문자로만 이루어진 단어를 적으시오 : ");
		S = scanner.next();
		n = Integer.parseInt(scanner.nextLine());
		
		scanner.close();
		System.out.println(S.charAt(n-1));
		

	}

}
