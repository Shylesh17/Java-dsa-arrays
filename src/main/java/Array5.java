//median of two sorted array

public class Array5 {

public static float findmedian(int[] arr1, int[] arr2){

    int i=0, j=0, k=0;
    int[] m=new int[arr1.length+arr2.length];

    while(i<arr1.length && j<arr2.length && k<=m.length/2){
        if(arr1[i]<arr2[j]){
            m[k]=arr1[i];
            i++;
            k++;
        }
        else{
            m[k]=arr1[j];
            j++;
            k++;
        }
    }

    while(i<arr1.length && k<=m.length/2){
        m[k]=arr1[i];
        i++;
        k++;
    }
    while(j<arr2.length && k<=m.length/2){
        m[k]=arr2[j];
        j++;
        k++;
    }

    if(m.length%2==0){
        int mid=m.length/2;
        return (float)(m[mid]+m[mid-1])/2;
    }
    else{
        int mid=m.length/2;
        return m[mid];
    }

}

public static void main(String[] args){
    int[] arr1={2,3,1,4};
    int[] arr2={11,5,9,7,8};
    System.out.println(findmedian(arr1,arr2));
}

}
