import java.util.*;
public class class5_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number-");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        int q=0;
        int r=0;

        while(b>0){
            q=a/b;
            r=a%b;
            a=b;
            b=r;
        }
        System.out.println(a);
    }
}
