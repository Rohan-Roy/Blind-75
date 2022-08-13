public class SingleNumber {
        public static int singleNumber(int[] nums) {
            // Set<Integer> vals = new HashSet<>();
            // int total = 0;
            // for(int num : nums){
            //     vals.add(num);
            //     total += num;
            // }
            // int sum = vals.stream().mapToInt(Integer::intValue).sum();
            // return sum*2 - total;
            
            int xor = 0;
            for(int num : nums)
                xor ^= num;
            return xor;
        }
        
        public static void main(String args[]){
            int[] input = new int[]{2,2,1};
            //expected : 1
            System.out.println(singleNumber(input));

            input = new int[]{4,1,2,1,2};
            //expected : 4
            System.out.println(singleNumber(input));

            input = new int[]{1};
            //expected : 1
            System.out.println(singleNumber(input));
        }
}
