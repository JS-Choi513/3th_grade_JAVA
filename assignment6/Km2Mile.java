package assignment6;
import java.util.Scanner;
abstract class Converter{
    abstract protected double convert(double arc);
    abstract protected String getSrcString();
    abstract protected String getDestString();
    protected final double ratio = 1.609344;//비율

    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println(getSrcString() + "을"+ getDestString()+"로 바꿉니다.");
        System.out.print(getSrcString() + "을 입력하세요>> ");    
        double val = sc.nextDouble();
        double res = convert(val);
        System.out.println("변환 결과: "+ res + getDestString()+ "입니다.");
        sc.close();
    }
}
public class Km2Mile extends Converter {
    @Override
    protected String getSrcString(){
        String Kilometer = "km";
        return Kilometer;
    }
    @Override
    protected String getDestString(){
        String mlie = " Mile";
        return mlie;
    }
    @Override
    protected double convert(double kilometer){//private 만 아니면 접근 지정자 갖다쓸수 있음 
        double mile = kilometer * ratio;//ratio 상속
        return mile;
    }
    public static void main(String[] args){
        Km2Mile convert = new Km2Mile();
        convert.run();
    }
}

