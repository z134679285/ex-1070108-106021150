import java.util.Scanner;

public class a {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        System.out.println(fun(n));
}
 public static int fun(int n){
        if(n==1){
            return 1;
        }else {
            return n*fun(n-1) ;
        }
    }
}
