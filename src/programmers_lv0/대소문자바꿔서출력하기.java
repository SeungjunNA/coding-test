import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int n = 'a'-'A';
        String result = "";
        
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)<'a')
                result += (char)(n+a.charAt(i));
            else result += (char)(a.charAt(i)-n);
        }
        
        System.out.println(result);
    }
}