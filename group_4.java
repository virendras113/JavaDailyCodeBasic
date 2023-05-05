import java.util.*;
public class group_4 {
    public static int getLen(int len){
        int ans = 0;
        for(int i=len-1; i>=1; i--){
            ans+=i;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        int count1 = 0;

        for(int i=n1; i<=n2; i++){
            int count = 0;
            int temp = i;
            String str = String.valueOf(temp);
            int len = getLen(str.length());
            for(int j=0; j<str.length(); j++){
                for(int k=j+1; k<str.length(); k++){
                    if(str.charAt(j)==str.charAt(k)){
                        continue;
                    }else{
                        count++;
                    }
                }
            }
            if(count==len){
                count1++;
            }
        }
        System.out.println(count1);
    }
}
