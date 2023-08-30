package baekjoon;

import java.util.*;
import java.io.*;
public class _5639 {
    static StringBuilder sb;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Node node = new Node(Integer.parseInt(br.readLine()), null, null);
        
        while(true){
            String str = br.readLine();
            if(str==null || str.equals("")){
                break;
            }
            
            insert(node, Integer.parseInt(str));
        }
        sb = new StringBuilder();
        postOrder(node);

        System.out.println(sb);
    }
    static class Node{
        int root;
        Node left, right;
        Node(int root, Node left, Node right){
            this.root = root;
            this.left = left;
            this.right = right;
        }
    }
    static void insert(Node node, int n){
        if(node.root>n && node.left==null){
            node.left = new Node(n, null, null);
            return;
        }else if(node.root<n && node.right==null){
            node.right = new Node(n, null, null);
            return;
        }else if(node.root>n){
            insert(node.left, n);
        }else if(node.root<n){
            insert(node.right, n);
        }
    }
    static void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        sb.append(node.root).append("\n");
    }
}
