import java.util.Scanner;
public class input{
    public static void main(String[] args) {
         Scanner scn=new Scanner(System.in);
         int x = scn.nextInt();
         int y = scn.nextInt();
         System.out.print(x+y);
         scn.close();
    }
}