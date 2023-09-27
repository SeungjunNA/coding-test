package swea_D3;

import java.util.*;
import java.io.*;
class 단순_2진_암호코드
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        int N = Integer.parseInt(br.readLine());
        for(int i=1;i<=N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            boolean go = false;
            int res = 0;
            for(int j=0;j<n;j++){
                String str = br.readLine();
                String result = "";
                for(int l=str.length()-1;l>=0;l--){
                    if(str.charAt(l)=='1'){
                        String s = str.substring(l-6,l+1);
                        result = checkNum(s) + result;
                        l -= 6;
                        go = true;
                    }else go = false;
                    if(go){
                    int ans = 0;
                    int a = 0;
                    int b = 0;
                    for(int k=0;k<result.length();k+=2){
                        a += (result.charAt(k)-'0') * 3;
                    }
                    for(int k=1;k<result.length();k+=2){
                        b += (result.charAt(k)-'0');
                    }
                    for(int k=0;k<result.length();k++){
                        ans += result.charAt(k)-'0';
                    }
                    if((a+b)%10==0) res = ans;
                    else res = 0;
                    }
                }
                 
            }
            System.out.printf("#%d %d\n",i,res);
        }
    }
    public static String checkNum(String s){
        if(s.equals("0001101")) return "0";
        else if(s.equals("0011001")) return "1";
        else if(s.equals("0010011")) return "2";
        else if(s.equals("0111101")) return "3";
        else if(s.equals("0100011")) return "4";
        else if(s.equals("0110001")) return "5";
        else if(s.equals("0101111")) return "6";
        else if(s.equals("0111011")) return "7";
        else if(s.equals("0110111")) return "8";
        else return "9";
    }
}