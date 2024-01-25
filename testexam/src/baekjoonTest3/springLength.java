package baekjoonTest3;

import java.util.*;

public class springLength {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String text = new String();
		text = scanner.nextLine();
		
		scanner.close();
		int num = text.length();
		
		System.out.println(num);
	}

}
