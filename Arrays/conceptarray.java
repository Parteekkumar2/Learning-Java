package Arrays;
import java.util.*;
public class conceptarray {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        //  array
        int[] arr=new int[n];
        for(int i=0;i<=n-1;i++){
          arr[i]=scn.nextInt();
        }
    
       System.out.println(arr.length);
        scn.close();
     }
}
