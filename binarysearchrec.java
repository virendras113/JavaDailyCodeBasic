import java.util.*;
public class binarysearchrec {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7};
        int s = 0;
        int e = arr.length - 1;
        int target = 8;
        System.out.println(binarysearch(arr, target, s, e));
    }

    static int binarysearch(int arr[], int target, int s, int e){
        if(s>e){
            return -1;
        }

        int m = s + (e - s) / 2;

        if(target == arr[m]){
            return m;
        }

        if(target < arr[m]){
            return binarysearch(arr, target, s, m-1);
        }

        return binarysearch(arr, target, m+1, e);
    }
}
