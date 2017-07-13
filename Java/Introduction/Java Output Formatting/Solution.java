// Java Output Formatting
// https://www.hackerrank.com/challenges/java-output-formatting

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                String y = Integer.toString(x);
                if(y.length() < 2){
                    y = "00" + x;
                }else if(y.length() < 3){
                    y = "0" + x;
                }
                System.out.printf("%-15s", s1);
                System.out.printf("%1s %n", y);
            }
            System.out.println("================================");

    }
}



