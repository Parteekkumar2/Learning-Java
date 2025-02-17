import java.util.*;
public class marks {
public static void main(String[] args){
   Scanner scn=new Scanner(System.in);
   int x=scn.nextInt();
   if(x>90){
    System.out.println("excellent");
   }else if(x>80 && x<=90){
    System.out.println("good");
   }else if(x>70 && x<=80){
    System.out.println("average");
   }else if(x>60 && x<=70){
    System.out.println("below average");
   }else {
    System.out.println("fail");
   }
   scn.close();
}
}
