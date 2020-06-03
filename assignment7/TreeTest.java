package assignment7;

//import java.util.ArrayList;

//import java.lang.StringBuffer;
interface BinaryTree{
    void setRoot(char t);
    void setLeftChild(BinaryTree t);
    void setRightChild(BinaryTree t);

    char getRoot();
    BinaryTree getLeftchild();
    BinaryTree getRightChild();

    boolean isFull();
    int numNodes();
    String preorderTravelsal();
}


//메소드는 객체 안에서 실행 할 수 있다. 
class MyTree implements BinaryTree /*<BinaryTree>*/{
    //ArrayList<BinaryTree> tree = new ArrayList<BinaryTree>();
    char value;
    MyTree left = null;
    MyTree right = null;
    MyTree(){}
    MyTree(char r){
    /*    if(this.parent == null && this.root == ' '){
            setRoot(r);
           parent = this;
        }
        else{
            this.value = r;
        }
        setLeftChild(null);
        setRightChild(null);
        */
        this(r,null,null);
        //this.value =r;
        //setLeftChild(null);
        //setRightChild(null);
    }
    MyTree(char r, MyTree left, MyTree right){
        setRoot(r);//this.value = r;
        setLeftChild(left);
        setRightChild(right);
    }
    MyTree(String s){
        char strTochar[] = new char[3];
        int i = 0;
        for(i=0;i<3;i++){
            strTochar[i] = s.charAt(i);
        }
        right = new MyTree();
        left = new MyTree();
        right.setRoot(strTochar[2]);
        left.setRoot(strTochar[0]);//right.value = strTochar[2]; 멤버에 직접 엑세스 하기보단 메소드로 접근 
        //left.value = strTochar[0];
        setRoot(strTochar[1]);
        setRightChild(right);
        setLeftChild(left);
        //this.right.value = strTochar[2];//널 포인트 에러 
        //System.out.println(strTochar[0]);
        //System.out.println(strTochar[1]);
        //System.out.println(strTochar[2]);
        //this.right.value = ;

          //this.left.value = ;
            //this.setLeftChild(left);
            //this.setRightChild(right);
    }
    
    public void setRoot(char t) {
        this.value = t;        
    }
    //@Override
    public void setLeftChild(BinaryTree nodeL) {//인터페이스에서 오버라이드 
         left = (MyTree) nodeL;//캐스팅 nodeL의 속성이 바뀌는것이 아님, 레퍼런스 타입만 바뀌는 것이다. 

    }
    //@Override
    public void setRightChild(BinaryTree nodeR){
        right = (MyTree) nodeR;
    }
    
    public char getRoot(){
        return this.value;//while(this.left && this.right )
    }
    // public void numNodes(MyTree root){
    //     if(this != null){

    //     }
    // }
    public int numNodes(){
        int count = 0;//메소드를 재귀호출할때 초기화하는건 고려하지 않아도 됨 재귀적으로 호출되는 메소드는 이전 메소드와 관계가 없다. 
        //if(this != null ){
           count = count+1;
        //}
        if(this.left !=null) {
            count = count + left.numNodes();//이런식으로 메소드의 리턴값으로 중첩 
            
        }
        if(this.right !=null){
            count = count + right.numNodes();
           
        } 
            
        return count;
    }
    public String preorderTravelsal(){
        String nodevalue;
        nodevalue = Character.toString(this.value);
        if(left != null){
             nodevalue = nodevalue + left.preorderTravelsal();
        }
        if(right != null){
            nodevalue = nodevalue + right.preorderTravelsal();//Character.toString(right.value);
          //  this.right = right.right;
          // right.preorderTravelsal();
        }
        //preorderTravelsal();
        return nodevalue;
    }
    public boolean isFull(){//포화이진트리인지 어떻게 판별할 것인가 
        //포화이진트리의 노드수는 2의 제곱수에 비례한다.
        if(getLeftchild() != null && getRightChild() !=null ){
            left.isFull();
            right.isFull();
        }
        if(getLeftchild() == null && getRightChild() == null) return true;
        
        return false;
        /*function isPowerOfTwo(n){
            if(n==2){return true;} 
            else if(n%2==1){return false;}
            else {return isPowerOfTwo(n/2);}
        }*/
        //int compareTobin = numNodes();
        
        //(compareTobin != 0) && ((compareTobin & (compareTobin - 1)) == 0);//이건 포화 이진트리 성립의 필요충분 조건이 될 수 없다. 
        // 포화이진트리의 노드 개수는 위 조건식에 성립하지만 위 조건식이 성립한다고 해서 그 트리가 포화 이진트리가 될 수 없다는 것이다. 
        //2의 거듭제곱에 속하는 수들은 이진수로 표현햤을 때 각 자릿수만 1이고 나머지는 0인 수들이다. 
        /*
        8 = 1000 에서 7 = 0111 이다 
        4 = 0100
        2 = 0010
        어떤수가 2의 거듭제곱에 속하는 수인지 판별하려면 그 수의 -1인 값과 비트를 비교하여 0이면 
        2의 거듭제곱에 속하는 것이다. 이 알고리즘은 O(1)의 복잡도를 가진다. 
        */
    }

    public MyTree getLeftchild(){
        if(left == null){
            return null;
        }
    return left;
    }

    public MyTree getRightChild(){
        if(right == null){
            return null;
        }
    return right;
    }
}

public class TreeTest{
    public static void main(String[] args){
        MyTree exp = new MyTree('+');
        System.out.println("Num Nodes: " + exp.numNodes() + ", Full Binary Tree : " + exp.isFull());
        exp.setLeftChild(new MyTree("2*3"));
        //System.out.println("Pre-Order: " + exp.preorderTravelsal());
        System.out.println("Num Nodes: " + exp.numNodes() + ", Full Binary Tree : " + exp.isFull());
        MyTree t = new MyTree('*', new MyTree('3'),null);
        exp.setRightChild(t);
        exp.getRightChild().setRightChild(new MyTree('5'));
        System.out.println("Num Nodes: " + exp.numNodes() + ", Full Binary Tree : " + exp.isFull());
        System.out.println("Pre-Order: " + exp.preorderTravelsal());

        /*
        실행결과 
    Num Nodes: 1, Full Binary Tree: true
    Num Nodes: 4, Full Binary Tree: false
    Num Nodes: 7, Full Binary Tree: true
    Pre-Order: +*23*35
            new MyTree('+')
         exp = new MyTree("2*3") 이렇게 하면 값이 덮어 써지는 이유가 뭔가 
         인터페이스에서 정의된 어떤 메소드의 매개변수가 인터페이스 객체를 가리 킬대 
         구현할 때 왜 매개변수를 인터페이스 객체를 매개변수로 가져야 하는가*/

    }
    /*문제 : 인터페이스 set 메소드의 매개변수가 BT형이라서 구현할 때 마이트리 클래스로 하면 오류남 
    질문 : 메소드 내에서 객체를 생성하면 레퍼런스가 어떻게 변하는가
    */
}

