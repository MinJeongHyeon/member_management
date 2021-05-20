package vendingMachine;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		// 객체, 변수 초기화
		Scanner scanner = new Scanner(System.in);
		int menu = 0;
		int adminMenu = 0;
		
		// 메뉴 while문
		while(true) {
			System.out.println("--------------------");
			System.out.println("자판기 프로그램 (사용자)");
			System.out.println("1. 금액 투입");
			System.out.println("2. 잔돈 반환");
			System.out.println("3. 음료수 구매");
			System.out.println("4. 관리자 모드");
			System.out.println("5. 종료");
			System.out.println("--------------------");
			
			// 메뉴 입력 후 switch문으로 해당 메소드 실행
			menu = scanner.nextInt();
			switch (menu) { // 메뉴
			
				case 1: // 금액 투입
					Machine.insertMoney();
					break;
					
				case 2: // 잔돈 반환
					Machine.returnMoney();
					break;
					
				case 3: // 음료수 구매
					Machine.saleDrink();
					break;
					
				case 4: // 관리자 모드
					adminMenu = 0; // 메뉴 변수 초기화
					
					// 메뉴 while문
					while(adminMenu != 4) {
						System.out.println("--------------------");
						System.out.println("자판기 프로그램 (관리자)");
						System.out.println("1. 재고 추가");
						System.out.println("2. 재고 수정");
						System.out.println("3. 재고 삭제");
						System.out.println("4. 사용자 모드");
						System.out.println("5. 종료");
						System.out.println("--------------------");
						
						// 메뉴 입력 후 switch문으로 해당 메소드 실행
						adminMenu = scanner.nextInt();
						switch (adminMenu) {
						
						case 1: // 재고 추가
							Machine.warehousing();
							break;
							
						case 2: // 재고 수정
							Machine.editDrink();
							break;
							
						case 3: // 재고 삭제
							Machine.deleteDrink();
							break;
							
						case 4: // 사용자 모드
							break; // while문에서 조건으로 빠져나옴
						
						case 5: // 종료
							System.exit(0);
							break;
						}
					}
					break;

				case 5: // 종료
					System.exit(0);
					break;
					
				default: // 예외
					System.out.println("유효하지 않은 값입니다.");
					break;
			}
		}
	}

}
