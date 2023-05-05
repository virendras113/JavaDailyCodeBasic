import java.util.ArrayList;
import java.util.*;
public class class9_1{
    public static void main(String args[]){
        List <String> arr1 = new ArrayList<> (List.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));
        List <String> arr2 = new ArrayList<> (List.of("M", "A", "L", "A", "Y", "A",  "L", "A", "M"));
        List <String> lex = new ArrayList <String> (arr2.size()) ;
        int index = arr2.size()-1;
        int cindex = 0;
        int count = 25;

        for(int i=0; i<arr2.size(); i++){
            
            for(int j=0; j<arr1.size(); j++){
                if(arr2.get(i)==arr1.get(j)){
                    if(j>count){
                        lex.set(index, arr2.get(i));
                        count=j;
                        index--;
                    }else{
                        lex.set(cindex, arr2.get(i));
                        count=j;
                        cindex++;
                    }
                }
            }
        }

        for(int i=0; i<arr2.size(); i++){
            System.out.print(arr2.get(i)+" ");
        }
    }
}