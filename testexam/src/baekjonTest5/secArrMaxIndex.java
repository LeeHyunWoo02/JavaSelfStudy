package baekjonTest5;

import java.util.Scanner;


public class secArrMaxIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] intArrs = new int[9][9];
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j<9; j++) {
				intArrs[i][j] = sc.nextInt();
			}
		} //9*9 배열에 값 할당
		
		int max = 0;
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				if(max < intArrs[i][j]) {
					max = intArrs[i][j];
				}
			}
		} //배열 내 최대값 찾기
		int a = 0;
		int b = 0;
		for(int i = 0; i<9; i++) {
			for(int j = 0; j<9; j++) {
				if(intArrs[i][j] == max) {
					a = i + 1;
					b = j + 1; // index 값이니까 + 1 해줘야 함.
				}
			}
		}
		
		System.out.println(max);
		System.out.print(a +" "+ b);
		
		sc.close();
		
	}

}
