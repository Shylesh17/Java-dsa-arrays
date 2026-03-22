//given array and target , choose two element who sum is = target fi two or more pair is identified
// then the product must be greater and also the first element is greater than the second  element of result

public class Array3 {

    public static void main(String[] args){

        int[] arr={2,4,5,6,9,8,11,13,6,7};
        int n=arr.length;
        int[] result=maxProduct(arr, n);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }

    public static int[] maxProduct(int[] arr , int n){

        int target=20;
        int maxproduct=Integer.MIN_VALUE;
        int sum=0;
        int[] result=new int[2];
        for(int i=0; i<n; i++){
            for (int j=i+1;j<n;j++){
                sum=arr[i]+arr[j];
                if(sum==target){
                    int product=arr[i]*arr[j];
                    if(product>maxproduct){
                        maxproduct=product;
                        if(arr[i]>arr[j]){
                            result[0]=arr[i];
                            result[1]=arr[j];
                        }
                        else{
                            result[0]=arr[j];
                            result[1]=arr[i];
                        }
                    }
                }
            }
        }
        return result;
    }
}

