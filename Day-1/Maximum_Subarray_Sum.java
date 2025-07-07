public class Maximum_Subarray_Sum {
    public static void main(String[] args) {
        // Sample input array
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // Call the maxSubArray method and print the result
        int result = maxSubArray(nums);
        System.out.println("Maximum Subarray Sum is: " + result);
    }

    public static int maxSubArray(int[] nums) {
        int sum = 0, maxi = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > maxi) {
                maxi = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxi;
    }
}
