package baekjoon;

import java.util.*;
import java.io.*;
public class _17413 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        Stack<Character> stack = new Stack<Character>();
        boolean b = false;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='<'){
                b = true;
                while(!stack.isEmpty()) sb.append(stack.pop());
                stack.push('<');
            } 
            else if(str.charAt(i)=='>'){
                b = false;
                stack.push('>');
                int len = stack.size();
                StringBuilder sb1 = new StringBuilder();
                for(int j=0;j<len;j++){
                    sb1.append(stack.pop());
                }
                sb1.reverse();
                sb.append(sb1);
            }else{
                if(b) stack.push(str.charAt(i));
                else{
                    if(str.charAt(i)==' '){
                        while(!stack.isEmpty()) sb.append(stack.pop());
                        sb.append(" ");
                    }else stack.push(str.charAt(i));
                }
            }
        }
        while(!stack.isEmpty()) sb.append(stack.pop());
        System.out.println(sb);
        
    }
}