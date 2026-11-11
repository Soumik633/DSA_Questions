package LC_Q448_FindDisappearedNumbers;

import java.util.*;

public class FindAllNumbersDisappearedinArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        int n = nums.length;

        // Marking -ve
        for (int index = 0; index < n; index++) {

            int value = Math.abs(nums[index]);
            int position = value - 1;

            // If +ve then mark -ve
            if (nums[position] > 0) {
                nums[position] = -nums[position];
            }
        }

        // Finding disappeared numbers
        for (int index = 0; index < n; index++) {

            if (nums[index] > 0) {
                int valueAtThatIndex = index + 1;
                ans.add(valueAtThatIndex);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements (1 to " + n + "):");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        FindAllNumbersDisappearedinArray obj =
                new FindAllNumbersDisappearedinArray();

        List<Integer> result = obj.findDisappearedNumbers(nums);

        System.out.println("Disappeared numbers: " + result);

        sc.close();
    }
}
