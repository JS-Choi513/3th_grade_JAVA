package assignment6;

public interface Shape {
    default void redraw(){
    }//디폴트는 인터페이스 클래스에 작성할 수 있고 서브클래스에서 접근 가능하다. 
    double getArea();
    final double pi = 3.14;
}

class Circle implements Shape{
    private int radious;
    public Circle(int radious){
        this.radious = radious;
    }
    @Override
    public void redraw(){
        System.out.print("--- 다시 그립니다.  ");
        System.out.println("반지름이 "+this.radious+"인 원입니다.");
    }
    @Override
    public double getArea(){
        double area = this.radious*this.radious *pi;
        return area;// .메소드 내 함수로 해도 되는가?
    }
}
class Oval implements Shape{
    private int x;
    private int y;
    public Oval(int x,int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public void redraw(){
        System.out.print("--- 다시 그립니다.  ");
        System.out.println(this.x+"x"+this.y+ "사각형에 내접하는 타원");
    }
    @Override
    public double getArea(){
        double area = (double)this.x *(double)this.y*pi;
        return area;// .메소드 내 함수로 해도 되는가?
    }
}
class Rect implements Shape{
    private int x;
    private int y;
    public Rect(int x,int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public void redraw(){
        System.out.print("--- 다시 그립니다.  ");
        System.out.println(this.x+"x"+this.y+ "크기의 사각형");
    }
    @Override
    public double getArea(){
        double area = this.x *this.y;
        return area;// .메소드 내 함수로 해도 되는가?
    }
}
 class Result {
    public static void main(String[] args){
        Shape [] list = new Shape[3];
        list[0] = new Circle(10);
        list[1] = new Oval(20, 30);
        list[2] = new Rect(10, 40);

        for(int i=0; i<list.length; i++) list[i].redraw();
        for(int i=0; i<list.length; i++) System.out.println("면적은 " + list[i].getArea());
    }

}
