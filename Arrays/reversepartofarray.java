package Arrays;
import java.util.*;
public class reversepartofarray {
    public static void main(String[] args){
        System.out.println("Enter the size of array: ");
        Scanner scn=new Scanner(System.in);
        int size=scn.nextInt();

        int[] arr=new int[size];
        System.out.print("Enter the element of array: ");
        for(int i=0;i<=size-1;i++){
            arr[i]=scn.nextInt();
        }

        System.out.print("Enter the first indexes: ");
        int s=scn.nextInt();
        System.out.print("Enter the second Indexes: ");
        int e=scn.nextInt();

        reverse(arr ,s ,e);
        System.out.print("Print the reverse part of array: ");
        for(int i=0;i<=size-1;i++){
            System.out.print(arr[i]+" ");
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
