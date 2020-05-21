package assignment10;
import java.io.*;
import java.util.Scanner;

public class FilereaderSCEx {
    public static void main(String[] args){
        
        File f2 = null;
        Scanner sc = null;

        try{
            f2 = new File("c:\\Windows\\system.ini");
            sc = new Scanner(f2); // Scanner 생성자로 파일 객체를 넘겨준다. File 객체는 경로에 해당하는 파일의 정보를 가지고 있다. 
            int lineNum = 0;
            System.out.println(f2.getPath() + " 파일을 읽어 출력합니다.");
            while (sc.hasNext()) {// 파일의 다음행이 존재하는지 확인
                System.out.print(lineNum+": ");
                System.out.println(sc.nextLine());//행 단위로 출력 
                lineNum++;
            }

        }catch(IOException e){
            System.err.println("파일 입출력 오류");
        }
    }
}