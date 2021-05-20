package vendingMachine;
import java.util.*;

import ministop.Product;

public class Machine {
	
	// 객체, 변수 초기화
	static Scanner scanner = new Scanner(System.in);
	static ArrayList<Drink> machine = new ArrayList<Drink>();
	static int money = 0;
	static int count = 1;
	
	// 금액 투입 메소드
	public static void insertMoney() {
		
		// 변수 초기화
		int number = 0;
		int won = 0;
		int volume = 0;
		
		// 화폐 입력
		System.out.println("넣을 지폐나 동전을 입력해주세요");
		System.out.println("1. 100원");
		System.out.println("2. 500원");
		System.out.println("3. 1000원");
		System.out.println("4. 5000원");
		number = scanner.nextInt();
		
		if(number==1) {
			won = 100;
		}
		if(number==2) {
			won = 500;
		}
		if(number==3) {
			won = 1000;
		}
		if(number==4) {
			won = 5000;
		}
		
		// 수량 입력
		System.out.println("해당 화폐를 얼마나 넣으실건가요?");
		volume = scanner.nextInt();
		
		// 금액 투입
		money = money+won*volume;
		System.out.println(money + "원이 투입되었습니다.");
	}
	
	// 잔돈 반환 메소드
	public static void returnMoney() {
		
	}
	
	// 재고 추가 메소드
	public static void warehousing() {
		
		// drink 객체 생성
		Drink drink = new Drink();
		
		// 음료수 번호 설정
		drink.setNumber(count);
		System.out.print("음료수 번호는 " + count + "번으로 설정됩니다.");
		
		// 음료수 정보 입력
		System.out.print("음료수 이름을 입력해주세요: ");
		drink.setName(scanner.next());
		
		System.out.print("음료수 가격을 입력해주세요: ");
		drink.setPrice(scanner.nextInt());
		
		System.out.print("음료수 수량을 입력해주세요: ");
		drink.setAmount(scanner.nextInt());
		
		System.out.print("음료수 유통기한을 입력해주세요: ");
		drink.setShelfLife(scanner.next());
		
		// ArrayList에 추가
		machine.add(drink);
		count++;
	}
	
	// 음료수 구매 메소드
	public static void saleDrink() {
		
	}
	
	// 재고 수정 메소드
	public static void editDrink() {
		
	}
	
	// 재고 삭제 메소드
	public static void deleteDrink() {
		
	}


}
