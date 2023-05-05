import java.util.Scanner;
public class class4_1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int d, R=0;
        for(int i=0; i<=range; i++){
            int t=i;
            while(t>0){
                d=t%10;
                R=R*10;
                if(d==1 || d==0 || d==8 || d==6 || d==9){
                    if(d==6){
                        d=9;
                    }
                    else if(d==9){
                        d=6;
                    }
                    R=R+d;
                    t=t/10;
                    if(R==i){
                        System.out.println(i);
                    }
                }
                continue;
            }
        }
    }
}