import java.util.HashSet;
import java.util.Set;

/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 
Constraints:
1 <= nums.length <= 105
-109 <= nums[i] <= 109
*/

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> count = new HashSet<>();
        for(int val : nums){
            if(count.contains(val))
                return true;
            else
                count.add(val);
        }
        return false;
    }

    public static void main(String args[]){
        int[] input = new int[]{1,2,3,4};
        System.out.println(containsDuplicate(input));

        input = new int[]{1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(input));
    }

}
