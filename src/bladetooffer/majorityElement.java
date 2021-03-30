package bladetooffer;

import java.util.*;
import java.util.stream.Collectors;

public class majorityElement {
    public static void main(String[] args) {

        int[] inpput={1, 2, 3, 2, 2, 2, 5, 4, 2};
        majorityElement a=new majorityElement();
        System.out.println(a.majorityElement(inpput));
        System.out.println(a.majorityElement1(inpput));

    }
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> savenumbers=new HashMap<Integer,Integer>();
        int max=0;
        int index=0;
        for(int c: nums){
            if(savenumbers.containsKey(c)){
                int temp=savenumbers.get(c);
                savenumbers.replace(c,temp+1);

            }
            else {
                savenumbers.put(c,1);
            }
            if(savenumbers.get(c)>max){
                max=savenumbers.get(c);
                index=c;
            }
            if(max>nums.length/2){
                return index;
            }
        }

        return index;
    }

    public int majorityElement1(int[] nums) {
        List<Integer> indexlist=new ArrayList<>();
        List<Integer> value=new ArrayList<>();
        int max=0;

        for(int c: nums){
            if(indexlist.contains(c)){
                value.set(indexlist.indexOf(c), value.get(indexlist.indexOf(c))+1);
            }
            else {
                indexlist.add(c);
                value.add(1);
            }
            if(value.get(indexlist.indexOf(c))>max){
                max=value.get(indexlist.indexOf(c));

            }
            System.out.println(indexlist.indexOf(c)+" index value "+value.get(indexlist.indexOf(c))+" max "+max+"value "+c);
        }
       // System.out.println("value.indexOf(max) "+value.indexOf(max)+" max "+max+"value "+c);
        return indexlist.get(value.indexOf(max));
    }
    public int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
//        List<Integer> list1 = Arrays.stream(nums).boxed().collect(Collectors.toList());
//        Collections.sort(list1);
//        return list1.get((int) nums.length / 2);
    }
    public int biaozhundaan(int[] nums){
        int x = 0, votes = 0;
        for(int num : nums){
            if(votes == 0) x = num;
            votes += num == x ? 1 : -1;
        }
        return x;

    }

}
