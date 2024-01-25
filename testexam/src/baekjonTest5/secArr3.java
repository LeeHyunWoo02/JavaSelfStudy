package baekjonTest5;

import java.util.*;

public class secArr3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char[][] strArrs = new char[5][15];
		int max = 0;
		
		for(int i = 0; i<5; i++) {
			String input = sc.next();
			max = Math.max(max, input.length());
			
			for(int j = 0; j<input.length(); j++) {
				strArrs[i][j] = input.charAt(j);
			}
		}
		
		for(int i = 0; i<max; i++) {
			for(int j=0; j<5; j++) {
				if(strArrs[i][j] == '\0') {
					continue;
				}
				System.out.print(strArrs[i][j]);
			}
		}
		sc.close();
	
	}

}
