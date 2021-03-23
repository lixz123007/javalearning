package bladetooffer;

public class findNumberIn2DArrayoffer04 {
    public static void main(String[] args) {
        int[][] a={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(findNumberIn2DArray(a,25));

    }
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        if(n==0||m==0)
            return false;
//        int[] ere=binarySearch(matrix[0],target);
//        int up=ere[0];
//        int ta=ere[1];
//
//        if(ta==target){
//            return true;
//        }
        int i=m-1;
        int j=0;
        while(i>=0&&j<n){
            if(matrix[j][i]==target)
            return true;
            if(target<matrix[j][i])
                i--;
            else
                j++;

        }
        return false;

    }
    public static int[] binarySearch(int[] arr, int value) {
        //起始位置
        int start = 0;
        //结束位置
        int end = arr.length - 1;

        while (true) {
            //计算中间位置下标
            int mid = (start + end) / 2;
            //中间值
            int midValue = arr[mid];

            if (value == midValue) {
                return new int[]{mid, midValue};
            } else {
                //待查找数值比中间值小,需要将end = mid - 1
                if (midValue > value) {
                    end = mid - 1;
                } else {
                    //待查找数值比中间值大,需要将start = mid + 1
                    start = mid + 1;
                }
            }

            if (start > end) {
                //start > end,说明未找到相应的元素,返回-1
                return new int[]{mid, midValue};
            }
        }
    }

}
