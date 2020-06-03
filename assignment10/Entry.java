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
    @Override
    public int compareTo(Entry o){
        //if(o.count<this.count) return -1;
        //else if(o.count>this.count) return 1;
        return o.count.compareTo(count);//앞이 뒤보다 크면양수 작으면 음수 같으면 0
    }

    public void inc(){
        count = count +1;
    }
}

class Run{
    public static void main(String[] args){
        BufferedReader bfr = null;
        BufferedWriter bfw = null;
        String linestring = null;
        StringTokenizer st = null;
        FileReader alice = null;
        FileWriter wordfrequency = null;
        List<Entry> stcheck = new ArrayList<Entry>();
        TreeMap<String,Integer> treemap;
        try{
            alice = new FileReader("D:\\OneDrive - changwon.ac.kr\\CLASS\\전산언어프로젝트\\JAVA\\3th_grade_JAVA\\assignment10\\Alice’s Adventures in Wonderland.txt");
            bfr = new BufferedReader(alice);
            wordfrequency = new FileWriter("D:\\OneDrive - changwon.ac.kr\\CLASS\\전산언어프로젝트\\JAVA\\3th_grade_JAVA\\assignment10\\Word_Frequency.csv");
            bfw = new BufferedWriter(wordfrequency);
            Map<String, Integer> map = new HashMap<>();
            while(bfr.read()!= -1){//줄 단위로 읽는 값이 null이면 탈출 
                linestring = bfr.readLine();
                st = new StringTokenizer(linestring,"\\s+.?()+!;:*\"");//입력문자열 삽입및 구분자로 토큰화 StringTokenizer(분리할 문자열,구분자 문자열, 구분자 포함여부)
                while(st.hasMoreTokens()){//남아있는 토큰이 없을때 까지 반복
                    String word = st.nextToken();
                    Integer key = map.get(word);
                    if(key == null) key = 1;
                    else ++key;
                    map.put(word, key);
                }

            }
            //treemap = new TreeMap<String,Integer>(map);
            Iterator<Map.Entry<String,Integer>> entries = map.entrySet().iterator();
            while(entries.hasNext()){
                Map.Entry<String,Integer> entry = (Map.Entry<String,Integer>)entries.next();
                String word = entry.getKey();
                Integer value = entry.getValue();
                stcheck.add(new Entry(word,value));
              //  wordfrequency.write(Key);
               // bfw.newLine();
            }
            Collections.sort(stcheck);
            int count = 0;
            while(stcheck.isEmpty()!=true){
                String word = stcheck.get(count).word;
                Integer value = stcheck.get(count).count;
                wordfrequency.write(word);
                wordfrequency.write(value);
                bfw.newLine();
                count++;
            }
        }
        catch(IOException e){
            System.out.println("입출력 오류");        
            System.out.println(e.getMessage());        
        }
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