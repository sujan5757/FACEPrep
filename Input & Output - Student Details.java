/*     
Write a program to print the details of a student. The student's details consist of his/her name, age, CGPA, and grade.

Input Format

The input consists of one string, one integer, one float, and one character. The string corresponds to the name of a student. The integer corresponds to the age of a student. The float corresponds to the CGPA of a student. The character corresponds to the grade of a student.

Constraints

The CGPA (float value) should be printed with 2 decimal places.

Output Format

The output prints all the details of a student. Refer to the sample Output.

Sample Input 0

Rajeev
20
8.6467
B
Sample Output 0

Name: Rajeev
Age: 20
CGPA: 8.64
Grade: B
Sample Input 1

Meera
18
9.123
A
Sample Output 1

Name: Meera
Age: 18
CGPA: 9.12
Grade: A

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String s=sc.next();
        int b=sc.nextInt();
        Float c=sc.nextFloat();
        char d=sc.next().charAt(0);
        int a=(int)(c*100);
        float f=(float)a;
        System.out.println("Name: "+s);
        System.out.println("Age: "+b);
        System.out.format("CGPA: %.2f",f/100);
        System.out.println();
        System.out.println("Grade: "+d);

        
    }
}
