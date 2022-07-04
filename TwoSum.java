import java.util.HashMap;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/

public class TwoSum{

    public static int[] twoSum(int[] nums, int target){
        if(nums.length == 0)
            return new int[] {};
             
        var numMapper = new HashMap<Integer, Integer>(nums.length);
        for(int i = 0; i < nums.length; i++){
            if(numMapper.containsKey(target - nums[i])){
                return new int[] {i, numMapper.get(target - nums[i])};
            }else{
                numMapper.put(nums[i], i);
            }
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums1 = {2,7,11,15};
        int target = 9;

        for(int val: twoSum(nums1, target))
            System.out.printf("%d ", val);

        nums1 = new int[] {3,2,4};
        target = 6;

        System.out.println();
        for(int val: twoSum(nums1, target))
            System.out.printf("%d ", val);
    }
    
}