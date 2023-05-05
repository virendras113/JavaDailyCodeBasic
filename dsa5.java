import java.util.*;

public class dsa5 {
    public static class Person{
        int age;
        String name;

        void saysHi(){
            System.out.println(name + "[" + age + "] says Hi!");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Person p1 = new Person();
        System.out.println("Enter the age of the first person- ");
        p1.age = sc.nextInt();
        System.out.println("Enter the name of the first person- ");
        p1.name = sc.next();

        Person p2 = new Person();
        System.out.println("Enter the age of the second person- ");
        p2.age = sc.nextInt();
        System.out.println("Enter the name of the second person- ");
        p2.name = sc.next();

        p1.saysHi();
        p2.saysHi();

        swap1(p1, p2);

        p1.saysHi();
        p2.saysHi();
    }

    public static void swap1(Person p1, Person p2){
        int age = p1.age;
        p1.age = p2.age;
        p2.age = age;

        String name = p1.name;
        p1.name = p2.name;
        p2.name = name;
    }
}
