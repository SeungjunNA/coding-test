package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class _5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String func = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String strArr = br.readLine();
            String[] arr = strArr.substring(1, strArr.length() - 1).split(",");
            Deque<String> deque = new ArrayDeque<>();
            String result = "";

            for(String str : arr) {
                deque.offer(str);
            }

            boolean left = true;
            for (int j = 0; j < func.length(); j++) {
                if (func.charAt(j) == 'R') {
//                    deque = deque.reversed();
                    left = !left;
                }else {
                    if(n==0){
                        result = "error";
                        break;
                    }

                    if(left) deque.pollFirst();
                    else deque.pollLast();
                    n--;
                }
            }
            if(result=="error"){
//                System.out.println(result);
                sb.append(result).append("\n");
                continue;
            }

            arr = new String[deque.size()];
            for (int j = 0; j < arr.length; j++) {
                if(left) arr[j] = deque.pollFirst();
                else arr[j] = deque.pollLast();
            }
            sb.append("["+String.join(",", arr)+"]").append("\n");
//            System.out.println("["+String.join(",", arr)+"]");
        }
        System.out.println(sb);
    }
}