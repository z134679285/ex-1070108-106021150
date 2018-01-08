import java.util.Scanner;

public class d {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        System.out.println(fun(n,m));
    }
    public static int fun(int n,int m){
        if(m==0){
            return n;
        }else {
            return fun(m,n%m) ;
        }
    }
}
