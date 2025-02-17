package function;
import java.util.*;
public class factorial {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int x=fact(a);
        System.out.println(x);
        scn.close();
        }  
        
        public static int fact (int a){
        int ans=1;
        for(int i=1;i<=a;i++){
            ans=ans*i;
        }
        return ans;
        }         
}
