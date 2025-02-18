package function;
import java.util.*;
public class ncr {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int r=scn.nextInt();

        int ans1=fact(n);
        int ans2=fact(r);
        int ans3=fact(n-r);
        int ans=ans1/(ans2*ans3);
        System.out.println(ans);
        scn.close();
    }

    public static int fact(int x){
        int ans4=1;
        for(int i=1;i<=x;i++){
            ans4=ans4*i;
        }
        return ans4;
    }
}
