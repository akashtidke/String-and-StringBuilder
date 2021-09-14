import java.util.ArrayList;
import java.util.Scanner;

public class Remove_Primes {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(scn.nextInt() );
        }
        for (int i = al.size()-1; i >= 0; i--) {
            int val= al.get(i);
            if (isPrime(val)==true){
                al.remove(i);
            }
        }
        System.out.println(al);
    }
    static boolean isPrime(int al){
        for (int i = 2; i*i <=al ; i++) {
            if(al%i==0){
                return false;
            }
        }
        return true;
    }
}
