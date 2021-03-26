package bladetooffer;

import java.util.Arrays;

public class spiralOrderoffer29 {
    public static void main(String[] args) {
    //int[][] matrix={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int[][] matrix= {{3},{2}};
    System.out.println(Arrays.toString(spiralOrder(matrix)));

    }

    static public int[] spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        if(m<=0||n<=0)
            return new int[]{};
        boolean[][] isem=new boolean[m+2][n+2];
        int result[]=new int[m*n];
        System.out.println();
        int zm=1;
        int zn=1;
        int zt=0;
        if(n==1)
            zt=1;
        for(int i=0;i<m*n;i++){
            result[i]=matrix[zm-1][zn-1];
            isem[zm][zn]=true;
            switch (zt) {
                case (0):
                    zn++;
                    if(zn+1>n||isem[zm][zn+1]==true)
                        zt=1;
                    break;
                case (1):
                    zm++;
                    if(zm+1>m||isem[zm+1][zn]==true)
                        zt=2;
                    break;
                case (2):
                    zn--;
                    if(zn-1<1||isem[zm][zn-1]==true)
                        zt=3;
                    break;
                case (3):
                    zm--;
                    if(zm-1<1||isem[zm-1][zn]==true)
                        zt=0;
                    break;

            }


            }

        return result;
    }
}
