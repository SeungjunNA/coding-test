package baekjoon;

import java.util.*;
import java.io.*;
public class _5397{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0;i<n;i++){
            StringBuilder sb = new StringBuilder();
            String str = br.readLine();
            Stack<Character> leftStack = new Stack<Character>();
            Stack<Character> rightStack = new Stack<Character>();
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='<'){
                    if(!leftStack.isEmpty()) rightStack.push(leftStack.pop());
                }else if(str.charAt(j)=='>'){
                    if(!rightStack.isEmpty()) leftStack.push(rightStack.pop());
                }else if(str.charAt(j)=='-'){
                    if(!leftStack.isEmpty()) leftStack.pop();
                }else{
                    leftStack.push(str.charAt(j));
                }
            }
            while(!leftStack.isEmpty()) rightStack.push(leftStack.pop());
            while(!rightStack.isEmpty()) sb.append(rightStack.pop());

            System.out.println(sb);
        }
    }
}
