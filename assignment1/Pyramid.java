package assignment1;
public class Pyramid{

    public static int foobar(int n){

        int k=0;
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                k++;
            }
        }
        return k;
        
    }

    // public static int FibSequence(int n){
    //     if(n <= 2) return 1;
    //     else return FibSequence(n-2) + FibSequence(n-1);
    // }
  //일반항  aₙ＝aₙ₋₁+aₙ₋₂(n≧3)
    public static void main(String[] args){
//         for(int i=1;i<=6;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(FibSequence(j)); 
//             }
//             System.out.println(); 
//         } ); 
        //         System.out.println("    1 2 1     "); 
        //         System.out.println("   1 3 3 1    "); 
        //         System.out.println("  1 4 6 4 1   "); 
        //         System.out.println("1 5 10 10 5 1"); 
        // 
        
        System.out.print(foobar(1));
    }


    
}
