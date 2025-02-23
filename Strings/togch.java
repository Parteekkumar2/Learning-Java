package Strings;
public class togch {
    public static void main(String[] args){
        char[] ch={'A','B','c','d','e'};

    tog(ch);
    // for(int i=0;i<ch.length;i++){
        System.out.print(ch);
    // }

    
    }
       
        
    

    public static void tog(char[] ch){
        for(int i=0;i<=ch.length-1;i++){
            if(ch[i]>=65 && ch[i]<=90){
                ch[i]=(char)(ch[i]+32);
            }else{
                ch[i]=(char)(ch[i]-32);
            }
        }
    }
}

