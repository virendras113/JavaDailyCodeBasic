import java.util.*;
public class class7_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows= sc.nextInt();
        int cols = sc.nextInt();
        int arr1[][] = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        int sum = 0;
        int maxsum = 0;
        for(int i=0; i<=rows-3; i++){
            for(int j=0; j<=cols-3; j++){
                sum = arr1[i][j] + arr1[i][j+1] + arr1[i][j+2] + arr1[i+1][j+1] + arr1[i+2][j] + arr1[i+2][j+1] + arr1[i+2][j+2];
                if(sum>maxsum){
                    maxsum=sum;
                }
            }
        }
        System.out.println(maxsum);
    }

}
