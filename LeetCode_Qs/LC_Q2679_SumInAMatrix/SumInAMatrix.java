package LC_Q2679_SumInAMatrix;

import java.util.Arrays;
import java.util.Scanner;

public class SumInAMatrix {

    public int matrixSum(int[][] nums) {
        int n = nums.length;
        int m = nums[0].length;

        // Sort every row in descending order
        for (int i = 0; i < n; i++) {
            Arrays.sort(nums[i]);

            // Reverse the row
            for (int j = 0; j < m / 2; j++) {
                int temp = nums[i][j];
                nums[i][j] = nums[i][m - 1 - j];
                nums[i][m - 1 - j] = temp;
            }
        }

        int sum = 0;

        // Find maximum in each column
        for (int j = 0; j < m; j++) {
            int max = 0;

            for (int i = 0; i < n; i++) {
                max = Math.max(max, nums[i][j]);
            }

            sum += max;
        }

        return sum;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        int[][] nums = new int[n][m];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[i][j] = sc.nextInt();
            }
        }

        SumInAMatrix obj = new SumInAMatrix();

        int result = obj.matrixSum(nums);

        System.out.println("Matrix Sum: " + result);

        sc.close();
    }
}
