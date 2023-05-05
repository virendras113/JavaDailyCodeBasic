import java.util.*;
public class daysleft {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int date = sc.nextInt();
        int days = 9-date;
        int wdays = 6-date;
        int surday = 74 + date;

        System.out.println("Total Days Left- "+ days);
        System.out.println("Working Days- "+ wdays);
        System.out.println("Survival Day- "+ surday);

    }
}
