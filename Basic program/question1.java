import java.util.*;
public class question1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();
       if(a>=b && a>=c){
        System.out.println(a + "is greater");
       }else if(b>=a && b>=c){
        System.out.println( b + "is greater ");
       }else{
        System.out.println(  c + "is greater");
       }
       scn.close();
    }
    
    
}

// given 3 number print man out of these

