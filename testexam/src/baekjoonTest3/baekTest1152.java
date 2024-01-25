package baekjoonTest3;

import java.util.*;

public class baekTest1152 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String strLine = scanner.nextLine();
		scanner.close();
		
		StringTokenizer st = new StringTokenizer(strLine," ");
		
		System.out.print(st.countTokens());
		
	}

}
