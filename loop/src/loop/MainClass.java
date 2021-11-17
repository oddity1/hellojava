package loop;

public class MainClass {

public static void main(String[] args) {
		
	

	
// 제주도 3곳의 포토존과 여자친구의 사진 부탁
			
	    int place = 3;
			
		
		System.out.println("[제주도 여행 중 첫번째 포토존]");
		
		for (int i = 0; i < 5; i++) {
			System.out.println("나는 열심히 " + (i + 1) + "번째 사진을 찍었다");
			if (i == 4) {
				System.out.println("드디어 마음에 들었다... 다음 포토존으로!");
			} else {
				System.out.println("사진이 여자친구 마음에 들지않는다");
			}
		}
		System.out.print("남아있는 포토존은?");
		place = place - 1;
		System.out.println(place);
		
		
		System.out.println("[제주도 여행 중 두번째 포토존]");
		
		for (int i = 0; i < 3; i++) {
			System.out.println("나는 열심히 " + (i + 1) + "번째 사진을 찍었다");
			if (i == 2) {
				System.out.println("이번엔 3번만에 성공... 다음 포토존으로!");
			} else {
				System.out.println("사진이 여자친구 마음에 들지않는다");
			}
		}
		System.out.print("남아있는 포토존은?");
		place = place - 1;
		System.out.println(place);
		
		
		System.out.println("[제주도 여행 중 세번째 포토존]");
		
		for (int i = 0; i < 8; i++) {
			System.out.println("나는 열심히 " + (i + 1) + "번째 사진을 찍었다");
			if (i == 7) {
				System.out.println("끝 이제 밥먹으러가자!!!");
			} else {
				System.out.println("사진이 여자친구 마음에 들지않는다");
			}
		}
		
	}
}