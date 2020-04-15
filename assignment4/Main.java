package assignment4;
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
        int maxA = 0; 
        int minB = 0;
        int minSum = 0;
        int index = sc.nextInt();
        int arrayA[] = new int[index];
        int arrayB[] = new int[index];
        for(int i=0;i<arrayA.length;i++){
            arrayA[i] = sc.nextInt();
        }
        for(int j=0;j<arrayB.length;j++){
            arrayB[j] = sc.nextInt();
        }
        for(int l=0;l<index;l++){
            for(int k=0;k<index-l-1;k++){
                if(arrayA[k]>arrayA[k+1]){
                    maxA = arrayA[k];
                    arrayA[k] = arrayA[k+1];
                    arrayA[k+1] = maxA;    
                }
            }
        }
        for(int l=0;l<index;l++){
            for(int k=0;k<index-l-1;k++){
                if(arrayB[k]<arrayB[k+1]){
                    minB = arrayB[k];
                    arrayB[k] = arrayB[k+1];
                    arrayB[k+1] = minB;    
                }
            }
        }
        // for(int m=0;m<arrayA.length;m++){
        //     System.out.println(arrayA[m]);
        // }
        // for(int m=0;m<arrayA.length;m++){
        //     System.out.println(arrayB[m]);
        // }
         for(int k=0;k<arrayA.length;k++){
             minSum = minSum +(arrayA[k]*arrayB[k]);
         }
         System.out.println(minSum);
    }
}