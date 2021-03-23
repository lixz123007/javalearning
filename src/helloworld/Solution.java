package helloworld;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int len=nums.length;
        for(int i=len-1;i>=0;i--){
            for(int j=i-1;j>=0;j--) {
                //System.out.println(nums[i]+" "+nums[j]+" j="+j);

                if (nums[i] + nums[j]==target) {
                    int[] result={nums[i],nums[j]};
                    return result;
                }
            }    }
    int[] result2={404,404};
     return result2;
    }

//    public int[] twoSumhash(int[] nums, int target) {
//        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
//        for (int i = 0; i < nums.length; ++i) {
//            if (hashtable.containsKey(target - nums[i])) {
//                return new int[]{hashtable.get(target - nums[i]), i};
//            }
//            hashtable.put(nums[i], i);
//        }
//        return new int[0];
//    }
//

//    public int reverse(int x) {
//        int y=-1;
//        if (x>0){
//            y=1;}
//        int i=0;
//        double result=0;
//        //int[] result= new int[10]
//        while(x!=0){
//
//            result=result+(x%10)*Math.pow(10,10-i);
//            i++;
//            x=x/10;
//
//        }
//        return (int)(y*result/(Math.pow(10,10-i)));
//
//    }

    public static void main(String[] args) {
        int[] input = {2,7,11,15};
       // input={2,7,11,15};
        System.out.println(input.length);
        System.out.println(twoSum(input,9)[0]);
        System.out.println(twoSum(input,9)[1]);


    }
}