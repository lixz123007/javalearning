package helloworld;

import java.util.HashMap;
import java.util.Map;

public class hashplus {
    public static int[] twoSumhash(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] input = {2,7,11,15};
        // input={2,7,11,15};
        System.out.println(input.length);
       System.out.println(twoSumhash(input,9)[0]);
        //System.out.println(twoSumhash(input,9)[1]);
    }
}
