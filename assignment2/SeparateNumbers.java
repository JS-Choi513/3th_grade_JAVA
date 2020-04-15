package assignment2;
import java.util.Scanner;
    public class SeparateNumbers{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            byte a, b, c, d;
            int com;
            System.out.print("Integer number? ");
            com = sc.nextInt();

            a = (byte)(com >>> 24);//>>> 연산은 음수 양수 관계없이 무조건 0으로 채움 
            b = (byte)(com >>> 16);
            c = (byte)(com >>> 8);
            d = (byte)(com);
            System.out.println("First number is " + a);
            System.out.println("Second number is " + b);
            System.out.println("Third number is " + c);
            System.out.println("Forth number is " + d);        
        }
    }



// 하나의 정수가 입력되면 이를 4개의 바이트 정수로 분리 
// 10000111 11001101 10011011 11111111  >> -2016568321
// 01111000 00110010 01100100 00000000  >>  2016568321
// 10001000 11001110 10011100 11111111  >> -1999725313
// 01110111 00110001 01100011 00000001  >>  1999725313
//  01110111 00110001 01100011 00000000  >> 1999725312
// 120 = 01111000  50 = 00110010  100 = 01100100  1 = 00000001
//-120 = 10001000 -50 = 11001110 -100 = 10011100 -1 = 11111111
//   00000001 00110011 11111000 00111010 = 20183098

