import java.util.*;
public class divisible2or3 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        if(x%2==0 || x%3==0){
            System.out.println("divisible");
        }else{
            System.out.println("not divisible");
        }
    scn.close();
    }
}

