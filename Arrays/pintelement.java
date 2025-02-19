package Arrays;

import java.util.Scanner;

public class pintelement {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        //  array
        int[] arr=new int[n];
        for(int i=0;i<=n-1;i++){
          arr[i]=scn.nextInt();
        }
       
        for(int i=0;i<=n-1;i++){
            System.out.println(arr[i]+" ");
          }
       
        scn.close();
     }
}
