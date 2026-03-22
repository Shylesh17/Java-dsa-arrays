//select two points , calc the avg the nums greater than avg is summed others changed to 0.

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args){
        int[] arr = {1,2,4,9,5,10};
        int result=minArr(arr);
        System.out.println(result);
    }

    public static int minArr(int arr[]){
        int total=0;
        Arrays.sort(arr);

        int max1=arr[arr.length-1];
        int max2=arr[arr.length-2];
        double avg= (max1+max2)/2;
        for(int num: arr){
            if(num>avg){
                total+=num;
            }
        }

        return total;
    }

}
