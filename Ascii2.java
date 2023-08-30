/*
Write a program to get a number (ASCII value) as input and print its equivalent character.

Input Format

Input consists of one integer

Constraints

NA

Output Format

Output prints the character

Sample Input 0

119
Sample Output 0

w
Sample Input 1

105
Sample Output 1

i
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int g=sc.nextInt();
        System.out.println((char)g);
    }
}
