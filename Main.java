package move_in_Management;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int menu = 0;
		
	while(true) {
		//메뉴 while문 사용
		System.out.println("아파트 입주 관리 프로그램");
		System.out.println("-------------------");
		System.out.println("1. 입주 정보 입력");
		System.out.println("2. 입주 정보 출력");
		System.out.println("-------------------");

		System.out.println("▼▼▼더 크로스 비공식 앱 다운로드 바로가기▼▼▼");
		System.out.println("https://play.google.com/store/apps/details?id=com.hopeproject.thecross2001_app&hl=ko");

		
		// 메뉴 선택 후 switch문으로 해당 메소드 실행
		menu = scanner.nextInt();
		switch (menu) {
		
			case 1: //입력
				List.input();
				break;
			case 2: //출력
				List.output();
				break;
			default:
				System.out.println("해당 메뉴가 존재하지 않습니다.");
		}
	}
		

	}

}
