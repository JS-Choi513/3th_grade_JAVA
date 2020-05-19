package assignment9;
import java.util.*;



interface BinaryTree<T>{
    void setRoot(T root);
    void setLeftchild(BinaryTree<T> t);
    void setRightchild(BinaryTree<T> t);

    T getRoot();
    BinaryTree<T> getLeftchild();
    BinaryTree<T> getRightchild();

    boolean isFull();
    int numNodes();
    String preorderTraverse();

}


class BinarySearchTree<T extends Comparable<T>> // 객체끼리 comparable 메소드를 사용하여 정렬할 수 있다. 
 implements BinaryTree<T> {
    private T value;
    private BinarySearchTree<T> rightChild = null;
    private BinarySearchTree<T> leftChild = null;
    BinarySearchTree(){};// 메소드에서 활용하기 위한 생성자 선언 
    BinarySearchTree(T val){ // 생성자 선언 
    setRoot(val); // 제네릭 타입 메소드로 객체를 생성하면 루트가 val 인 트리 생성  
    }

    public void setRoot(T root) {
        this.value = root;
    }
    public void setLeftchild(BinaryTree<T> t){ // 객체타입의 매개변수를 왼쪽자식노드로 연결
        leftChild = (BinarySearchTree<T>) t;
    }
    public void setRightchild(BinaryTree<T> t){// 객체타입의 매개변수를 오른쪽자식노드로 연결
        rightChild = (BinarySearchTree<T>) t;
    }

    public T getRoot(){ // 부모노드 반환
        return this.value;
    }
    public BinaryTree<T> getLeftchild(){ // 왼쪽자식노드 반환
        return (BinarySearchTree<T>)this.leftChild;
    }
    public BinaryTree<T> getRightchild(){ // 오른쪽 자식노드 반환 
        return (BinarySearchTree<T>)this.rightChild;
    }

    public boolean isFull(){ // 포화이진트리 판별
        boolean full = false;
        if(leftChild != null && rightChild !=null ){
        full =  leftChild.isFull();
        full = rightChild.isFull();
        if(leftChild == null && rightChild == null) full = true; // 말단노드에서 자식노드가 비어 있으면 true반환
        }
        return full;
    }
    public int numNodes(){ // 노드개수 반환
        int count = 0;//메소드를 재귀호출할때 초기화하는건 고려하지 않아도 됨 재귀적으로 호출되는 메소드는 이전 메소드와 관계가 없다.
        count = count+1;
        if(this.leftChild != null) {
            count = count + leftChild.numNodes();
        }
        if(this.rightChild != null){
            count = count + rightChild.numNodes();
        } 
        return count;
    }
    public String preorderTraverse(){//전위순회
        String nodevalue;
        nodevalue = this.toString(value); // 제네릭 타입 변수를 문자열로 변환하여 저장 
        if(this.leftChild != null){
             nodevalue = nodevalue + leftChild.preorderTraverse();//왼쪽노드를 재귀적으로 다 탐색하고 
        }
        if(this.rightChild != null){
            nodevalue = nodevalue + rightChild.preorderTraverse();//오늘쪽노드를 탐색 
        }
        return " " + nodevalue;
    }   
    public String toString(T value) {//toString 오버라이드
        return "" + value;//String 타입이 아닌 변수를 리턴하기위한 방법 
    }

    public void add(T val) {
        if(this.value.compareTo(val)>0){//루트(부모)노드가 val 보다 값이 클 때 
            if(leftChild != null) leftChild.add(val);//자식노드가 이미 있으면 재귀 
                else{
                    leftChild = new BinarySearchTree<T>();//없으면 자식노드를 만들 객체 생성
                    this.setLeftchild(leftChild);// 링크 연결
                    leftChild.value = val;     //값 삽입 위에 객체 선언할 때 값을 미리 넣어도 된다. 
                }
        }
        else if(this.value.compareTo(val)<0){
            if(rightChild !=null) rightChild.add(val);
                else{
                    rightChild = new BinarySearchTree<T>();
                    this.setRightchild(rightChild);
                    rightChild.value = val;
               }
        }
    }   
    public BinarySearchTree<T> find(T val) {
        BinarySearchTree<T> result =null;
        if(value.equals(val) == true) result =  this;
            // 값이 val 인 노드를 찾아서 리턴한다 없으면 null
        if(value.compareTo(val)>0){
            if(rightChild != null ) rightChild.find(val);
        }
        else if(value.compareTo(val)<0){
            if(leftChild != null)leftChild.find(val);
        }
        return result ;
    }   
}
/*
public class RandomTree{
    public static void main(String args[]){
        BinarySearchTree<Integer> iTree = new BinarySearchTree<>(0);
        for(int i = 1; i<1000000; i++){
            int n = (int)(Math.random()*1000000+1);
            iTree.add(n);
        }
        System.out.println("[iTree] Num Nodes: " + iTree.numNodes() + ",Full Binary Tree: " + iTree.isFull());
    }
}
*/
public class SkeweTree{
    public static void main(String args[]){
        BinarySearchTree<Integer> iTree = new BinarySearchTree<>(0);
        for(int i = 1; i<1000000; i++){
            iTree.add(i);
        }
        System.out.println("[iTree] Num Nodes: "+iTree.numNodes()+", Full Binary Tree: "+ iTree.isFull());
    }
}

/*
public class BSTTest{
    public static void main(String[] args){
        BinarySearchTree<Integer> iTree = new BinarySearchTree<>(5);
        iTree.add(3);
        iTree.add(2);
        iTree.add(1);
        iTree.add(6);
        iTree.add(7);
        iTree.add(6);
        System.out.println("preorder Traversal is : "+iTree.preorderTraverse());
       //iTree.print();
        if(iTree.find(4) == null) System.out.println("There is no 4 in iTree");
        else System.out.println("Found 4...");
        if(iTree.find(2) == null) System.out.println("There is no 2 in iTree");
        else System.out.println("Found 2...");
        BinarySearchTree<String> sTree = new BinarySearchTree<>("Java");
        sTree.add("java");
        sTree.add("JAVA");
        sTree.add("C");
        sTree.add("Python");
        sTree.add("Python");
        sTree.add("python");
        System.out.println("preorder Traversal is : "+sTree.preorderTraverse());
        if(sTree.find("java") == null) System.out.println("There is no \"java\"in sTree");
        else System.out.println("Found \"java\"...");
        if(sTree.find("C#") == null) System.out.println("There is no \"C#\"in sTree");
        else System.out.println("Found \"C#\"...");
        System.out.println("[iTree] Num Nodes: " + iTree.numNodes() + ", Full Binary Tree: " + iTree.isFull());
        System.out.println("[sTree] Num Nodes: " + sTree.numNodes() + ", Full Binary Tree: " + sTree.isFull());
    }
}
*/