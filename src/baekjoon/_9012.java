package baekjoon;

import java.util.*;
import java.io.*;
public class _9012 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String[] str = st.nextToken().split("");
            String answer = "YES";
            
            Stack<String> stack = new Stack<String>();
            for(int j=0;j<str.length;j++){
                if(str[j].equals("(")) stack.push("(");
                else{
                    if(stack.empty()){
                        answer = "NO";
                        break;
                    }
                    else stack.pop();
                }
            }
            if(stack.size()>0) answer = "NO";
            System.out.println(answer);
        }
    }
}