package LC_Q724_FindPivotIndex;

import java.util.Scanner;

public class FindPivotIndex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int nums[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution obj = new Solution();

        int result = obj.pivotIndex(nums);

        System.out.println("Pivot Index: " + result);

        sc.close();
    }
}

class Solution {

    public int pivotIndex(int[] nums) {

        int n = nums.length;

        int leftSum[] = new int[n];
        int rightSum[] = new int[n];

        // Store the leftSum
        leftSum[0] = nums[0];

        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i];
        }

        // Store the rightSum
        rightSum[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightSum[i] = nums[i] + rightSum[i + 1];
        }

        // Check Equality
        for (int i = 0; i < n; i++) {
            if (rightSum[i] == leftSum[i]) {
                return i;
            }
        }

        return -1;
    }
}
