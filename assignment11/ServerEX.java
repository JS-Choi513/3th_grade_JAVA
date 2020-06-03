package assignment11;

import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class ServerEX {
    public static void main(String[] args)    {
        BufferedReader in = null;
        BufferedWriter out = null;
        BufferedWriter chatlog = null;
        ServerSocket listner = null;
        Socket socket = null;
        SimpleDateFormat format = new SimpleDateFormat("mmdd_hhmm");
        Scanner scanner = new Scanner(System.in);
        try{
            listner = new ServerSocket(9999);
            String date = format.format(System.currentTimeMillis());
            String  filename = "D:\\OneDrive - changwon.ac.kr\\CLASS\\전산언어프로젝트\\JAVA\\3th_grade_JAVA\\assignment11\\Chat"+date;
            chatlog = new BufferedWriter(new FileWriter(filename,true));
            System.out.println("연결을 기다리고 있습니다.....");
            socket = listner.accept();
            System.out.println("연결되었습니다.");
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));//소켓 입력 스트림
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));//소켓 입력 스트림
            while(true){
                String inputMessage = in.readLine();
                if(inputMessage.equalsIgnoreCase("bye")){
                    System.out.println("클라이언트에서 bye로 연결을 종료하였음");
                    break;
                }
                System.out.println("클라이언트: "+ inputMessage);
                chatlog.write(inputMessage + "\n");
                System.out.print("보내기>>");
                String outputMessage = scanner.nextLine();
                out.write(outputMessage + "\n");//키보드에서 읽은 문자열 전송
                out.flush();//out 스트림 버퍼에 있는 모든 문자열 전송
                chatlog.write(outputMessage + "\n");
                chatlog.flush();
            }
        }
        catch(IOException e){
                System.out.println(e.getMessage());
        }finally{
            try{
                scanner.close();
                socket.close();
                listner.close();
                chatlog.close();
            }
            catch(IOException e){
                System.out.println("클라이언트와 채팅 중 오류가 발생했습니다.");
            }
        }
    }
}