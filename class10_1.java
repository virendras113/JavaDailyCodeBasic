import java.util.*;
public class class10_1 {
    public static void main(String args[]){
        String arr1[] = {"a", "a", "b", "b", "e"};
        int arr2[] = {5, 4, 3, 2, 1, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6};
        int k = 5;
        int count = 0;
        int i=0;
        while(i<arr1.length){
            int sum = 0;
            for(int j=i; j<=arr1.length; j++){
                sum = sum + arr2[j];
                if(sum<=k){
                    count++;
                }
            }
            i++;
        }
        System.out.println(count);
    }
}
