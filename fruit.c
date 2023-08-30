/*2)ram has a fruit shop he has arranged some set of fruits in the column and 
row wise Ram needs to find which row and column have a maximum number of fruits
 help him to find out

3

3

1 6 8

2 5 1

38 2

output
sum of rows is 15 8 13 
row 1 has a maximum sum 
the sum of colums is 6 19 115
column 2 has a maximum sum
*/


#include <stdio.h>

int main() {
    int r, c;
    printf("Enter the number of rows: ");
    scanf("%d", &r);

    printf("Enter the number of columns: ");
    scanf("%d", &c);

    int f[r][c];

    printf("Enter the elements of the matrix:\n");
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            scanf("%d", &f[i][j]);
        }
    }

    int row[r];
    int col[c];

    for (int i = 0; i < r; i++) {
        row[i] = 0;
        for (int j = 0; j < c; j++) {
            row[i] += f[i][j];
            col[j] += f[i][j];
        }
    }

    int maxRowSum = row[0];
    int maxRowIdx = 0;

    for (int i = 1; i < r; i++) {
        if (row[i] > maxRowSum) {
            maxRowSum = row[i];
            maxRowIdx = i;
        }
    }

    int maxColSum = col[0];
    int maxColIdx = 0;

    for (int j = 1; j < c; j++) {
        if (col[j] > maxColSum) {
            maxColSum = col[j];
            maxColIdx = j;
        }
    }

    printf("Sum of rows:\n");
    for (int i = 0; i < r; i++) {
        printf("%d ", row[i]);
    }
    printf("\nRow %d has a maximum sum\n", maxRowIdx + 1);

    printf("\nSum of columns:\n");
    for (int j = 0; j < c; j++) {
        printf("%d ", col[j]);
    }
    printf("\nColumn %d has a maximum sum\n", maxColIdx + 1);

    return 0;
}
