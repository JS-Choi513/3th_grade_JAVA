package assignment5;
import java.util.Scanner;
public class Grade {
    private int math;
    private int science;
    private int english;
    static int average;

    public void average(int math, int science, int english) {
        this.math = math;
        this.science = science;
        this.english = english;
        System.out.println("average score is : "+(this.math + this.science + this.english)/3);
    }
    public Grade(){}
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Grade student = new Grade();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    student.average(a, b, c);
    }
}