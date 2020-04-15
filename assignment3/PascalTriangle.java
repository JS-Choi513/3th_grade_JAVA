package assignment3;
import java.util.Scanner;
public class PascalTriangle{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        int pTriangle[][] = new int[22][22];
        pTriangle[0][0] = 0;
        pTriangle[0][1] = 1;
        System.out.print(pTriangle[0][1]);
        for(int i = 1; i<=inputNum; i++){
            System.out.println();
            for(int j = 1; j<=i+1; j++){
                pTriangle[i][j] = pTriangle[i-1][j-1] + pTriangle[i-1][j];
                System.out.print(pTriangle[i][j]+" ");
            }
        }
    }
}