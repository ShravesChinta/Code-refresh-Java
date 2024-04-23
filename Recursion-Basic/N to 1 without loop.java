/**
Problem statement
You are given an integer ‘n’.



Your task is to return an array containing integers from ‘n’ to ‘1’ (in decreasing order) without using loops.



Note:
In the output, you will see the array returned by you.
Example:
Input: ‘n’ = 5

Output: 5 4 3 2 1

Explanation: An array containing integers from ‘n’ to ‘1’ is [5, 4, 3, 2, 1].
**/

public class Solution
{
    public static int[] printNos(int x) {
       int[] array=new int[x];
       int index=0;
       printNto1(array, x, index);
       return array;
    }

    public static void printNto1(int[] array, int x, int i)
    {
        if(x==0)
        return;

        array[i]=x;
        printNto1(array, x-1, i+1);
    }
}
