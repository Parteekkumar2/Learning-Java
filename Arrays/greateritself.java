package Arrays;
import java.util.*;
public class greateritself {
    public static void main(String[] args){
        System.out.print("enter the size of arra : ");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        System.out.print("enter the element  of array: ");
        int[] arr=new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i]=scn.nextInt();
        }
        
        System.out.print("Ans : ");
        int ans=countgreater(arr);
        System.out.print(ans);

        scn.close();
    }

    public static int countgreater(int[] arr){
        int n=arr.length;
           int max=arr[0];
           for(int i=0;i<=n-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
           }
           int maxcount=0;
           for(int i=0;i<=n-1;i++){
            if(arr[i]==max){
                maxcount++;
            }
           }

           return n-maxcount;
    }

}
