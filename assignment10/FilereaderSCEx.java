package assignment10;
import java.io.*;
import java.util.Scanner;

public class FilereaderSCEx {
    public static void main(String[] args){
        
        FileReader f1 = null;
        BufferedOutputStream bout = null;
        File f2 = null;
        Scanner sc = null;
        
        try{
            f1 = new FileReader("c:\\Windows\\system.ini");
            f2 = new File("c:\\Windows\\system.ini");
            sc = new Scanner(f2);
            int lineNum = 0;
            System.out.println(f2.getPath() + " 파일을 읽어 출력합니다.");
            while (sc.hasNext()) {
                System.out.print(lineNum+": ");
                System.out.println(sc.nextLine());
                lineNum++;
            }
            f1.close();

        }catch(IOException e){
            System.err.println("파일 입출력 오류");
        }
    }
}