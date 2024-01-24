package CodingTest1;

import java.util.*;

public class wordbook {

	public static void main(String[] args) {
		myWordbook mybook = new myWordbook();
		Scanner sc = new Scanner(System.in);
		while(true) {
			mybook.Menu();
			
			int select = sc.nextInt();
			
			switch(select){
			case 1:
				mybook.addWord();
				break;
			case 2:
				mybook.searchWord();
				break;
			case 3:
				mybook.deleteWord();
				break;
			case 4:
				mybook.test();
				break;
			case 5:
				mybook.wordList();
				break;
			case 6:
				mybook.exit();
				break;
			} 
			if(select>6) {
				System.out.println("1~6까지의 숫자만 입력하시오 >>> ");
			}
		}
	}

}
