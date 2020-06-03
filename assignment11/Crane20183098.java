package assignment11;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Scanner;

public class Crane20183098 {
    public int solution(ArrayList<Stack<Integer>> board, int[] moves){
        Stack<Integer> basket = new Stack<Integer>(); // 바구니 생성 
        int result = 0;//사라진 인형개수 저장 
        int movecount = moves.length;
        for(int i=0;i<movecount;i++){
                Integer cursor = moves[i]-1;//객체형태로 변경 리스트 마지막 값 접근방지 
                //System.out.println(cursor + " ");
                if(board.get(cursor).empty() != true && board.get(cursor).peek() != 0 ){//해당 스택이 비어있지 않거나 0이 아니면
                    Integer doll = board.get(cursor).pop();//moves[i]에 해당하는 위치의 인형 할당 
                        if(!basket.empty()){//바구니가 비어있지 않을 때 
                            if(doll.equals(basket.peek())){
                                basket.pop();//찾은 인형이 바구니의 인형과 일치하면 바구니pop
                               // System.out.println("펑!");
                                result = result+2; // 터뜨린 횟수 증가 
                            } 
                            else{
                                basket.push(doll);//아니면 인형 push
                                //if(basket.peek().equals(doll))System.out.println("바구니에" +doll+ "을 넣었습니다!");
                            } 
                        }
                        else{
                            basket.push(doll);//아니면 인형 push
                            //if(basket.peek().equals(doll))System.out.println("바구니에" +doll+ "을 넣었습니다!");
                        } 
                                            
                } 
                else{
                  //  System.out.println(i + "번 위치에 가져올 인형이 없습니다. ");
                    if(!board.get(cursor).empty()) 
                    board.get(cursor).pop();//0일때 값 삭제 
                    
                } 
        }

        return result;
    }   
}
/*
5
0 0 0 0 0
0 0 1 0 3
0 2 5 0 1
4 2 4 4 2
3 5 1 3 1
8
1 5 3 5 1 2 1 4
*/
/*public*/ class CraneGameTest{
    public static void main(String[] args){
        ArrayList<Stack<Integer>> board = new ArrayList<Stack<Integer>>();
        ArrayList<Stack<Integer>> input = new ArrayList<Stack<Integer>>();
        int[] moves;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 생성할  nxn 배열 
        for(int i=0; i<n; i++){
            input.add(new Stack<Integer>());
            board.add(new Stack<Integer>());
        }
        for(int r=0;r<n;r++)
            for(int c=0;c<n;c++){
                int in = sc.nextInt();
                if(in !=0)
                    input.get(c).push(in);
            }
            for(int c=0;c<n;c++)
                while(! input.get(c).empty())
                board.get(c).push(input.get(c).pop());

                int m = sc.nextInt();
                moves = new int[m];
                for(int i=0;i<m;i++)
                    moves[i] = sc.nextInt();

                int result = new Crane20183098().solution(board, moves);
                System.out.println(result);
    }
}