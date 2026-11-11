
import java.util.Scanner;
import java.util.Arrays;

public class Two_Sum_II {

    public int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1 ;

        while(left < right) {

            int sum = numbers[left] + numbers[right];

            if(sum == target) {
                return new int[]{left + 1, right + 1};
            }

            else if(sum < target) {
                left++;
            }

            else {
                right--;
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter sorted array elements:");
        for(int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        Two_Sum_II obj = new Two_Sum_II();

        int[] result = obj.twoSum(numbers, target);

        if(result.length == 2) {
            System.out.println("Indices are: " + Arrays.toString(result));
        }
        else {
            System.out.println("No solution found.");
        }

        sc.close();
    }
}
