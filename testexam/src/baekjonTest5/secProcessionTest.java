package baekjonTest5;

import java.util.*;

public class secProcessionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		
		int[][] intArrs1 = new int[N][M];
		int[][] intArrs2 = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				intArrs1[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				intArrs2[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				System.out.print(intArrs1[i][j] + intArrs2[i][j] + " " );
			}
			System.out.println();
		}
		sc.close();
		

	}

}
