package binary;
import java.util.*;
public class printunique {
    public static void main(String[] args){
        System.out.print("Enter the size n: ");
        Scanner scn=new Scanner(System.in);
        int n =scn.nextInt();

        int[] arr=new int[n];
        System.out.print("Enter the array n: ");
        for(int i=0;i<=n-1;i++){
            arr[i]=scn.nextInt();
        }

        System.out.println(unique(arr,n));
        scn.close();
    }


    public static int unique(int[] arr,int n){
        int ans=0;
        for (int i=0;i<=n-1;i++){
            ans=ans^arr[i];
        }
        return ans;
    }
}
