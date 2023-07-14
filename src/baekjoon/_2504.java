package baekjoon;
import java.util.*;
import java.io.*;
public class _2504 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        Stack<Character> stack = new Stack<Character>();
        int value = 1;
        int result = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                stack.push('(');
                value *= 2;
            }else if(str.charAt(i)=='['){
                stack.push('[');
                value *= 3;
            }else if(str.charAt(i)==')'){
                if(stack.isEmpty() || stack.peek() == '['){
                    result = 0;
                    break;
                }else if(str.charAt(i-1)=='('){
                    result += value;
                }
                stack.pop();
                value /= 2;
            }else if(stack.isEmpty() || str.charAt(i)==']'){
                if(stack.peek() == '('){
                    result = 0;
                    break;
                }else if(str.charAt(i-1) == '['){
                    result += value;
                }
                stack.pop();
                value /= 3;
            }
        }
        if(stack.isEmpty()) System.out.println(result);
        else System.out.println(0);
    }
}
