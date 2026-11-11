
package LC_Q26_RemoveDuplicates;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;
        int n = nums.length;

        while (j < n) {
            if (nums[i] == nums[j]) {
                // If Match, Then Check next
                j++;
            } else {
                // If No Match, Move i forward
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter sorted array elements:");
        for (int k = 0; k < n; k++) {
            nums[k] = sc.nextInt();
        }

        RemoveDuplicatesFromSortedArray obj =
                new RemoveDuplicatesFromSortedArray();

        int k = obj.removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);

        System.out.print("Array after removing duplicates: ");
        for (int p = 0; p < k; p++) {
            System.out.print(nums[p] + " ");
        }

        sc.close();
    }
}
