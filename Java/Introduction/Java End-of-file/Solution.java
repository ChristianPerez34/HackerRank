// Java End-of-file
// https://www.hackerrank.com/challenges/java-end-of-file

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        while(input.hasNext()){
            String word = input.nextLine();
            System.out.println(counter + " " + word);
            counter++;
        }
    }
}