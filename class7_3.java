public class class7_3 {
    public static void main(String args[]){
        int arr1[] = {2,3,4,5,6};
        int mularr[] = new int[15];
        int mul=1;
        int maxmul=0;
        int maxmul2 = 0;
            for(int i=0; i<5; i++){
                int counter = 0;
                while(counter<5 && counter>0){
                    mul=mul*arr1[counter]*arr1[i];
                    if(mul>maxmul){
                        maxmul=mul;
                    }
                    counter++;
                }
                if(maxmul2>mul){
                    continue;
                }
            }
        System.out.println(maxmul);

    }
}
