/*
Write a program to get a float value from the user and display it in the below-mentioned format.

HINT: Use ceil() and floor() functions from the header file.

Input Format

Input consists of one float value.

Constraints

NA

Output Format

The output consists of one integer, its rounded-up value, and its rounded-down value.

Sample Input 0

54.5
Sample Output 0

54
55
54
Sample Input 1

66.7
Sample Output 1

66
67
66
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        float n=sc.nextFloat();
        double c=Math.ceil(n);
        System.out.println((int)n);
        System.out.println((int)c);
        System.out.println((int)n);
    }
}
