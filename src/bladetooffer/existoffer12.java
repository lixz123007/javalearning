package bladetooffer;


import java.util.HashSet;
import java.util.Set;

public class existoffer12 {


    public static Set<Integer> hashSet = new HashSet<Integer>();
    public static void main(String[] args) {
        char[][] input={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        //char[][] input={{'a','b'},{'c','d'}};

        System.out.println(exist(input,"ASFDF"));
    }
    public static boolean exist(char[][] board, String word) {
        int n=word.length();
        if(n==0)return false;
        char[] s=word.toCharArray();

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==s[0]){
                    //hashSet.add(i*board[i].length+j);
                    if(isex1(board,s,i,j,0))
                        return true;
                    else
                        hashSet.remove(i*board[i].length+j);

                }

            }

        }
        return false;
    }


    public static boolean isex2(char[][] board,char[] word,int si,int sj,int n,int way){
        System.out.println("si:"+si+" sj:"+sj+" n:"+n+" way:"+way+"zimu:"+board[si][sj]+" wordn"+word[n]);
        if(n==word.length)return true;
        int k=(si-1)*board[si].length+sj;
        if(si-1>=0&&!hashSet.contains(k)){
            if(word[n]==board[si-1][sj]){
                hashSet.add(k);
                if(isex2(board,word,si-1,sj,n+1,1))
                    return true;}
        }
        k=si*board[si].length+sj-1;
        if(sj-1>=0&&!hashSet.contains(k)){
            if(word[n]==board[si][sj-1]){
                hashSet.add(k);
                if(isex2(board,word,si,sj-1,n+1,4))
                    return true;}

        }
        k=(si+1)*board[si].length+sj;
        if(si+1<board.length&&!hashSet.contains(k)){
            if(word[n]==board[si+1][sj]) {
                hashSet.add(k);
                if (isex2(board, word, si + 1, sj, n + 1, 3))
                    return true;
            }
        }
        k=si*board[si].length+sj+1;
        if(sj+1<board[si].length&&!hashSet.contains(k)){
            if(word[n]==board[si][sj+1]){
                hashSet.add(k);
                if(isex2(board,word,si,sj+1,n+1,2))
                    return true;}

        }
        hashSet.remove(si*board[si].length+sj);
        return false;

    }
    public static boolean isex1(char[][] board,char[] word,int si,int sj,int n) {
        System.out.println("si:" + si + " sj:" + sj + " n:" + n  +  " wordn:" + word[n]);
        if (si < 0 || si >= board.length || sj < 0 || sj >= board[0].length || board[si][sj] != word[n]) return false;
        int k = si * board[si].length + sj;
        if (hashSet.contains(k)) return false;
        if (n == word.length - 1) return true;
        hashSet.add(k);
        boolean res =isex1(board, word, si - 1, sj, n + 1) || isex1(board, word, si, sj - 1, n + 1) || isex1(board, word, si + 1, sj, n + 1) || isex1(board, word, si, sj + 1, n + 1);
        hashSet.remove(k);
        return res;
    }



}
