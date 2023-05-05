import java.util.*;
public class int2 {
    public static void main(String args[]){
        boolean b = true;
        for(int i=5; i<=1; i++){
            if(b){
                System.out.println("*");
                b = false;
            }else{
                System.out.println("@");
                b = true;
            }
        }
    }
}
