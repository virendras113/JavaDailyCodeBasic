import java.util.*;
import java.util.Arrays;
public class class10_2 {
    public static String[] reverse(String arr1[]){
        String arr2[] = new String[arr1.length];
        for(int i=0; i<arr1.length; i++){
            arr2[arr1.length-i-1] = arr1[i];
        }
        return arr2;
    }
    public static void main(String args[]){
        String arr1[] = {"green"};
        int sum = 0;
        for(int i=0; i<arr1.length; i++){
            sum = 0;
            for(int j=i; j<arr1.length; j++){
                String subarr[] = Arrays.copyOfRange(arr1, i, j);
                String arr2[] = reverse(subarr);
                for(int c=0; c<arr2.length; c++){
                    System.out.println(subarr[c]);
                }
                if(arr2.equals(subarr)){
                    sum = (j+1)-(i);
                }
            }
        }
        System.out.println(sum);
    }   
}
