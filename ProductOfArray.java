import java.util.Arrays;

/*
Product of Array Except Self
============================
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:
---------
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:
---------
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 
Constraints:
-----------
2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 
Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)
*/
public class ProductOfArray {
    

    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;
        //store left array elements' multiple
        for(int i = 1; i < nums.length; i++){
            res[i] = res[i - 1] * nums[i - 1];
        }
        //multiply with right array elements' multiple
        for(int j = nums.length - 1, tmp = 1; j >= 0; j-- ){
            res[j] *= tmp;
            tmp *= nums[j];
        }
        return res;
    }

    public static void main(String args[]){
        int[] input1 = new int[]{1,2,3,4};
        int[] input2 = new int[]{-1,1,0,-3,3};
        int[][] results = new int[2][];
        results[0] = productExceptSelf(input1);
        results[1] = productExceptSelf(input2);
        for(int num[] : results)
            System.out.println(Arrays.toString(num));
    }
}
