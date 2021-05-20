package vendingMachine;
import java.util.*;

import ministop.Product;

public class Machine {
	
	// 객체, 변수 초기화
	static Scanner scanner = new Scanner(System.in);
	static ArrayList<Drink> machine = new ArrayList<Drink>();
	static int money = 0;
	
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
		if(money==0) {
			System.out.print("반환 할 돈이 없습니다.");
		}
		else {
			money=0;
		}
		System.out.print("잔돈: " + money + "원");
		System.out.print("반환 완료 되었습니다.");
	}
	
	// 재고 추가 메소드
	public static void warehousing() {
		
		// drink 객체 생성
		Drink drink = new Drink();
		
		// 음료수 번호 설정
			System.out.println("음료수 번호는 " + machine.size() + "번으로 설정됩니다.");
		
		// 음료수 정보 입력
		System.out.println("음료수 이름을 입력해주세요: ");
		drink.setName(scanner.next());
		
		System.out.println("음료수 가격을 입력해주세요: ");
		drink.setPrice(scanner.nextInt());
		
		System.out.println("음료수 수량을 입력해주세요: ");
		drink.setAmount(scanner.nextInt());
		
		// ArrayList에 추가
		machine.add(drink);
	}
	
	// 음료수 구매 메소드
	public static void saleDrink() {
		
		int number = 0;
		// 음료수 목록 출력
		for(int i=0; i<machine.size(); i++) {
			Drink drink = machine.get(i);
			
			System.out.print("번호: " + i + "\t");
			System.out.print("이름: " + drink.getPrice() + "\t");
			System.out.println("가격: " + drink.getAmount());		
		}
		
		// 구매할 음료수 번호 입력
		System.out.print("구매할 음료수의 번호를 입력해주세요: ");
		number = scanner.nextInt();
		
		Drink drink = machine.get(number);
		if(money - drink.getPrice() < 0) {
			System.out.println("잔액이 부족하여서 구매를 취소합니다.");
		}
		else if(drink.getAmount() <= 0) {
			System.out.println("수량이 부족하여서 구매를 취소합니다.");
		}
		else {
			money -= drink.getPrice();
			drink.setAmount(drink.getAmount()-1);
			System.out.println(drink.getName() + " 음료를 구매합니다.");
			System.out.println(drink.getPrice() + "원으로 구매하여 " + money + "원 남았습니다.");
		}
	}
	
	// 재고 수정 메소드
	public static void editDrink() {
		
	}
	
	// 재고 목록 메소드
	public static void printDrink() {
		
	}
	
	// 재고 삭제 메소드
	public static void deleteDrink() {
		
	}


}
