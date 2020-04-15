package assignment4;
public class DivideByZero{
    public static void main(String[]args){
        try{
            System.out.println(3/0);
        } catch(Exception e){//Exception의 계층구조: Exception->RuntimeException->ArithmeticException 을 가진다.
            //따라서 예외선언타입을 상위 계층으로 지정해도 같은 결과가 나온다.
            System.out.println("Caugth runtime exception(0409) => "+ e);
        }
        
    }
}