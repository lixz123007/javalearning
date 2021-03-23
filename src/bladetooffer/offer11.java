package bladetooffer;

public class offer11 {
    public static void main(String[] args) {
        int[] input={10,1,10,10,10};
        System.out.println(minArray(input));
    }
    public static int minArray(int[] numbers) {
        int hade=0;
        int end=numbers.length-1;
        if(numbers.length==2)return Math.min(numbers[0],numbers[1]);
        if(numbers[hade]<numbers[end])return numbers[hade];
        while(true){

            if((end-hade)==1)return Math.min(numbers[end],numbers[hade]);
            if(hade>=end)return numbers[hade];
            int mid=(hade+end)/2;
            //System.out.println(hade+"hade mid: "+mid+"end:"+end);
            if(numbers[mid]<numbers[Math.max(0,mid-1)])return numbers[mid];
            if(numbers[hade]<numbers[Math.max(0,hade-1)])return numbers[hade];
            if(numbers[end]<numbers[Math.max(0,end-1)])return numbers[end];
            if(numbers[mid]>numbers[hade]){
                hade=mid+1;
                System.out.println(hade+"hade X mid: "+mid+"end:"+end);
                continue;
            }
            if(numbers[mid]==numbers[hade]){
                hade++;
            }
            if(numbers[mid]==numbers[end]){
                end--;
            }

            if(numbers[mid]<numbers[end]){
                end=mid-1;
            }
            System.out.println(hade+"hade mid: "+mid+"end:"+end);


        }
    }
    public static int biaozhun(int[] numbers) {
    int hade=0;
    int end=numbers.length-1;
        if(numbers.length==2)return Math.min(numbers[0],numbers[1]);
        if(numbers[hade]<numbers[end])return numbers[hade];
        while(true){
        //if((end-hade)==1)return Math.min(numbers[end],numbers[hade]);
        if(hade>=end)return numbers[hade];
        int mid=hade+(end-hade)/2;
        // if(numbers[mid]<numbers[Math.max(0,mid-1)])return numbers[mid];
        //             if(numbers[hade]<numbers[Math.max(0,hade-1)])return numbers[hade];
        // if(numbers[end]<numbers[Math.max(0,end-1)])return numbers[end];
        if(numbers[mid]>numbers[end]){
            hade=mid+1;
            continue;
        }
        else if(numbers[mid]==numbers[end]){
            end--;
        }
        else
            end=mid;}}
}


