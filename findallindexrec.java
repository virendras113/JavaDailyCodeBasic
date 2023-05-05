import java.util.*;
public class findallindexrec {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,6,7,4,4,4};
        int target = 4;
        int index = 0;
        printallindex(arr, target, index);
        System.out.println(list);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    public static void printallindex(int arr[], int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
            printallindex(arr, target, index+1);
        }else{
            printallindex(arr, target, index+1);
        }
    }
}
