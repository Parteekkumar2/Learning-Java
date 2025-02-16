import java.util.*;
public class ifstatement {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int age=scn.nextInt();
        if(age>=18){
            System.out.println("elgible");
        }
        if(age<18){
            System.out.println("not eligible");
        }
        scn.close();
    }
}

