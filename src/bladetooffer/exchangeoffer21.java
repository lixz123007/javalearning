package bladetooffer;

import java.util.ArrayList;
import java.util.List;

public class exchangeoffer21 {
    public static void main(String[] args) {
        int[] input = {2,7,11,15,18};
        System.out.println(exchange(input));
    }
    public static int[] exchange(int[] nums) {
        ArrayList<Integer> jishu=new ArrayList<>();
        ArrayList<Integer> oushu=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                oushu.add(nums[i]);
            }else
            {
                jishu.add(nums[i]);
            }

        }
        jishu.addAll(oushu);
        return (int[])jishu.stream().mapToInt(Integer::valueOf).toArray();


    }

    public static int[] exchangedoublepoint(int[] nums) {
        int head=0;
        int end=nums.length-1;
        while(head<end){
            while(nums[head]%2!=0){
                head++;
                if(head==end)
                    return nums;
            }
            while(nums[end]%2==0){
                end--;
                if(head==end)
                    return nums;
            }
            int c=nums[head];
            nums[head]=nums[end];
            nums[end]=c;
        }
        return nums;


    }
}
