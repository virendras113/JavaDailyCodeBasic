import java.util.*;
public class leetcode5 {
    public static int pivotIndex(int[] nums) {
        int leftsum = 0;
        int rightsum = 0;
        int totalsum = 0;
        int arr1[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            totalsum += nums[i];
        }
        for(int i=0; i<nums.length; i++){
            if(i==0){
                leftsum = 0;
                rightsum = totalsum - nums[i];
                int ele = 0;
                ele = rightsum - leftsum;
                arr1[0] = ele;
            }else{
                int ele = 0;
                leftsum = leftsum + nums[i-1];
                rightsum = totalsum - (nums[i]+leftsum);
                ele = rightsum - leftsum;
                arr1[i] = ele;
            }
        }
        int index = -1;
        for(int i=0; i<arr1.length; i++){
            if(arr1[i]==0){
                index = i;
            }
        }
        System.out.println(totalsum);
        System.out.println(Arrays.toString(arr1));
        return index;
    }
    public static void main(String args[]){
        int arr[] = {1,7,3,6,5,6};
        int ans = pivotIndex(arr);
        System.out.println(ans);
    }
}
