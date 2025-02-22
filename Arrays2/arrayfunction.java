package Arrays2;

import java.util.Scanner;

public class arrayfunction {
     public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();

        int[][] arr=new int[n][m];

        for(int i=0;i<=n-1;i++){
            for(int j=0;j<=m-1;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        rowwise(arr);
        scn.close();

    }

    public static void rowwise(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<=m-1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
