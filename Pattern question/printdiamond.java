import java.util.*;
public class printdiamond {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int nst=1;
        int nsp=n/2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=nst;k++){
                System.out.print("*");
            }
            if(i<=n/2){
                nst=nst+2;
                nsp=nsp-1;
            }else{
                nst=nst-2;
                nsp=nsp+1;
            }
            System.out.println();
        }
        scn.close();
    }
}
