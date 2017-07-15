// Java Regex
// https://www.hackerrank.com/challenges/java-regex

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
class MyRegex{
String ip_pattern = "(\\d{1,2}|(0|1)[0-9][0-9]|(2)[0-4][0-9]|(25)[0-5])";

String pattern = ip_pattern + "." + ip_pattern +"."+ip_pattern+"."+ip_pattern;
}