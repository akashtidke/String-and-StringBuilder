import java.util.Scanner;

public class Toggle_case {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        String str= scn.next();
        System.out.println(toggle(str));
    }
    static String toggle(String str){
StringBuilder sb=new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            char ch=sb.charAt(i);
if(ch>='a'&&ch<='z'){
//   char  upperCase= (char) ('A'+ch-'a');
 char upperCase=Character.toUpperCase(ch);
   sb.setCharAt(i,upperCase);
}else if(ch>='A'&&ch<='Z'){
  //  char  lowerCase= (char) ('a'+ch-'A');
    char lowerCase=Character.toLowerCase(ch);
    sb.setCharAt(i,lowerCase);
}
        }
return sb.toString();
    }
}
