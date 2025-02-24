package Strings;
public class reversestring {
    public static void main(String[] args){
        String st="HELLO";
        
      System.out.println(reverse(st));

    }

    public static String reverse(String st){
        char[] ch=st.toCharArray();
        int sp=0;
        int ep=ch.length-1;
        while(sp<ep){
            char temp=ch[sp];
            ch[sp]=ch[ep];
            ch[ep]=temp;
            sp++;
            ep--;
        }
       return "".valueOf(ch);
    }
}
