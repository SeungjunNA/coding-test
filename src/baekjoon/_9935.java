package baekjoon;

import java.util.*;
import java.io.*;
public class _9935 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String boom = br.readLine();
        Stack<Character> stack = new Stack<Character>();
        
        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
            if(stack.size()>=boom.length()){
                boolean same = true;
                for(int j=0;j<boom.length();j++){
                    if(stack.get(stack.size()-boom.length()+j) != boom.charAt(j)){
                        same = false;
                        break;
                    }
                }
                if(same){
                    for(int j=0;j<boom.length();j++) stack.pop();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        if(stack.isEmpty()) sb.append("FRULA");
        else{
            for(char c : stack)
                sb.append(c);    
        }
        System.out.println(sb);
        
    }
}