import java.util.*;
 class class2_1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr1[] = {1,2,3,4,5};
        int a = sc.nextInt();
        for(int i=0; i<arr1.length; i++){
            if(arr1[i]==a){
                System.out.println("Present");
                return;
            }
        }
        System.out.println("Absent");
    }
}