package assignment2;
import java.util.Scanner;
    public class HomomorphicAdd{
        public static void main(String[] args){
            
            Scanner sc = new Scanner(System.in);
            int com1, com2, result;
            System.out.print("First integer? ");
            com1 = sc.nextInt();
            System.out.print("Second integer? ");
            com2 = sc.nextInt();
 
            byte shiftAdd[][]= new byte[8][2]; // 입력받은 두 숫자를 1바이트 별로 쪼개서 저장하기 위한 2차원 배열 선언 
            result = 0; // 결과값 초기화 
            for(int i=0;i<8;i++) // X축에 1바이트 씩 8바이트를 저장하는 반복문  
            {
                if(i<4){
                    shiftAdd[i][0] = (byte)(com1 >>> 24-(8*i)); // com1 에 저장된 숫자를 shiftAdd[i][0] i=0~3 까지 저장
                }
                else{ 
                    shiftAdd[i][0] = (byte)(com2 >>> 24-(8*(i-4)));// com2 에 저장된 숫자를 shiftAdd[i][0] i=4~7 까지 저장
                }                
            }
            for(int k=0;k<4;k++){ // shiftAdd[k][1] k=0~3 까지 1바이트씩 쉬프트 연산이 끝난 수를 끊어서 저장 
                shiftAdd[k][1] = (byte)(shiftAdd[k][0] + shiftAdd[k+4][0]); 
                if (shiftAdd[k][1] == 0b11111111||shiftAdd[k][1] == 0b00000001) shiftAdd[k][1] = (byte)(shiftAdd[k][1]);
                if (shiftAdd[k][1]<0) shiftAdd[k][1] = (byte)(shiftAdd[k][1]+1);

            }
            result =  (shiftAdd[0][1] << 24) + (shiftAdd[1][1] << 16) + (shiftAdd[2][1] << 8) + shiftAdd[3][1];//result 에 1바이트씩 저장
            System.out.println("Result = " + result);
            System.out.println(Integer.toBinaryString(result));      
    }
}
// 00000001 00110011 11111000 00111010  
//       1         51       248         58

//                                    00000001 00000001 00000001 00000001  // 16843009
//11111111 11111111 11111111 11111111 10000111 11001101 10011011 11111110‬ // -2016568322
                              //        10000111 11001101 10011011 11111111 // -2016568321
                                   //   10001000 11001110 10011101 00000000 // -1999725312 현재값
//  11111111 11111111 11111111 11111111 10001000 11001110 10011100 11111111 // -1999725313 목표값
                                    //     1111000 00110010 01100100 00000001
                                      // 1110110 00110000 01100001 11111111
                                   //   10001000 11001110 10011101 00000000 -1999725312

                                    //  10001000 11001110 10011101 00000000
//                                      11110111 00110010 11101001 10100000‬
//  11111111 11111111 11111111 11111111 11111111 11111111 11111110 11110001  // -271 현재 잘못된 값

//10000111 11001101 10011011 11111111
//10001000 11001110 10011010 11111111   

//  10001000 00000000 00000000 00000000
//  11111111 11001110 00000000 00000000
//  11111111 11111111 10011100 00000000‬
//  11111111 11111111 11111111 11111111‬
//  00000001 00110010 11111000 00111001
            //   50               57
// 00000001 00110011 11111000 00111010 / 20183098
       //   1 00110010 11111000 00111010
//00001000

       //   1 00110010 11111001 00111010
     //     1 00110011 00000111 00111010
     //     1 00110011 00000110 00111010
     //     1 00110011 00000111 00111010
//        1 00110010 11110111 00111010
//        1 00110010 11111001 00111010
//        1 00110011 11111000 00111001
//        1 00110011 11111000 00111011
//     1         51      248     58
//       1 00110011 11111000 00101110
//       1 00110010 11111000 00111010
//       1 00110010 11111000 00111010
//       1 00110010 11111000 00111010//
//       1 00110010 11111000 00111010
//00000001 00110011 00000000 00000000 //20119552
//00000000 00000000 11111000 00111010 // 63546
                        //if(k==3) shiftAdd[k][1] =(byte)(shiftAdd[k][1] + 0b00000001);
               // shiftAdd[k][1] = (byte)(shiftAdd[k][1]+1); 
            // System.out.println("Result = " + result);