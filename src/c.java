import java.util.Scanner;

public class c {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        System.out.println(fun(n));
    }
    public static int fun(int n){
        if(n==1 ||n==2){
            return 1;
        }else {
            return fun(n-1)+fun(n-2) ;
        }
    }
}
