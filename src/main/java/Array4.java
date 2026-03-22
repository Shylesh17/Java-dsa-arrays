//given an array where the selected number should be greater than previous and next number

public class Array4 {

    public static void main(String[] args){
        int[] arr={1,2,3,4,8,2,1};
        int n=arr.length;
        int result=peakNum(arr , n);
        System.out.println(result);
    }

    public static int peakNum(int[] arr , int n){
        int peak=0;
        for(int i=1;i<n-1;i++){
            if(arr[i]<arr[i+1] && arr[i+1]>arr[i+2]){
                peak=arr[i+1];
            }
        }

        return peak;

    }
}
