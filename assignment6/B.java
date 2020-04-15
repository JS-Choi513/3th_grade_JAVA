package assignment6;

abstract class OddDectector  {
    protected int n;
    public OddDectector(int n){
        this.n = n;
    }
    public abstract boolean isOdd();//홀수이면 true 리턴
}
public class B extends OddDectector{
    public B(int n) {
        super(n);//매개변수가 n인 생성자를 가져옴 
    }
    public boolean isOdd() {//메소드 오버라이딩 
        if(this.n%2==0) return false;
        else return true;
    }
    public static void main(String[] args){
        B b = new B(10);
        System.out.println(b.isOdd());
    }
}
