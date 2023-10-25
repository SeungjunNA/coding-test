package swea_D2;

import java.util.*;
import java.io.*;
class _1288_새로운_불면증_치료법
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        
        for(int t=1;t<=num;t++){
			int n = Integer.parseInt(br.readLine());
            Set<Character> set = new HashSet<>();
            int i=0;
            while(set.size()!=10){
                i++;
				String str = String.valueOf(n*i);
                for(int k=0;k<str.length();k++){
                	if(!set.contains(str.charAt(k))){
                        set.add(str.charAt(k));
                    }
                }
            }
            System.out.printf("#%d %d\n",t, n*i);
        }
	}
}