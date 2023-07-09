package baekjoon;

import java.util.*;
import java.io.*;
public class _4949 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c;
        while(true){
            String answer = "";
            String[] str = br.readLine().split("");
            if(str[0].equals(".")) break;
            Stack<String> stack = new Stack<String>();
            for(int i=0;i<str.length;i++){
                String s = str[i];
                if(s.equals("(") || s.equals("[")) stack.push(s);
                else if(s.equals(")")){
                    if(stack.isEmpty() || stack.peek().equals("[")){
                        stack.push(s);    
                        break;
                    }
                    stack.pop();
                }
                else if(s.equals("]")){
                    if(stack.isEmpty() || stack.peek().equals("(")){
                        stack.push(s);
                        break;
                    }
                    stack.pop();
                }
            }
            
            
            if(stack.isEmpty()) answer = "yes";
            else answer = "no";
            System.out.println(answer);
        }
    }
}