package assignment3;
public class Complication{
    public static void main(String[]args){
        int num = 0;
        for(int i = 1;i<10;i++){
            for(int j = 1;j<10;j++){
                num = i*j;
                System.out.print(i+"x"+j+"="+num+" ");
                if(j==9) System.out.println();

            }
            //System.out.println(); 이렇게 해도 됨 
        }
    }
}