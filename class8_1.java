public class class8_1 {
    public static void main(String args[]){
        int arr1[] = {4 ,3 , 16, 8 , 17 ,2};

        int maxno=4;
        int c = 0;
        for(int i=c; i<arr1.length; i++){
            if(arr1[i]>maxno){
                maxno = arr1[i];
                System.out.println(maxno);
            }
        }
        System.out.println(arr1[arr1.length - 1]);
    }
}
