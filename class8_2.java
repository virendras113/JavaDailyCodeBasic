public class class8_2 {
    public static void main(String args[]){
        int arr[] = {3, 3, 4, 3, 3, 1, 2};
        int size = arr.length/2;
        int a = 0;
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>size){
                a = arr[i];
                System.out.println(a);
                break;
            }else{
                System.out.println("-1");
                break;
            }
        }
    }
}
