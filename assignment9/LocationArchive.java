package assignment9;
import java.util.*;

public class LocationArchive {
    private Scanner sc = new Scanner(System.in);
	private HashMap<String, Location> container = new HashMap<String, Location>();//해시맵의 키를 도시이름, 값을 Location 클래스로 한다. 
	
	private void inSertion() {
		System.out.println("도시,경도,위도를 입력하세요.");
		for (int i=0; i<4; i++) {
			System.out.print(">> ");
			String locationinfo = sc.nextLine();
			StringTokenizer st = new StringTokenizer(locationinfo, ",");
			String city = st.nextToken().trim();//첫번째 구분자 앞의 토큰 저장
			Integer logitude = Integer.parseInt(st.nextToken().trim());//두번째 구분자 앞의 토큰 저장
			Integer latitude = Integer.parseInt(st.nextToken().trim());//세번째 구분자 앞의 토큰 저장
			Location set = new Location(city, logitude, latitude);//Location 클래스 객체 생성 
			container.put(city, set); //해시맵에 저장
		}			
	}
	
	private void printSet() {
		Set<String> key = container.keySet();//해시맵 container 의 모든 키를 가져옴 
		Iterator<String> keyset = key.iterator();//키 들을 반복자로 지정 
		System.out.println("---------------------------");
		while (keyset.hasNext()) {
			String city = keyset.next(); // 루프돌면서 도시이름 저장 
			Location set = container.get(city); // 도시 이름을 키로하여 해시맵에서 Locaiton 객체 얻어냄
			System.out.print(set.getCity() + "\t");//수평 탭 
			System.out.print(set.getLongitude() + "\t");
			System.out.println(set.getLatitude());
		}
		System.out.println("---------------------------");		
	}

	private void indexSearching() {
		while(true) {
			System.out.print("도시 이름 >> ");
			String city = sc.nextLine(); // 찾는도시
			if(city.equals("stop")) return; 
			Location set = container.get(city);//container 해시 맵에서 입력받은 키(도시) 를 Location 클래스 객체로 저장 없으면 null반환
			if(set == null) { 
				System.out.println(city + "는 없습니다.");
			}
			else{  // 검색된 값 출력 
				System.out.print(set.getCity()  + "\t");
				System.out.print(set.getLongitude() + "\t");
				System.out.println(set.getLatitude());
			}
		}
	}
	//vs 코드에서 한글 인코딩을 지원하는 방법을 못찾았습니다. 
	public static void main (String[] args) {
        LocationArchive man = new LocationArchive();
        man.inSertion();
		man.printSet();
		man.indexSearching();
    }
}