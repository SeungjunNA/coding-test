package swea_D2;
import java.util.*;
import java.io.*;
class ����_���_����
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for(int i=1;i<=N;i++){
        	StringTokenizer st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());  //1���ʹ� p
            int q = Integer.parseInt(st.nextToken()); // r���ϴ� q
            int r = Integer.parseInt(st.nextToken()); 
            int s = Integer.parseInt(st.nextToken()); // r�Ѿ�� 1���ʹ� s
            int w = Integer.parseInt(st.nextToken()); // ��뷮
            
            int min = Math.min(p*w, (w>r ? q+(w-r)*s : q));
            System.out.printf("#%d %d\n",i,min);
        }
    }
}
