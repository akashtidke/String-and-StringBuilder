import java.util.Scanner;

public class Print_All_Permutations_Of_A_String_Iteratively {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str= scn.next();
int ans1=fact(str);
        System.out.println(ans1);
        for (int i = 0; i <ans1 ; i++) {
            StringBuilder sb=new StringBuilder(str);
            for (int j = str.length(), dvd=i; j >0 ; j--) {
int r=dvd%j;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                dvd=dvd/j;
            }
            System.out.println();
        }
    }
    static int fact(String str){
        int ans=1;
        for (int i =1; i <=str.length() ; i++) {
            ans*=i;
        }
        return ans;
    }
}
