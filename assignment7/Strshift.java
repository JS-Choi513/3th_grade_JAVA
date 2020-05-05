package assignment7;
import java.util.Scanner;

public class Strshift {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어 한글 모두 됩니다.");
        String input = sc.nextLine();
        int count = input.length();
        for(int i=1;i<=count;i++){
            System.out.print(input.substring(i,count));
            System.out.println(input.substring(0,i));
        }
    }
}