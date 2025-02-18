import java.util.*;
public class naturalnumber {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
         int y=natural(n);
         System.out.println(y);
         scn.close();
    }

    public static int natural(int x){
        int sum=(x*(x+1))/2;
        return sum;
    }
}
