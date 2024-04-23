/*** 
Coding Ninja
Problem statement
You are given an integer ‘n’.



Your task is to return an array containing integers from 1 to ‘n’ (in increasing order) without using loops.



Example:
Input: ‘n’ = 5

Output: 1 2 3 4 5

Explanation: An array containing integers from ‘1’ to ‘n’ is [1, 2, 3, 4, 5].

***/

public class Solution {
    public static int[] printNos(int x) {
        int[] array=new int[x];
        printNumber(x, array);
        return array;
    }

    public static int printNumber(int x, int[] array)
    {
        if(x==0)
        return -1;

        array[x-1]=x;
        return printNumber(x-1, array);
    }

}
