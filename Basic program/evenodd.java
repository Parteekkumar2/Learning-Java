import java.util.*;
public class evenodd {
    public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    int x=scn.nextInt();
    if(x % 2==0){
        System.out.println("Even");
    }else{
        System.out.println("odd");
    }
    scn.close();
  }
}
