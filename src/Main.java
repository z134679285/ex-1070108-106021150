import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[]v1=new int[4];
        for(int i=3;i>=0;i--){
            v1[i]=n%10;
            n=n/10;
        }
        int a[][][] = {
                {
                        {1, 1, 1, 1, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 1, 1, 1, 1},
                }
        }
        ;
        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                for(int k=0;k<5;k++){
                    if(a[i][j][k]==1){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}