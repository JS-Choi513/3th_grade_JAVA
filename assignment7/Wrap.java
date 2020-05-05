package assignment7;

public class Wrap {
    public static void main(String[]args){
        //1
        
      //Integer a = new Integer(20);
        Integer a = 20;
        String str = a.toString();
        System.out.println(str);

        //2
        String f = "35.9";
        Double d = Double.valueOf("35.9");
        System.out.println(d);

        //3
        String e = "true";
        Boolean b = Boolean.valueOf("true");
        System.out.println(e);

        //4
        String s2 =  String.valueOf(30);
        System.out.println(s2);

        //5
        String c = String.valueOf('c');
        System.out.println(c);


    
    }

}