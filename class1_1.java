import java.util.Scanner;

public class class1_1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your gender");
        char gender = sc.nextLine().charAt(0);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Enter your Phone no.-");
        long phnno = sc.nextLong(10);
        System.out.println("Enter your CGPA-");
        float cgpa = sc.nextFloat();

        System.out.println("Name- "+ name + "\nGender- " + gender + "\nAge- " + age + "\nPhone no.- " + phnno + "\nCGPA- " + cgpa);
    }
}
