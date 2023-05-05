import java.util.Scanner;

class class1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter the gender of the person (F/M)");
        String gender = sc.nextLine();
        System.out.println("Enter the age of the person");
        int age = sc.nextInt();  
        
    // two approached used, first one is simple nesting of if else loops and the second one is a less complex and better program with the help of && and ||
        if(gender.equals("M")){
            if(age >= 24){
                System.out.println("Allowed to Marry");
            }
            else{
                System.out.println("Not allowed to Marry");
            }
        } 
        else{
            if(age>=21){
                System.out.println("Allowed to Marry");
            }
            else{
                System.out.println("Not allowed to Marry");
            }
        }   
        
        if((gender.equals("M") && age>=24) || (gender.equals("F") && (age>=21))){
            System.out.println("Allowed to Marry");
        }
        else{
            System.out.println("Not Allowed to Marry");
        }
    }
}