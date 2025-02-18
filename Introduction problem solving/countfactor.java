import java.util.*;
public class countfactor {
    public static void main(String[] args){
     Scanner scn = new Scanner(System.in);
     int n=scn.nextInt();
     int count=0;
     for(int i=1;i*i<=n;i++){
        if(n%i==0){
            if(i==n/i){
                count=count+1;
            }else{
                count=count+2;
            }
        }
     }
     System.out.println(count);
     scn.close();                                                                                                         
    }
}
