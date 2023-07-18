package baekjoon;

import java.util.*;
import java.io.*;
// 50점 너무 커지면 L이 5넘어가면 안되나봄
public class _15829 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        
        Map<Character, Long> map = new HashMap<>();
        for(long i=1;i<=26;i++) map.put((char)('a'+i-1),i);
        
        long result = 0;
        for(int i=0;i<str.length();i++){
            result += map.get(str.charAt(i))*(Math.pow(31,i));
        }
        System.out.println(result);
    }
}

// 100점
//import java.util.*;
//import java.io.*;
//public class MyClass {
//    public static void main(String args[]) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        String str = br.readLine();
//        
//        long result = 0;
//        int pow = 1;
//        for(int i=0;i<str.length();i++){
//            result += (str.charAt(i)-96) * pow;
//            pow = (pow*31) %1234567891;
//        }
//        System.out.println(result);
//    }
//}