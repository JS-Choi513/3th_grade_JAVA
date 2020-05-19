package assignment9;
import java.util.*;
public class ArrayListEx2 {
    public static void main(String[] args){
        ArrayList<String> a = new ArrayList<String>(10);
        a.add("java");
        a.add(0,"C++");
        System.out.println(a.size());
        a.remove("java");
    }
}