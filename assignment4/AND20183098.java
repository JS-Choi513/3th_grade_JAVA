package assignment4;
import java.util.Scanner;
class State{
    static int operateCount = 0;
}
class UserException extends Exception {
    public UserException() {
    }
    public UserException(String msg) {
        super(msg);
    }
}
public class AND20183098 {
    public static void OperatorFail() throws UserException {
        throw new UserException();
    }
    public static int MilkyWayOperation(int num, String operation, int num2) {
        int output = 0;
        int count = 0;
        try {
            if (State.operateCount == 0) {
                if( operation.equals("@")){
                    output = (2*num)+num2;
                    //System.out.println(output);
                }
                else if(operation.equals("#")){
                    output = (2*num)-num2;
                    //System.out.println(output);
                }
                else if(operation.equals("&")){
                    output = (2*num)/num2;
                    //System.out.println(output);
                }
                else OperatorFail();
            }
            return output;
        }
        catch(ArithmeticException e){//정수를 0으로 나눌경우 발생
            System.out.println("Ooops");
            State.operateCount = 1;
        }
        catch(UserException e){
            System.out.println("Are you living in the Milky Way");
        }
        catch(Exception e){//정수를 0으로 나눌경우 발생
            System.out.println("Ooops");
        }
        return 0;
    }
    public static void main(String[] args){
        try{
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        expression = expression.replace(" ","");//받은 문자열에서 공백제거 
        //System.out.println("input String is "+expression);
        String[] array = expression.split("");//문자열을 ""을 기준으로 쪼개서 배열에 저장 
        int[] arrayNum = new int[array.length];//문자열의 길이만큼 정수형 배열생성 
        int ans; // 연산결과값
        for(int i=0;i<=array.length;i++){
            if(i==0){
                arrayNum[0] = Integer.parseInt(array[0]);
            }             
            else if(i==2){
                arrayNum[2] = Integer.parseInt(array[2]);
            } 
            else if(i>0 && array.length>=4){
                arrayNum[4] = Integer.parseInt(array[4]);
            }
        }
        //for(int j = 0;j<arrayNum.length;j++)System.out.println("Number array is "+arrayNum[j]);
        //for(int j = 0;j<array.length;j++)System.out.println("array is"+array[j]);
        if(array.length>3){
            ans = MilkyWayOperation(arrayNum[0],array[1],arrayNum[2]);
            ans = MilkyWayOperation(ans,array[3],arrayNum[4]);
            System.out.println(ans);
        }
        else{
            ans = MilkyWayOperation(arrayNum[0],array[1],arrayNum[2]);
            System.out.println(ans);
        }
        }
        catch(Exception e){
            System.out.println("Wrong Input");
        }
    }
}