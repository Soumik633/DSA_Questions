package LC_Q268_MissingNumber;

import java.util.Scanner;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int xorSum = 0;
        // XOR with all array elements
        for(int num : nums){
            xorSum = xorSum ^ num;
        }
        // XOR with all element in thhe range
        int n = nums.length;
        for(int i = 0; i <= n;i++){
            xorSum = xorSum ^ i;
        }
        return xorSum;
    }
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Size of Array n: ");
    int n = sc.nextInt();

    int[] nums = new int[n];

    
    System.out.println("Enter " + n + " elements from 0 to " + n + ":");

    for (int i = 0; i < n; i++) {
         while (true) {
            int num = sc.nextInt();

            if (num >= 0 && num <= n) {
                nums[i] = num;
                break;
            } else {
                System.out.println("Error! Enter a number between 0 and " + n);
                }
            }
        }


    sc.close();
    }
}
