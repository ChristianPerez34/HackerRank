// Java Loops II
// https://www.hackerrank.com/challenges/java-loops

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int temp = 0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j = 0; j < n; j++){
                int result = ((int)Math.pow(2, j) * b);
                temp += result;
                System.out.print(temp + a + " ");
            }
            temp = 0;
            System.out.println();
        }
        in.close();
    }
}
