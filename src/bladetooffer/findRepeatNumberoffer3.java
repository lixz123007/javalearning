package bladetooffer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class findRepeatNumberoffer3 {
    public static void main(String[] args) {
        int[] input = {2,7,0,2,6,3,1,1};
        // input={2,7,11,15};
        //System.out.println(input.length);
        System.out.println(findRepeatNumber(input));
        System.out.println(findbiaozhun(input));

    }
    public static int findRepeatNumber(int[] nums) {
        //Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        Set<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashSet.contains(nums[i])) {
                return nums[i];
            }
            hashSet.add(nums[i]);
        }


        return 0;
    }
    public static int findbiaozhun(int[] nums){
        for (int i = 0; i<nums.length;i++){
            if(nums[i]!=i){
                if(nums[nums[i]]==nums[i])
                    return nums[i];
                else
                {int c=nums[nums[i]];
                    nums[nums[i]]=nums[i];
                    nums[i]=c;}


            }

        }
        return 0;
    }
}
