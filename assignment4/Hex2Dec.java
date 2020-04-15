package assignment4;
import java.util.Scanner;
class InvalidHexException extends RuntimeException  {}
public class Hex2Dec{
    public static void main(String[] args){
        String hex;
        int dec = 0;
        char currChar;
        Scanner sc = new Scanner(System.in);
        System.out.print("Hexadecimal number?");
        hex = sc.next();
        try{ 
        for (int i=0; i<hex.length();i++){
                dec = dec * 16;
                currChar = hex.charAt(i);
                if(currChar >= '0' && currChar <='9'){
                    dec += currChar - '0';
                } else if(currChar >='a'&& currChar <= 'f'){
                    dec += currChar - 'a' + 10;
                } else if(currChar >= 'A' && currChar <= 'f'){
                    dec += currChar - 'a' + 10;
                } else{
                    throw new InvalidHexException();
                }
                }
                System.out.println("Hexadecimal = "+ hex);
                System.out.println("Decimal = "+ dec);
            }catch(InvalidHexException e){
                System.out.println("caugth InvalidGexException: Enter valid hex value");
            }
        } 
    }



