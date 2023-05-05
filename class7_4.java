import java.util.*;
public class class7_4 {
    public static void main(String args[]){
        int counter = 0;
        int arr1[] = {1,0,1,0,1,1,1,0,1,0};
        for(int i=0; i<arr1.length; i++){
            if(arr1[i]==0){
                arr1[i]=1;
                break;
            }
        }
        for(int i=0; i<arr1.length; i++){
            if(arr1[i]==1 && arr1[i+1]==1){
                counter++;
            }else{
                break;
            }
        }
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println(counter);
    }
}
