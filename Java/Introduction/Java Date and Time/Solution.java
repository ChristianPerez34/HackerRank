// Java Date and Time
// https://www.hackerrank.com/challenges/java-date-and-time

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        String[] weekDay = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        Calendar cal = Calendar.getInstance();
        cal.set(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));
        System.out.println(weekDay[cal.get(Calendar.DAY_OF_WEEK) - 1]);
    }
}
