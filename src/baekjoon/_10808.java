package baekjoon;

import java.util.*;
import java.io.*;
public class _10808 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String S = st.nextToken();
        int[] alphabet = new int[26];
        
        for(int i=0;i<S.length();i++){
            alphabet[S.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            System.out.print(alphabet[i]+" ");
        }
    }
}