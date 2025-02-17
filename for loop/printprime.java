import java.util.*;
public class printprime {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        int count=0;
        for(int i=1;i<=x;i++){
            if(x%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
     scn.close();   
    }
}
