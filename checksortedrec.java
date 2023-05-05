public class checksortedrec {
    public static void main(String args[]){
        int arr[] = {1,7,8};
        int index = 0;
        boolean b = checksort(arr, index);
        System.out.println(b);
    }
    public static boolean checksort(int arr[], int index){
        if(index == arr.length-1){
            return true;
        }
        if(arr[index]<arr[index+1]){
            return checksort(arr, index+1);
        }
        return false;
    }
}
