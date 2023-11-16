package swea_D2;

import java.util.*;
import java.io.*;
class _1940_°¡¶ù_RCÄ«
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int t=1;t<=T;t++){
        	int N = Integer.parseInt(br.readLine());
            int result = 0;
            int ms = 0;
            for(int i=0;i<N;i++){
            	StringTokenizer st = new StringTokenizer(br.readLine());
                int command = Integer.parseInt(st.nextToken());
                if(command == 0){
                    result += ms;
                }else if(command == 1){
                	ms += Integer.parseInt(st.nextToken());
                    result += ms;
                }else{
                    int cm_ms = Integer.parseInt(st.nextToken());
                    ms = ms-cm_ms < 0 ? 0 : ms-cm_ms;
                    result += ms;
                }
            }
            System.out.printf("#%d %d\n",t,result);
        }
	}
}