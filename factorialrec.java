public class factorialrec {
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }

    public static void main(String args[]){
        int n = 4;
        int ans = fact(n);
        System.out.println(ans);
    }
}
