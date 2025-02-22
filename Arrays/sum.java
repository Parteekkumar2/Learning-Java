package Arrays;
import java.util.*;
public class sum {
    public static void main(String[] args){
        System.out.print("Enter the size of array : ");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int[] arr=new int[n];

        System.out.print("Enter the element of array : ");
        for(int i=0;i<=n-1;i++){
            arr[i]=scn.nextInt();
        }
    System.out.print("Enter the value of k : ");
     int k=scn.nextInt();

     
     System.out.print(sum1(arr,k));
     scn.close();

    }

    public static Boolean sum1(int[] arr,int k){
        int n=arr.length;
        for(int i=0;i<=n-2;i++){
            for(int j=i+1;j<=n-1;j++){
                if(arr[i]+arr[j]==k){
                    return true;
                }
            }
        }
        return false;
        
        
    }
}
