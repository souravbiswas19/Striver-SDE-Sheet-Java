public class Maximum_Subarray_Sum_Print {
    public static void maxSubArray(int[] nums) {
        int sum = 0, maxi = Integer.MIN_VALUE, start=-1, ansstart=-1, ansend=-1;
        for (int i = 0; i < nums.length; i++) {
            if(sum==0)
                start = i;
            sum += nums[i];
            if (sum > maxi) {
                maxi = sum;
                ansstart = start;
                ansend = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.print("Subarray is : \n[");
        for(int i=ansstart;i<=ansend;i++)
        {
            System.out.print(nums[i] + ", ");
        }
        System.out.print("]");
        System.out.println("\nMaximum Subarray Sum is: " + maxi);
    }

    public static void main(String[] args) {
        // Sample input array
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // Call the maxSubArray method and print the result
        maxSubArray(nums);
    }
}
