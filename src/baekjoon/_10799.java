package baekjoon;

import java.util.*;
import java.io.*;
public class _10799 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] str = br.readLine().split("");
        Stack<String> stack = new Stack<String>();
        int answer = 0;
        for(int i=0;i<str.length;i++){
            if(str[i].equals("(")) stack.push("(");
            else{
                if(str[i-1].equals("(")){
                    stack.pop();
                    answer += stack.size();
                }else{
                    stack.pop();
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}