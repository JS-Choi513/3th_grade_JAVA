package assignment3;
import java.util.Scanner;
public class MM20183098{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int matrixA_Row = 0;
        int Acol_Brow = 0;
        int matrixB_Colum =0; 
        int rowCount=0;
        int columCount=0;
        while(true){// 조건에 맞는 입력식 판별(0>&&<=10)
            matrixA_Row = sc.nextInt();//m
            Acol_Brow = sc.nextInt();//n
            matrixB_Colum = sc.nextInt();//r
            if(matrixA_Row>0 && matrixA_Row<=10){
                if(Acol_Brow>0 && Acol_Brow<=10){
                    if(matrixB_Colum>0 && matrixB_Colum<=10) break;
                    else{System.out.println("This number is out of range, only 1~10 natural number available."); matrixB_Colum = 0;}
                } 
                else{Acol_Brow = 0; System.out.println("This number is out of range, only 1~10 natural number available.");}                             
            }
            else {matrixA_Row = 0; System.out.println("This number is out of range, only 1~10 natural number available.");}
        }
        int matrixA[][] = new int[matrixA_Row][Acol_Brow];
        int matrixB[][] = new int[Acol_Brow][matrixB_Colum];
        int matrixANS[][] = new int[matrixA_Row][matrixB_Colum];
        for(int i=0; i<matrixA_Row * Acol_Brow; i++){
            matrixA[rowCount][columCount] = sc.nextInt();
            if(columCount==Acol_Brow-1){//matrixA 행 입력 카운트 
                columCount = -1;
                rowCount = rowCount+1;
            }
            columCount = columCount+1;
        }
        columCount = 0;
        rowCount = 0;
        for(int j=0; j<Acol_Brow * matrixB_Colum; j++){
            matrixB[rowCount][columCount] = sc.nextInt();
            if(columCount==matrixB_Colum-1){//matrixB 행 입력 카운트 
                columCount = -1;
                rowCount = rowCount+1;
            }
            columCount = columCount+1;
        }
        for(int k=0; k<matrixA_Row; k++){
            for(int m=0; m<matrixB_Colum; m++ ){
                for(int l=0; l<Acol_Brow; l++ ){
                    matrixANS[k][m] = matrixANS[k][m] +( matrixA[k][l] * matrixB[l][m] );//행렬곱 연산식
                }
            }
        }
        System.out.println();
         for(int a = 0; a<matrixA_Row;a++){
             for(int b = 0; b<matrixB_Colum;b++){
                 System.out.print(matrixANS[a][b]+" ");
                 if(b == matrixB_Colum-1)System.out.println();
             }
        }
    }
}