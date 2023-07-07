package swea_D1;

import java.util.Scanner;
import java.io.FileInputStream;

class 평균값_구하기
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int result = 0;
            for(int i=0;i<10;i++){
                int n = sc.nextInt();
                result += n;
            }
            if(result%10 >= 5) result = result/10 + 1;
            else result /= 10;
            System.out.println("#"+test_case+" "+result);
		}
	}
}