import java.util.Arrays;

public class MajorityElement {
        public static int majorityElement(int[] nums) {
            
            /*  Solution - 1    */
            
            // Map<Integer, Integer> count = new HashMap<>();
            // for(int num : nums){
            //     count.put(num, count.getOrDefault(num,0) + 1);
            // }
            // int res = 0;
            // for(Map.Entry e : count.entrySet()){
            //     if((int)e.getValue() > nums.length / 2)
            //         return (int)e.getKey();
            // }
            // return 0;
            
            /*  Solution - 2    */
            
            // int major=nums[0], count = 1;
            // for(int i=1; i<nums.length;i++){
            //    if(count==0){
            //        count++;
            //        major=nums[i];
            //    }else if(major==nums[i]){
            //        count++;
            //    }else count--;
            //
            //  }
            //  return major;
            
            /*  Solution - 3    */
            
            Arrays.sort(nums);
            return nums[nums.length/2];
        }

        public static void main(String args[]){
            int input[] = new int[]{3,2,3};
            //Expected : 3
            System.out.println(majorityElement(input));

            input = new int[]{2,2,1,1,1,2,2};
            //Expected : 2
            System.out.println(majorityElement(input));                       
        }
}
