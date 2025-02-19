import java.util.*;
public class floorsqrtn {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int ans1=sqrt(n);
        System.out.println(ans1);
        scn.close();
    }

    public static int sqrt(int n){
        int ans=1;
        int i=1;
        while(i*i<=n){
            ans=i;
            i++;
        }
        return ans;
    }
}
