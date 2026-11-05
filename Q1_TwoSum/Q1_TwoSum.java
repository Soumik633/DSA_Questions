class Q1_TwoSum {

    
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return new int[] {};
    }

    // Main method for VS Code
    //Taking input in IDE
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        Q1_TwoSum obj = new Q1_TwoSum();

        int[] result = obj.twoSum(nums, target);

        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}