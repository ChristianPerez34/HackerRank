// Java BigInteger
// https://www.hackerrank.com/challenges/java-biginteger

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger a = input.nextBigInteger();
        BigInteger b = input.nextBigInteger();
        System.out.print(a.add(b) + "\n" + a.multiply(b));
    }
}