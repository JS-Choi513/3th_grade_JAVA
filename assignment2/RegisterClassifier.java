package assignment2;
import java.util.Scanner;
public class RegisterClassifier {
    public static void main(String[] args){
    Scanner scan= new Scanner(System.in);
    String[] Color = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
        String[] ColorValue = new String[3]; 
        ColorValue[0] = scan.next();
        ColorValue[1] = scan.next();
        ColorValue[2] = scan.next();
        int num1=0,num2=0;
        int num3=0;
        long num4 = 1;
        for(int i=0; i<10; i++){

            if(ColorValue[0].equals(Color[i])){ 
                num1 = num1+i;
            }
            if(ColorValue[1].equals(Color[i])){ 
                num2 = num2+i;
            }
            if(ColorValue[2].equals(Color[i])){ 
               num3 = num3+i;         
            }            
        }
        for(int j=0;j<num3;j++) num4=num4*10;

        long result = ((num1 * 10) + num2) * num4;

        System.out.println(result);
    }
}