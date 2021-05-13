package ministop;
import java.util.*;

public class ProductList {
	static Scanner scanner = new Scanner(System.in);
	static ArrayList<Product> productList = new ArrayList<Product>();
	
	public static void warehousing() {
		Product product = new Product();
		System.out.print("��ǰ�� id�� �Է��ϼ���: ");
		product.setId(scanner.next());
		System.out.print("��ǰ�� ������ �Է��ϼ���: ");
		product.setPrice(scanner.nextInt());
		System.out.print("��ǰ�� �̸��� �Է��ϼ���: ");
		product.setName(scanner.next());
		System.out.print("��ǰ�� ������ �Է��ϼ���: ");
		product.setAmount(scanner.nextInt());
		productList.add(product);
	}
	
	public static void output() {
		for(int i=0; i<productList.size(); i++) {
			Product product = productList.get(i);
			System.out.print(product.getId());
			System.out.print(product.getPrice());
			System.out.print(product.getName());
			System.out.println(product.getAmount());
			
		}
	}
}

