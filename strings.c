/*
QUESTION 02
bookmark_border
Given a string Str, which contains numbers (0 to 9)and also letters of the English and to 'Z'). The task is to reverse string the string in such a way that the positiors of numbers in the string are left unaltered.

Example 1:

Input:

a1b2igh3 -> Value of Str

Output:

h1g2iba3

Explanation:

Without changing the positions of 1, 2 and 3, only the positions of characters 'h', 'g, "i', 'b' and 'a' have been reversed.



﻿Example 2:

Input:

Ab5c7de96 -> Value of Str

Output:

ed5c7bA96
*/

#include <stdio.h>
#include <string.h>
int main() {
    char Str[100];
    scanf("%s", Str); 
    int length = strlen(Str);
    int i = 0, j = length - 1;
    while (i < j) {
        while (i < j && (Str[i] >= '0' && Str[i] <= '9')) {
            i++;
        }
        while (i < j && (Str[j] >= '0' && Str[j] <= '9')) {
            j--;
        }
        if (i < j) {
            char temp = Str[i];
            Str[i] = Str[j];
            Str[j] = temp;
            i++;
            j--;
        }
    }
    printf("%s\n", Str); 
    return 0;
}
