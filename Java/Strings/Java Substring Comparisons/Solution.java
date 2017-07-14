// Java Substring Comparisons
// https://www.hackerrank.com/challenges/java-string-compare

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int k = input.nextInt();
        String max = s.substring(0, k);
        String min = max;
        String piece;
        for (int i = 0; i <= s.length()-k; i++) {
            piece = s.substring(i, i+k);
            
            if (max.compareTo(piece) < 0)
                max = piece;
            
            if (min.compareTo(piece) > 0)
                min = piece;
        }
        System.out.println(min);
        System.out.println(max);
    }
}