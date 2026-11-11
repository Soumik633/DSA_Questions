package LC_Q287_FindDuplicate;

import java.util.HashMap;
import java.util.Scanner;

public class FindDuplicateNumber {

    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        // Find frequency of numbers in the array
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Find duplicate number
        for (int i : nums) {
            if (freq.get(i) > 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        FindDuplicateNumber obj = new FindDuplicateNumber();

        int result = obj.findDuplicate(nums);

        if (result != -1) {
            System.out.println("Duplicate number: " + result);
        } else {
            System.out.println("No duplicate found.");
        }

        sc.close();
    }
}
