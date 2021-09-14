import java.util.Scanner;

public class String_With_Difference_Of_Every_Two_Consecutive_Characters {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str= scn.next();
        StringBuilder sb=new StringBuilder();

        char ch1=str.charAt(0);
 sb.append(ch1);

        for (int i = 1; i <str.length() ; i++) {
char current=str.charAt(i);
char prev=str.charAt(i-1);
int gap=current-prev;
sb.append(gap);
sb.append(current);

        }
        System.out.println(sb);
    }
}
