class Sort_Colour {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length-1, temp;
        while(mid <= high)
        {
            if(nums[mid]==0)
            {
                temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else if(nums[mid]==2)
            {
                temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
    // Driver code
    public static void main(String[] args) {
        Sort_Colour sol = new Sort_Colour();
        int[] nums = {2, 0, 2, 1, 1, 0};
        
        System.out.println("Before sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        sol.sortColors(nums);

        System.out.println("\nAfter sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}