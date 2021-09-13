import java.util.Locale;
import java.util.Scanner;

public class Print_All_Palindromic_Substrings {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        solution(str);
    }
    static void  solution(String str){
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <=str.length() ; j++) {
                String ss=str.substring(i,j);
                if (isPal(ss)==true){
                    System.out.println(str.substring(i,j));
                }
            }
        }
    }
    static boolean isPal(String str){
        if (str.length()==0){
            return  true;
        }
char strt=str.charAt(0);
char end=str.charAt(str.length()-1);
while (strt<end){
    if (strt!=end){
        return  false;
    }
    strt++;
    end--;

}
return  true;
    }

}
