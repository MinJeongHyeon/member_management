package ministop;
import java.util.*;

public class ProductList {
	// Scanner, ArrayList 객체 생성
	static Scanner scanner = new Scanner(System.in);
	static ArrayList<Product> productList = new ArrayList<Product>();

	// 상품 입고
	public static void warehousing() {
		Product product = new Product();
		
		System.out.print("상품의 ID를 입력하세요: ");
		product.setId(scanner.next());
		
		System.out.print("상품의 이름을 입력하세요: ");
		product.setName(scanner.next());
		
		System.out.print("상품의 가격을 입력하세요: ");
		product.setPrice(scanner.nextInt());
		
		System.out.print("상품의 수량을 입력하세요: ");
		product.setAmount(scanner.nextInt());
		
		productList.add(product);
	}
	
	// 상품 목록
	public static void output() {
		for(int i=0; i<productList.size(); i++) {
			Product product = productList.get(i);
			
			System.out.print("ID: " + product.getId() + "\t");
			System.out.print("이름: " + product.getName() + "\t");
			System.out.print("가격: " + product.getPrice() + "\t");
			System.out.println("수량: " + product.getAmount() + "\t");
		}
	}
	
	// 상품 삭제
	public static void delete() {
		System.out.print("삭제할 상품의 ID를 입력하세요: ");
		String id = scanner.next();
		
		for (Product pr : productList) {
			if(pr.getId().equals(id)){
				productList.remove(pr);
				break;
			}
		}
	}
	
	// 상품 판매
	public static void sell() {
		LogList logList = new LogList();
		
		System.out.print("판매한 상품의 ID를 입력하세요: ");
		String id = scanner.next();
	
		System.out.print("판매한 상품의 수량을 입력하세요: ");
		int amount = scanner.nextInt();
		
		for (Product pr : productList) {
			if(pr.getId().equals(id)){
				
				if (amount > pr.getAmount()) {
					System.out.println("현재 보유한 수량보다 많은 값을 입력하였습니다");
					break;
				}
				
				pr.setAmount(pr.getAmount() - amount);
				logList.setLog(pr, amount);
			}
		}
		
	}
	
	
}

