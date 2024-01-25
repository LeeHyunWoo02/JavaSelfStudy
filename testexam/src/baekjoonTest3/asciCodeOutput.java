package baekjoonTest3;

import java.util.*;

public class asciCodeOutput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String rcArr = scanner.next();
		char rc = rcArr.charAt(0);
		
		scanner.close();
		
		System.out.println((int) rc);
		
	}

}
