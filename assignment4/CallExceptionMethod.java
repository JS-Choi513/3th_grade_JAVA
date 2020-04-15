package assignment4;
public class CallExceptionMethod{
    public static void main(String[]args){
        try{
            throw new Exception("Exception 0409");
        } catch(Exception e){
            System.err.println("CaughtException");
            System.err.println("getMessage():"+ e.getMessage());
            System.err.println("toString():"+ e);
            System.err.println("printStackTrace():");
            e.printStackTrace();
        }
    }
}