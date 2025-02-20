package Arrays;
import java.util.*;
public class rotatearray {
    public static void main(String[] args){
    System.out.print("Enter the size of array: ");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int[] arr=new int[n];

        System.out.print("Enter the element of array: ");
        for(int i=0;i<=n-1;i++){
            arr[i]=scn.nextInt();
        }

        System.out.print("Rotate the array by k times: ");
        int k=scn.nextInt();

        k = k % n;
        // reverse the array
       reverse(arr,0,n-1);
        //reverse first k element
        reverse(arr,0,k-1);
        //Reverse after element
        reverse(arr,k,n-1);

        for(int i=0;i<=n-1;i++){
            System.out.print(arr[i]);
        }
        scn.close();
    }

    public static void reverse(int[] arr,int s,int e){
        int sp=s;
        int ep=e;

        while(sp<ep){
            int temp=arr[sp];
            arr[sp]=arr[ep];
            arr[ep]=temp;

            sp++;
            ep--;
        }
    }
}
