package assignment9;
import java.util.*;
class JGeneric<W>{
    private W x,y;
    public JGeneric(W x, W y){
        this.x = x;
        this.y = y;
        }
    public W first(){
        return this.x;
    }
    public W second(){
        return this.y;
    }
    public boolean equal(){
        if(this.x.equals(this.y)) return true;
        else return false;
    }
    
}
public class JGenericEx {
    public static void main(String[] args){
        JGeneric<String> s = new JGeneric<String>("A", "A");
        System.out.println(s.first());
        System.out.println(s.second());
        if(s.equal() == true) System.out.println("같습니다.");
        else System.out.println("다릅니다.");
    }
}