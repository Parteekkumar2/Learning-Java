package Arrays;

import java.util.Scanner;

public class printsum {
      public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        //  array
        int[] arr=new int[n];
        for(int i=0;i<=n-1;i++){
          arr[i]=scn.nextInt();
        }
        
          int sum=0;
        for(int i=0;i<=n-1;i++){
            sum=sum+arr[i];
          }
       System.out.println(sum);
        scn.close();
     }
}
