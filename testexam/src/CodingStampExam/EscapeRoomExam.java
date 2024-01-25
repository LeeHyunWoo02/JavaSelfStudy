/*
조건 1. 비밀번호는 3자리로 한다. 
2. 비밀번호를 1자리씩 입력하게 한다. (1개 입력하고 엔터 누르는 식) 
3. 비밀번호가 틀리면 처음부터 다시 입력하게 한다. 
4. 비밀번호가 맞으면 성공 메시지를 출력한다.
*/

package CodingStampExam;
import java.util.Scanner;
//import java.util.Random;

public class EscapeRoomExam extends EscapeRoom{

	public static void main(String[] args) {
		EscapeRoom er = new EscapeRoom();
		Scanner sc = new Scanner(System.in);
		
		String answer = "";
		int ansInt;
		while(true) {
			System.out.println("정답: "+er.getPassword());
			for(int i = 0 ; i<3 ;i++) {
				System.out.print("숫자를 하나씩 입력하시오>>");
				answer += sc.next();
			}
			ansInt = Integer.parseInt(answer);
			
			if(er.passwordCheck(ansInt)) {
				System.out.println("정답입니다.");
				break;
			} else {
				System.out.println("틀렸습니다. ");
				answer = ""; // 값 초기화
				continue;
			}
			
		}
		sc.close();
	}

}
