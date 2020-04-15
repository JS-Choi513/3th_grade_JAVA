package assignment3;
import java.util.Scanner;
public class Comparator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int compareNum[] = new int[7];
        int max=0;
        int secondMax=0;
        int same=0;
        for(int i=0;i<7;i++){
            int inputNum = sc.nextInt();
            if(inputNum>0) compareNum[i] = inputNum;    
            if(compareNum[i] > max) max = compareNum[i];
            }
        for(int k=0;k<7;k++){
            if(compareNum[k] > secondMax && compareNum[k] < max) 
             secondMax = compareNum[k];
            if(compareNum[0]==compareNum[k]) same=same+1;
        }
        if(same == 7)System.out.println("없음");
         else System.out.println(secondMax);        
    }
}


