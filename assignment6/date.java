package assignment6;

import java.text.SimpleDateFormat;

public class date {
    public static void main(String[]args){
        SimpleDateFormat year = new SimpleDateFormat("yyyy");
        String nowYear = year.format(System.currentTimeMillis());
        System.out.print(nowYear);

    }
}