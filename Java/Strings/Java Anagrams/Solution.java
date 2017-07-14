// Java Anagrams
// https://www.hackerrank.com/challenges/java-anagrams

import java.io.*;
import java.util.*;

public class Solution {
    static boolean isAnagram(String a, String b) {
        boolean isAnagram = false;
        char[] word1 = new char[a.length()];
        char[] word2 = new char[b.length()];
        if(a.length() != b.length()){
            return false;
        }
        for(int i = 0; i < a.length(); i++){
            word1[i] = a.toLowerCase().charAt(i);
            word2[i] = b.toLowerCase().charAt(i);
        }
        Arrays.sort(word1);
        Arrays.sort(word2);
        if(Arrays.equals(word1, word2)){
            return true;
        }
        return false;
    }
public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}