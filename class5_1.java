import java.util.*;
public class class5_1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        int i=0;

        while(n>0){
            array1.add(n%2);
            n=n/2;
            i++;
        }

        for(int j= i-1; j>=0; j--){
            System.out.println(array1.get(j));
        }

        int c=0;

        for(int j=0; j<array1.size()/2; j++){
            if(array1.get(j)==array1.get(array1.size()-1-j)){
                c++;
            }
        }
 
        System.out.println("counter " + c);

        if(array1.size()%2==0){
            if(c==array1.size()/2){
                System.out.println("Palindrome");
            }else{
                System.out.println("Not a Palindrome");
            }
        }
        else{
            if(c==(array1.size()-1)/2){
                System.out.println("Palindrome");
            }else{
                System.out.println("Not a Palindrome");
            }
        }
        
    }

}
