package mid_Term_Test;

//20183098
public class Rect {
    protected int x = 5;

    public void f() {
        x++;
        System.out.println(x);
    }
}

class SpecialRect extends Rect {
    public void f() {
        System.out.println(super.x);
    }
    public static void main(String[] args){
        SpecialRect s = new SpecialRect();
        s.f();
    }
}