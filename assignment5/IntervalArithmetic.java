package assignment5;
import java.util.Scanner;
 public class IntervalArithmetic {
    static class Interval {
        private double x;
        private double y;
        public Interval() {
            this(0.0, 0.0);
        }
        public Interval(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public Interval(double a, double b) {
            this.x = a;
            this.y = b;
        }
        public Interval add(Interval val) {
            this.x = val.x + this.x ;
            this.y = val.y + this.y;
            return this;
        }
        public Interval sub(Interval val) {
            val.x = this.x - val.x;
            val.y = this.y - val.y;
            return this;
        }
        public Interval times(Interval val) {
            double compareArray[] = new double[4];
                compareArray[0] = this.x*val.x;
                compareArray[1] = this.y*val.y;
                compareArray[2] = this.x*val.y;
                compareArray[3] = this.y*val.x;
                double maxNum = compareArray[0];
                double minNum = compareArray[0];
                for(int i=0;i<3;i++){
                    if(compareArray[i]>maxNum) maxNum = compareArray[i];
                    if(compareArray[i]<minNum) minNum = compareArray[i];
                }
                this.x = minNum;
                this.y = maxNum;
                return this;
        }
        public Interval divide(Interval val) {
            double compareArray[] = new double[4];
                compareArray[0] = this.x/val.x;
                compareArray[1] = this.y/val.y;
                compareArray[2] = this.x/val.y;
                compareArray[3] = this.y/val.x;
                double maxNum = compareArray[0];
                double minNum = compareArray[0];
                for(int i=0;i<3;i++){
                    if(compareArray[i]>maxNum) maxNum = compareArray[i];
                    if(compareArray[i]<minNum) minNum = compareArray[i];
                }
                this.x = minNum;
                this.y = maxNum;
                return this;
        }
        public Interval square(){
            this.x = this.x*this.x;
            this.y = this.y*this.y;
            return this;
        }
        public double getMin(){
        return this.x;
        }
        public double getMax(){
        return this.y;
        }
        public void print(){
            System.out.println("["+this.x+","+this.y+"]");
        }
        public String toString(){
            String interval = "["+Double.toString(this.x)+","+Double.toString(this.y)+"]";
            return interval;
        }
    }
        public static void main(String[]args){ 
            Scanner sc = new Scanner(System.in);
            Interval x = new Interval();
            Interval z,y;
            y = x.add(new Interval(1,2));
            z = y.times(new Interval(2.1,3.2));
            System.out.println("result = "+ z);
            z.print();
        //    double h1,h2,w1,w2;
        //    w1 = sc.nextDouble();
        //    w2 = sc.nextDouble();
        //    h1 = sc.nextDouble();
        //    h2 = sc.nextDouble();
        //    Interval presume_weight = new Interval(w1,w2);
        //    Interval presume_height = new Interval(h1,h2);
        //    Interval h_square,bmi;
        //    h_square = presume_height.square();
        //    bmi = presume_weight.divide(h_square);
        //    bmi.print();
        }
}
