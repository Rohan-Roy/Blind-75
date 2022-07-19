/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
A subarray is a contiguous part of an array.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
 
Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
*/

public class MaximumSubArray {

    public static int maxSubArray(int[] nums) {
        int sum = nums[0], max = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(sum < 0)
                sum = nums[i];
            else{
                sum += nums[i];
            }    
            max = Math.max(max, sum);
        }

        return max;
    }

    public static void main(String args[]){

        //test case 1:
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));

        //test case 2:
        nums = new int[]{5,4,-1,7,8};
        System.out.println(maxSubArray(nums));

        nums = new int[]{-5,-4,-9,-7,-8};
        System.out.println(maxSubArray(nums));
    }

}
