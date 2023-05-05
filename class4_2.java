import java.util.*;

public class class4_2
{
    
    public static boolean check(int num){
        int t = num;
		int d, R = 0;
		
		while(t>0){
		    d = t%10;
		    R = R*10;
		    
		    if(d==0 || d==1 || d==6 || d==8 || d==9){
		        if(d==6){
		            d = 9;
		        }
		        else if(d==9){
		            d = 6;
		        }
		    }
		    else{
		        break;
		    }
		    
		    R = R+d;
		    t = t/10;
		}
		
		if(R == num){
		    return true;
		}
		return false;
    }
    
	public static void main(String[] args) {
				
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i=1; i<=999; i++){
		    if(check(i)){
		        arr.add(i);
		    }
		}
		
		
		System.out.println(arr);
		
		
	}
}