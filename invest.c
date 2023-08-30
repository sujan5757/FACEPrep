/*3)Jack and John were investigating a murder and the murderer was Ms.Isha Adler. She wanted Jack to find her by solving the puzzles. Jack was able to solve all but one. The last task was to write a program to remove duplicate elements from an array. Can you help Jack?

Input Format

Input consists of 1 integer and 1 array. The first integer corresponds to the size of the array. The next integers correspond to the elements in the array.

Output Format

The output consists of an array with no duplicate elements.

Sample Input 0
4

1
2
2
3

Sample Output 0
1
2
3
*/
#include <stdio.h>

int main() {
    int a;
    scanf("%d", &a);

    int arr[a];
    for (int i = 0; i < a; i++) {
        scanf("%d", &arr[i]);
    }

    for (int i = 0; i < a; i++) {
        for (int j = i + 1; j < a; j++) {
            if (arr[i] == arr[j]) {
                arr[j] = -1;
            }
        }
    }

    for (int i = 0; i < a; i++) {
        if (arr[i] != -1) {
            printf("%d\n", arr[i]);
        }
    }

    return 0;
}
