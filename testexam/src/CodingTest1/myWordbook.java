package CodingTest1;
import java.util.*;

public class myWordbook implements wordbookfunction {
	
	static Map<String,String> wordbook = new HashMap<String,String>();

	public myWordbook() {
		wordbook.put("student", "학생(기본단어)");
		wordbook.put("apple", "사과(기본단어)");
		wordbook.put("people", "사람(기본단어)");
		wordbook.put("pizza", "피자(기본단어)");
		
	}
	
	@Override
	public void Menu() {
		System.out.println("등록된 단어 수 : " + wordbook.size());
		System.out.println("----------선택하시오 -------------");
		System.out.println("1.단어등록");
		System.out.println("2.단어조회");
		System.out.println("3.단어삭제");
		System.out.println("4.테스트");
		System.out.println("5.단어목록 보기");
		System.out.println("6.프로그램 종료");
		System.out.println("--------------------------------");
	}

	@Override
	public void addWord() {
		
		String english = null;
		String korean = null;
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("등록할 영어 단어를 입력하시오 (메뉴로 가려면 menu를 입력) > ");
			
			english = sc.nextLine();
			if(english.equals("menu") || english.equals("Menu")) {
				break;
			} else {
				if(wordbook.containsKey(english) == true) {
					System.out.println("이미 등록된 단어입니다. 수정을 원하시면 삭제후 다시 등록 해주세요.");
				} else {
					System.out.print("뜻을 입력하시오 >>" );
					korean = sc.nextLine();
					try {
						wordbook.put(english, korean);
					} catch(Exception e) {
						System.out.println("다시 입력해주세요");
						e.printStackTrace();
					} finally {
						System.out.println("입력되었습니다.");
					}
			}
		}
			}
		
	}

	@Override
	public void searchWord() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("조회하고 싶은 영단어를 입력하시오. (메뉴로 가려면 menu 입력)");
			String eng = sc.nextLine();
			if(eng.equals("menu")||eng.equals("Menu")) {
				break;
			} else {
				if(wordbook.containsKey(eng)) {
					System.out.println(wordbook.get(eng)); // 한국어 뜻 출력
				}else {
					System.out.println("등록되지 않은 단어입니다.");
				}
			}
		}
		sc.close();
	}

	@Override
	public void deleteWord() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("======= 단어 목록 ======");
			Set key = wordbook.keySet();
			Iterator iterator;
			
			for(iterator = key.iterator(); iterator.hasNext();) {
				String keyValue = (String) iterator.next(); // next() 메소드를 사용 할 때마다 적절한 타입으로 캐스팅 해줘야함.
				String valueVar = (String) wordbook.get(keyValue);
				System.out.println("-" + keyValue + " : " + valueVar);
			}
			System.out.println("=======================");
			
			System.out.println("삭제하고 싶은 단어를 입력하시오(메뉴로 가려면 menu 입력.)");
			String del = sc.nextLine();
			if(del.equals("menu") || del.equals("Menu")) {
				break;
			} else {
				if(wordbook.containsKey(del) == true) {
					System.out.println("입력한 단어 (" + del +
							":"+ wordbook.remove(del)+")");
				} else {
					System.out.println("존재하지 않는 단어입니다.");
				}
			}
		}
		sc.close();

	}

	@Override
	public void test() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.시작하기   2.종료하기");
			int a = sc.nextInt();
			if(a==1) {
				Set key = wordbook.keySet();
				int count = 0;
				int totalCount = 0;
				Iterator iterator;
				System.out.println("<==== 뜻에 맞는 영단어를 입력하시오 ====> ");
				for(iterator = key.iterator(); iterator.hasNext();) {
					String keyValue = (String) iterator.next();
					String valueVar = (String) wordbook.get(keyValue);
					System.out.println(valueVar);
					String answer = sc.nextLine();
					
					if(answer.equals(keyValue)) {
						System.out.println("정답입니다.");
						count++;
						totalCount++;
					} else {
						System.out.println("틀렸습니다. (답 : " + keyValue + ")");
						totalCount++;
					}
				}
				System.out.println("<< 결과 : " + count + "/" + totalCount + ">>");
				break;
			} else if ( a==2 ) {
				break;
			} else {
				System.out.println("1 또는 2만 입력하시오.");
			}
		}
		sc.close();

	}

	@Override
	public void wordList() {
		
		System.out.println("======= 단어 목록 ======");
		Set key = wordbook.keySet();
		Iterator iterator;
		
		for(iterator = key.iterator(); iterator.hasNext();) {
			String keyValue = (String) iterator.next(); // next() 메소드를 사용 할 때마다 적절한 타입으로 캐스팅 해줘야함.
			String valueVar = (String) wordbook.get(keyValue);
			System.out.println("-" + keyValue + " : " + valueVar);
		}
		System.out.println("=======================");

	}

	@Override
	public void exit() {
		System.out.println("단어장을 종료합니다.");

	}

}
