package baekjoon;
import java.util.*;
import java.io.*;
public class _1918{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                sb.append(str.charAt(i));
            }else if(str.charAt(i)=='('){
                stack.push('(');
            }else if(str.charAt(i)==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    sb.append(stack.pop());
                }
                stack.pop();
            }else{
                while(!stack.isEmpty() && priority(stack.peek())>=priority(str.charAt(i))){
                    sb.append(stack.pop());
                }
            stack.push(str.charAt(i));
            }
        }
        while(!stack.isEmpty()) sb.append(stack.pop());
        System.out.println(sb);
    }
    static int priority(char c){
        if(c=='(') return 0;
        else if(c=='+' || c=='-') return 1;
        else return 2;
    }
}