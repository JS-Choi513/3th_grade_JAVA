package assignment7;
import java.util.StringTokenizer;
public class Example {
	public static void main(String[] args) {
		java.util.StringTokenizer st = new java.util.StringTokenizer("a=3,b=5,c=6",",=");
		int sum = 0;
		while (st.hasMoreTokens()) {
			String next = st.nextToken();
			try {
				sum += Integer.parseInt(next);
				System.out.println(next);
			}
			catch(NumberFormatException e) {//다른 포맷이 들어오면 예외 출력 
				System.out.println(next);
			}
		}
		System.out.println("합은 "+sum);
	}
}


// public class Example {
//     public static void main(String[] args){
//         String str = "a=3,b=5,c=6";
//         String str2 = "";
//         String str3 = "";
//         int sum = 0;
//         StringTokenizer st = new StringTokenizer(str,",=");
//         //기준문자를 두개로 지정할 수도 있다. 
//         while(st.hasMoreTokens()){//토큰을 꺼내올 때는 토큰이 있는지 미리 확인하는것이 좋다 
//             str2 = st.nextToken();//토큰값은 스트링에 삽입 
//             System.out.println(str2);
//         }
//         StringTokenizer st2 = new StringTokenizer(str2,"abc");
//         while(st2.hasMoreTokens()){
//           //  str3 = st2.nextToken("abc");
//             sum = sum + Integer.parseInt(st2.nextToken());
//         }
//         //토큰이라서 안됨
        
//         System.out.println("합은"+sum);
//     }

// 	//
// }
// //StringTokenizer st = new StringTokenizer(query,"&");
// //int i = Integer.parseInt("123");