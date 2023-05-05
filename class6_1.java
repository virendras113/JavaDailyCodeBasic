import java.util.*;
public class class6_1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int t;
        int arr1[] = new int[8];
        for(int i=7; i>=0 && n1>=1; i--){
            arr1[i]=n1%2;
            n1=n1/2;
        }

        int arr2[] = new int[8];

        for(int i=0; i<4; i++){
            arr2[i]=arr1[i+4];
        }
        for(int i=4; i<8; i++){
            arr2[i]=arr1[i-4];
        }
        for(int i=0; i<8; i++){
            System.out.print(arr2[i]);
        }
        String str = "";
        for(int i=0; i<8; i++){
            str+=arr2[i];
        }
        System.out.println();
        System.out.println(Integer.parseInt(str,2));


    }
}
