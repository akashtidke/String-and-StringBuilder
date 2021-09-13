import java.util.Scanner;

public class String_Compression {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        System.out.println(first(str));
        System.out.println(comp2(str));
    }
    static String first(String str){
        String ans="";
        ans+=str.charAt(0);
        for (int i = 1; i <str.length() ; i++) {
            char current=str.charAt(i);
            char prev=str.charAt(i-1);
            if (current!=prev){
                ans+=current;
            }
        }
        return ans;
    }
    static String comp2(String str){
        String ans="";
        ans+=str.charAt(0);
        int count=1;
        for (int i = 1; i <str.length() ; i++) {
            char current=str.charAt(i);
            char prev=str.charAt(i-1);
           if(current==prev){
               count++;
           }else {
               if (count>1){
                   ans+=count;
                   count=1;
               }
               ans+=current;
           }
        }
        if (count>1){
            ans+=count;
            count=1;
        }
        return ans;
    }
}
