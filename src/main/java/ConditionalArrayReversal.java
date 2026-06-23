// if seccond half of the array is greater than first then reverse the array

import java.util.Arrays;

public class ConditionalArrayReversal {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 7, 9, 4, 4};
        checkarray(arr);

    }
    public static int  checkarray(int[] arr){
        int firstsum=0;
        for(int i=0; i<arr.length/2;i++){
            firstsum+=arr[i];
        }

        int secondsum=0;
        int mid = arr.length/2;
        for(int i=mid;i<arr.length;i++){
            secondsum+=arr[i];
        }
        System.out.println("firstsum=" + firstsum);
        System.out.println("secondsum"+ secondsum);

        int[] reversed=new int[arr.length];
        if(secondsum>firstsum){

            for (int i=0;i<arr.length;i++){
                reversed[i]=arr[arr.length-1-i];

            }

            System.out.print(Arrays.toString(reversed));
        }

        return 0;
    }
}
