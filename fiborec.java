import java.util.*;
public class fiborec {
    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String args[]){
        int ans = fibo(4);
        System.out.println(ans);
    }
}
