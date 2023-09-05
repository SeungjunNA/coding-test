package swea_D2;

import java.util.*;
import java.io.*;

class Solution {
	static int[][] matrix;
	static boolean check;

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		for (int k = 1; k <= N; k++) {
			matrix = new int[10][10];

			for (int i = 0; i < 9; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 9; j++) {
					matrix[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			int result = 1;
			for (int i = 0; i < 9; i++) {
				width(i);
				if (!check) {
					result = 0;
					break;
				}
				length(i);
				if (!check) {
					result = 0;
					break;
				}
				if (i % 3 == 0)
					box(i);
				if (!check) {
					result = 0;
					break;
				}
			}
			System.out.printf("#%d %d\n", k, result);
		}
	}

	static void width(int k) {
		int[] arr = new int[9];
		for (int i = 0; i < 9; i++) {
			arr[matrix[k][i] - 1]++;
		}
		Arrays.sort(arr);
		if (arr[0] == 0)
			check = false;
		else
			check = true;
	}

	static void length(int k) {
		int[] arr = new int[9];
		for (int i = 0; i < 9; i++) {
			arr[matrix[i][k] - 1]++;
		}
		Arrays.sort(arr);
		if (arr[0] == 0)
			check = false;
		else
			check = true;
	}

	static void box(int k) {
		int[] arr = new int[9];
		for (int i = k; i < k + 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[matrix[i][j] - 1]++;
			}
		}
		Arrays.sort(arr);
		if (arr[0] == 0)
			check = false;
		else
			check = true;

		arr = new int[9];
		for (int i = k; i < k + 3; i++) {
			for (int j = 3; j < 6; j++) {
				arr[matrix[i][j] - 1]++;
			}
		}
		Arrays.sort(arr);
		if (arr[0] == 0)
			check = false;
		else
			check = true;

		arr = new int[9];
		for (int i = k; i < k + 3; i++) {
			for (int j = 6; j < 9; j++) {
				arr[matrix[i][j] - 1]++;
			}
		}
		Arrays.sort(arr);
		if (arr[0] == 0)
			check = false;
		else
			check = true;
	}
}
