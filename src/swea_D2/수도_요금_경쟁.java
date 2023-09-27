package swea_D2;
import java.util.*;
import java.io.*;
class 수도_요금_경쟁
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for(int i=1;i<=N;i++){
        	StringTokenizer st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());  //1리터당 p
            int q = Integer.parseInt(st.nextToken()); // r이하는 q
            int r = Integer.parseInt(st.nextToken()); 
            int s = Integer.parseInt(st.nextToken()); // r넘어가면 1리터당 s
            int w = Integer.parseInt(st.nextToken()); // 사용량
            
            int min = Math.min(p*w, (w>r ? q+(w-r)*s : q));
            System.out.printf("#%d %d\n",i,min);
        }
    }
}
