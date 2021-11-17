package hello2;

public class Hello2Class {

	// 과제1

	// 자기 소개

	public static void main(String[] args) {
		// 안녕하세요
		// 나는 누구 입니다
		// 잘 부탁드립니다

		String b = "이승현"; // 문자열 변수 선언
		int a = 27;

		System.out.println("안녕하세요");
		System.out.println("나는 " + b + " 입니다");
		System.out.println("만나서 반갑습니다");
		System.out.println("저는 " + a + "살 입니다");
		System.out.println(b + " 인사 드립니다");
		System.out.println("만나서 반갑습니다");

		System.out.println();

		// 과제2

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

		System.out.println();

		// 과제3

		// 나무베기 기능 (배열, 무한, 제어)

	

		
		// 오징어 게임 
		int player = 7;

		//참가자 게임 통과 횟수
		int[] odds = { 2, 3, 1, 5, 1, 1, 8 };

		// 참가자 번호
		int playerNo = 0;
		
		// 여기 부터 반복
		while (true) {
//			treeNo++; // 나무 번호를 증가
			for (int i = 1; i <= odds[playerNo]; i++) {
				System.out.println((playerNo + 1) + "번 참가자 " + i + "번째 게임 참가");
				// 만약에 참가자의 생명만큼 찍혔으면
				if (i == odds[playerNo]) {
					// 게임 탈락
					System.out.println("참가자 게임 탈락");
					player = player - 1; // 참가자 줄임
					
				} else {
				
					System.out.println("참가자 게임 통과");
				}
			}
			playerNo++; // 다음 나무 나오세요~
			System.out.print("남아있는 참가자는? ");
			System.out.println(player);
			System.out.println(); // 한칸 내리기
			// 나무 총 갯수와 나무 끝 번호가 같으면 종료
			// 반복 멈추기
			if (player == 0) {
				break;
			}
		}
		// 여기까지 반복
		System.out.println("참가자 전원 탈락");
	}

}
