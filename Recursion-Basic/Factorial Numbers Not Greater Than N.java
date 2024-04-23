/***
Problem statement
You are given an integer ’n’.



Your task is to return a sorted array (in increasing order) containing all the factorial numbers which are less than or equal to ‘n’.



The factorial number is a factorial of a positive integer, like 24 is a factorial number, as it is a factorial of 4.



Note:
In the output, you will see the array returned by you.
Example:
Input: ‘n’ = 7

Output: 1 2 6

Explanation: Factorial numbers less than or equal to ‘7’ are ‘1’, ‘2’, and ‘6’.


example

Consider generating factorial numbers less than or equal to a given number n. For example, if n is 10, the factorial numbers less than or equal to 10 are:

1
!
=
1
1!=1

2
!
=
2
2!=2

3
!
=
6
3!=6

4
!
=
24
4!=24

5
!
=
120
5!=120

6
!
=
720
6!=720

7
!
=
5040
7!=5040

In this case, the program should output the list [1, 2, 6, 24, 120, 720, 5040], representing the factorial numbers less than or equal to 10.
***/
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Long> factorialNumbers(long n) {
        if (n < 1)
            return new ArrayList<>();

        List<Long> l = new ArrayList<>();
        long result = 1;
        for (long i = 1; result * i <=n; i++) {
            result *= i;

            l.add(result);
        }
        return l;
    }
}
