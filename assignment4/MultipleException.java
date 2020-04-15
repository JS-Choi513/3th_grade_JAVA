package assignment4;
import java.util.Scanner;
import java.util.InputMismatchException;
public class MultipleException {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            int divisor = sc.nextInt();
            System.out.println(3/divisor);
        } catch(InputMismatchException e){
            System.out.println("Exception: Enter numeric value.");
        } catch(ArithmeticException e){
            System.out.println("Exception: Divisor was 0.");
        }
        System.out.println("After exception");
    }
}