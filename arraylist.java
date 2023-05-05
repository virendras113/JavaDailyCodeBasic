import java.util.*;
public class arraylist {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList <String> list1 = new ArrayList <String> ();
        list1.add("Mango");
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Grapes");
        System.out.println(list1);
        Iterator itr = list1.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+ " ");
        }
        System.out.println("");
        for(String fruits: list1){
            System.out.print(fruits + " ");
        }
        System.out.println(" ");
        System.out.println(list1.get(0));
        list1.set(1, "Jackfruit");
        System.out.println(list1);
        List <Integer> list2 = new ArrayList <Integer>();
        list2.add(23);
        list2.add(45);
        list2.add(56);
        list2.add(11);
        Collections.sort(list2);
        for(int val: list2){
            System.out.print(val + " ");
        }
        System.out.println(" ");

    }
}
