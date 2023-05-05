import java.util.*;
public class class7_1 {
    public static void swap(int[] arr, int aIndex, int bIndex, int k){
        int temp;
        for(int i=0; i<k; i++){
            temp=arr[aIndex+i];
            arr[aIndex + i]=arr[bIndex + i];
            arr[bIndex + i]=temp;
        }
    }
    public static int[] rotate(int arr1[], int r, int n){
        if(r==0 || r==n){
            return arr1;
        }
        int A=r; 
        int B=n-r;
        while(A!=B){
            if(A<B){
                swap(arr1, r-A, r-A+B, A);
                B=B-A;
            }else{
                swap(arr1, r-A, r, B);
                A=A-B;
            }
            swap(arr1, r-A,r,A);
            //return arr1;
        }
        return arr1;
    }
    public static void main(String args[]){
        int arr1[] = {1,2,3,4,5};
        int r=2;
        int n=arr1.length;
        int res[] = new int[n];
        res=rotate(arr1, r, n);
        for(int i=0; i<n; i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
