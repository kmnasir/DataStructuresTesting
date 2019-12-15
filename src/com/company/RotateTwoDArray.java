package com.company;

public class RotateTwoDArray {

        public static void main(String[] args) {
            // NOTE: The following input values will be used for testing your solution.
            int a1[][] = {{1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}};
            // rotate(a1, 3) should return:
            // [[7, 4, 1],
            //  [8, 5, 2],
            //  [9, 6, 3]]

            rotate(a1,3);


            int a2[][] = {{1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}};
            rotate(a2, 4);// should return:
            // [[13, 9, 5, 1],
            //  [14, 10, 6, 2],
            //  [15, 11, 7, 3],
            //  [16, 12, 8, 4]]
        }

        // Implement your solution below.
        public static int[][] rotate(int[][] a, int n) {
            // NOTE: To solve it in place, write this function so that you
            // won't have to create rotated.
            //int[][] rotated = new int[n][n];
            int level=0;
            int last=n-1;
            int totalLevels=a.length-2;

            while(level<totalLevels) {
                for (int i = level; i < last; i++) {
                    swap(a, level, i, i, last);
                    swap(a, level, i, last, last-i+level);
                    swap(a, level, i, last - i+level, level);
                }
                ++level;
                --last;
            }

            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++) {
                    System.out.print(a[i][j] + ",");
                }
                System.out.println();
            }
            return a;
        }

        public static void swap(int[][] a, int x1,int y1, int x2, int y2){
            int temp=a[x1][y1];
            a[x1][y1]=a[x2][y2];
            a[x2][y2]=temp;
        }



}
