/*
Write a program to get a character as an input and print its ASCII value.

Input Format

Input consists of one character

Constraints

Character should be an alphabet both lowercase & uppercase

Output Format

Output prints the ascii value

Sample Input 0

a
Sample Output 0

97
Sample Input 1

A
Sample Output 1

65
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        char sf=sc.next().charAt(0);
        System.out.println((int)sf);
    }
}
