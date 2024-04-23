/***
Problem statement
You are given an integer ‘n’.

Print “Coding Ninjas ” ‘n’ times, without using a loop.

Example:
Input: ‘n’  = 4

Output:
Coding Ninjas Coding Ninjas Coding Ninjas Coding Ninjas 

Explanation: “Coding Ninjas” is printed 4 times. 
***/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> printNtimes(int n) {
        List<String> print = new ArrayList<>();
        printnTimes(print, n);
        return print;
    }

    public static void printnTimes(List<String> l, int n) {
        if (n == 0)
            return;

        l.add("Coding Ninjas");
        printnTimes(l, n - 1);
    }
}
