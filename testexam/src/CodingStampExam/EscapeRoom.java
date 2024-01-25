package CodingStampExam;
/*
조건 1. 비밀번호는 3자리로 한다. 
2. 비밀번호를 1자리씩 입력하게 한다. (1개 입력하고 엔터 누르는 식) 
3. 비밀번호가 틀리면 처음부터 다시 입력하게 한다. 
4. 비밀번호가 맞으면 성공 메시지를 출력한다.
*/
import java.util.Random;

public class EscapeRoom {
	private int password;
	
	Random random = new Random();
	
	public EscapeRoom() {
		this.setPassword(random.nextInt(1000));
	}
	
	public void setPassword(int password) {
		this.password = password;
	}
	
	public int getPassword() {
		return this.password;
	}
	
	public boolean passwordCheck(int password) {
		return this.password == password;
	}
}
