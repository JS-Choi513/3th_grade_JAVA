package assignment10;
import java.io.*;
import java.util.*;

class Entry implements Comparable<Entry> {
    String word;
    Integer count;

    Entry(String w, Integer c){
        word = w;
        count = c;
    }

    public int compareTo(Entry o){
        return o.count.compareTo(count);//앞이 뒤보다 크면양수 작으면 음수 같으면 0
    }
    public void inc(){
        count = count +1;
    }
}




/*요구사항
이상한 나라의 엘리스 텍스트파일에서 
단어의 빈도수가 많은 순 대로 .csv 파일을 생성하여 나열 할 것 
단어는 영대소문자를 구분하고 하이푼'-' 과 알파벳을 제외한 공백,.?"()+!;;*은 단어에 포함하지 않는다" 

① 단어저장: HashMap<K,V>
② 파일입력: BufferedReader
③ 파일출력: FileWriter
④ 단어항목: Entry

연속된 알파벳+-을 단어라고 정의 
알파벳을 읽다가 공백을 포함한,.?"()+!;;* 문자가 나오면 바로 전까지 끊고 단어로 저장한다.
설계 
텍스트를 위에서 부터 아래로 읽으면서 2번이상 나타나는 특정 패턴을 찾는다...?
찾은 패턴들을 */