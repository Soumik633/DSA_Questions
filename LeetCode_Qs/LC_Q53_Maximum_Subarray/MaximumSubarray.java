package LC_Q53_Maximum_Subarray;

import java.util.Scanner;

public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int n = nums.length;

        for (int index = 0; index < n; index++) {

            // Step1: Add array elements into sum
            sum = sum + nums[index];

            // Step2: Update maximum sum
            maxSum = Math.max(maxSum, sum);

            // Step3: Reset sum if negative
            if (sum < 0) {
                sum = 0;
            }
        }

        return maxSum;
    }

    // Main method (PSVM)
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        MaximumSubarray obj = new MaximumSubarray();

        int result = obj.maxSubArray(nums);

        System.out.println("Maximum Subarray Sum: " + result);

        sc.close();
    }
}
