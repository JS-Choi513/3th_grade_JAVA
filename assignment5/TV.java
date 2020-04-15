package assignment5;

public class TV {
    private int size;
    private String manufacturer;
    public TV() {
        this(32,"LG");
        System.out.println("32"+ "인치" + "LG");
    }
    public TV(String manufacturer){
        this(32,manufacturer);
    }
    public TV(int size, String manufacturer){
        this.size = size;
        this.manufacturer = manufacturer;
        System.out.println(size + "인치" + manufacturer);
    }
}