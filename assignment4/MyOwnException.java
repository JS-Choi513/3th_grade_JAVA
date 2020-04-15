package assignment4;
class MyException extends Exception{
    public MyException(){}
    public MyException(String msg){
        super(msg);
    }
}

public class MyOwnException {
    public static void f() throws MyException {
        throw new MyException("from f()");
    }
    public static void main(String[] args){
        try{
            throw new MyException("in main()");
        } catch(MyException e){
            e.printStackTrace();
        }
        try{
            f();
        } catch(MyException e){
            e.printStackTrace();
        }
    }
}