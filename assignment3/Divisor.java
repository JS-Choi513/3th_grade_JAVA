package assignment3;
import java.util.Scanner;

public class Divisor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numOfDivisor = sc.nextInt();
        int divisorArray[] = new int[numOfDivisor];
        int maxDivisor = 0;
        for(int i=0;i<numOfDivisor;i++){
            divisorArray[i] = sc.nextInt();            
            if(divisorArray[i]>maxDivisor) maxDivisor = divisorArray[i];
        }
        int minDivisor = divisorArray[0];
        for(int j=0;j<numOfDivisor;j++){
            if(divisorArray[j]<minDivisor) minDivisor = divisorArray[j];
        }
        int sourceNum = maxDivisor * minDivisor ;
            System.out.print(sourceNum);
    }

}