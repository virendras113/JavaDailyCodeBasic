import java.util.*;
public class class9_2 {
    public static boolean checkChar(char c){
        Boolean flag = Character.isDigit(c);
         if(flag) {
            return false;
         }
         else {
            return true;
         }
    }
    public static int[] ascii(char arr1[]){
        char alpha[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int arr2[] = new int[3];
        int index = 0;
        for(int i=0; i<arr1.length; i++){
            int sum = 0;
            if(checkChar(arr1[i])){
                for(int j=0; j<alpha.length; j++){
                    if(arr1[i]==alpha[j]){
                        sum = 65 + j;
                        arr2[index] = sum;
                        index++;
                        break;
                    }
                }  
            }else if(!checkChar(arr1[i])){
                int a=Integer.parseInt(String.valueOf(arr1[i]));  
                sum = a;
                arr2[index] = sum;
                index++;
                break;
            }
        }
        return arr2;
    }
    public static void main(String args[]){
        
        char arr1[] = {'A', '2'};
        char arr2[] = {'A', 'A', '2'};

        int res1[] = ascii(arr1);
        int res2[] = ascii(arr2);

        for(int i=0; i<res1.length; i++){
            System.out.println(res1[i]);
        }

        
    }
}
