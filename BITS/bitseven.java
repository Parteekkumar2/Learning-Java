package BITS;
import java.util.*;
public class bitseven {
    public static void main(String[] args){
        System.out.print("Enter the number n: ");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
    
        check(n);
        scn.close();
    }

    public static void check(int n){
        if((n & 1)==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
