// lift max is 8 , given peoples , how many peoples can fit

import java.util.Arrays;

public class Array7 {
    public static void main(String[] args) {
        int[] arr={1,2,5,2,1,3,5};
        int cap = 8;
        int sum = 0;
        int count = 0;
        //sort the array and add the least weight peoples for max number
        Arrays.sort(arr);
        for(int a:arr){
            if(sum+a <= cap){
                sum+=a;
                count++;
            }
            else break;
        }
        System.out.println(count);
    }
}
