package ministop;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int menu = 0;
		while(true) {
			System.out.println("--------------------");
			System.out.println("1. 상품 입고");
			System.out.println("2. 상품 목록");
			System.out.println("3. 상품 삭제");
			System.out.println("4. 상품 판매");
			System.out.println("5. 판매 로그");
			System.out.println("6. 프로그램 종료");
			System.out.println("--------------------");
			menu = scanner.nextInt();
			switch (menu) {
				case 1:
					ProductList.warehousing();
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				default:
					break;
			}
		}
	}

}
