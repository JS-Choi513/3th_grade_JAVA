package assignment5;

public class Rectangle {
    private int x,y,width,height;
    private boolean compare = true;

    public Rectangle(int x,int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public int squre(){
        int squre = this.height*this.width;
        return squre;
    }
    public boolean contain(Rectangle r){
        boolean compare = false;
        if((r.x+r.width)<(this.x+this.width)&&(r.y+r.height)<(this.y+this.height)) compare = this.compare;
        return compare;
    }
    public void show(){
        System.out.println("("+this.x+","+this.y+")에서 크기가"+width+"x"+height+"인 사각형");
    }
    public static void main(String[] args){
        Rectangle r = new Rectangle(2,2,8,7);
        Rectangle s = new Rectangle(5,5,6,6);
        Rectangle t = new Rectangle(1,1,10,10);
        r.show();
        System.out.println("s의 면적은 "+s.squre());
        if(t.contain(r)) System.out.println("t는 r을 포함합니다.");
        if(t.contain(s)) System.out.println("t는 s를 포함합니다.");
    }


}