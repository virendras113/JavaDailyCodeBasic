import java.util.*;
public class class3_1 {
        public static boolean isprime(int n){
            if(n==1 || n==0){
                return false;
            }
            for(int i=2; i<n; i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }

        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);

            int num = sc.nextInt();

            for(int i=0; i<=num; i++){
                if(isprime(i)){
                    System.out.println(i);
                }
            }
        }
    }
