package Test6;
import java.util.*;

public class baekjoon26594 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int count = 1;
		
		for(int i = 0; i < str.length() - 1; i++) {
			char tmp = str.charAt(i);
			if(tmp == str.charAt(i+1)) {
				count++;
			} else {
				break;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
