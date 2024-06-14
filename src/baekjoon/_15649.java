package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _15649 {

	static int N, M;
	static boolean[] check;
	static int[] arr;
	static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
				
		check = new boolean[N];
		arr = new int[M];
		search(0);
		
		System.out.println(sb.toString());
	}
	static void search(int current) {
		if(current == M) {
			for(int n:arr) {
				sb.append(n + " ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=0;i<N;i++) {
			if(!check[i]) {
				check[i] = true;
				arr[current] = i+1;
				search(current+1);
				check[i] = false;
			}
		}
	}
}

//import java.util.Stack;

//public class Main {
//
//	static int N, M;
//	static boolean[] check;
//	static Stack<Integer> stack;
//	public static void main(String[] args) throws IOException {
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		
//		N = Integer.parseInt(st.nextToken());
//		M = Integer.parseInt(st.nextToken());
//				
//		check = new boolean[N];
//		stack = new Stack<>();
//		for(int i=0;i<N;i++) {
//			search(i, N, 1);
//		}
//	}
//	static void search(int current, int end, int size) {		
//		check[current] = true;
//		stack.push(current+1);
//		
//		if(size == M) {
//			for(int n : stack) {
//				System.out.print(n+" ");
//			}
//			System.out.println();
//		}
//
//		for(int i=0;i<N;i++) {
//			if(!check[i]) search(i, end, size+1);
//		}
//		check[current] = false;
//		stack.pop();
//	}
//}
