import java.util.*;
public class dsa2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> al1 = new ArrayList<>();
        al1.add(20);
        al1.add(40);
        al1.add(60);
        al1.add(80);

        System.out.println(al1);

        for(int x: al1){
            System.out.print(x+ " ");
        }

        int val = al1.get(1);
        System.out.println(val);

        System.out.println(al1);

        for(int y: al1){
            System.out.println("Elements of the ArrayList are: "+ y);
        }
    }
}
