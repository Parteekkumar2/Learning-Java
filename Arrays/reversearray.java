package Arrays;
import java.util.*;
public class reversearray {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=scn.nextInt();
        int[] arr=new int[size];

        System.out.println("enter the element of array");
        for(int i=0;i<=size-1;i++){
            arr[i]=scn.nextInt();
        }
        
        reverse(arr);
        System.out.print("After reverse array: ");
        for(int i=0;i<=size-1;i++){
            System.out.print(arr[i] + " ");
        }
     scn.close();
    }

    public static void reverse(int[] arr){
        int size=arr.length;

        int sp=0;
        int ep=size-1;

        while(sp<ep){
            int temp=arr[sp];
            arr[sp]=arr[ep];
            arr[ep]=temp;

            sp++;
            ep--;
        }

    }
}
