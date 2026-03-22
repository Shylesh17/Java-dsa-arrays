//transpose a matrix

import java.util.*;
public class Array8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] mat=new  int[3][3];
        System.out.println("enter elements for the matrix: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        for(int j=0;j<3;j++){
            for(int i=0;i<3;i++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println(" ");
        }


    }
}
