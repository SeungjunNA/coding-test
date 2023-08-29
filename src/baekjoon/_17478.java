package baekjoon;

import java.util.*;
import java.io.*;
public class _17478 {
    static int N;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        
        System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
        System.out.println("\"����Լ��� ������?\"");
        System.out.println("\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
        System.out.println("���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
        System.out.println("���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
        
        recursion(1);
        
        System.out.println("��� �亯�Ͽ���.");
    }
    static void recursion(int k){
        if(k==N){
            System.out.println("____".repeat(k)+"\"����Լ��� ������?\"");
            System.out.println("____".repeat(k)+"\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
            System.out.println("____".repeat(k)+"��� �亯�Ͽ���.");
            return;
        }
        
        System.out.println("____".repeat(k)+"\"����Լ��� ������?\"");
        System.out.println("____".repeat(k)+"\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
        System.out.println("____".repeat(k)+"���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
        System.out.println("____".repeat(k)+"���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
        

        recursion(k+1);
        
        System.out.println("____".repeat(k)+"��� �亯�Ͽ���.");
    }
}
