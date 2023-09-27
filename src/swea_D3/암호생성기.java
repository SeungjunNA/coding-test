package swea_D3;

import java.util.*;
import java.io.*;
class 암호생성기
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<10;i++){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<8;j++){
                list.add(Integer.parseInt(st.nextToken()));
            }
             
            boolean stop = false;
            while(true){
                for(int j=1;j<=5;j++){
                    int num = list.get(0);
                    list.remove(0);
                    num = num-j>0 ? num-j : 0;
                    list.add(num);
                    if(num==0){
                        stop = true;
                        break;
                    }
                }
                if(stop) break;
            }
             
            System.out.printf("#%d ",n);
            for(int j=0;j<8;j++){
                System.out.print(list.get(j)+" ");
            }
            System.out.println();
        }
    }
}