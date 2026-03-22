import java.util.*;
//given array contains 0 and 1 , find which is the longest subarray which contains equal 0 and 1
public class Array6 {
    public static void main(String[] args){
        int arr[]={1,0,0,1,0,1,1,0,1};
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int maxlength=0;
        int n=arr.length;
        map.put(0,-1);
        for(int i=0;i<n;i++)
        {
            if (arr[i] == 1) {
                sum += 1;
            } else sum -= 1;

            if (map.containsKey(sum)) {
                int prevInd = map.get(sum);
                int length = i - prevInd;
                maxlength=Math.max(maxlength,length);
            }
            else map.put(sum,i);
        }
        System.out.println("length of max subarray  is " + maxlength);
    }
}
