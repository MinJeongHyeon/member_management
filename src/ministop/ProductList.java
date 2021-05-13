package ministop;
import java.util.*;

public class ProductList {
	// Scanner, ArrayList ��ü ����
	static Scanner scanner = new Scanner(System.in);
	static ArrayList<Product> productList = new ArrayList<Product>();

	// ��ǰ �԰�
	public static void warehousing() {
		Product product = new Product();
		
		System.out.print("��ǰ�� ID�� �Է��ϼ���: ");
		product.setId(scanner.next());
		
		System.out.print("��ǰ�� �̸��� �Է��ϼ���: ");
		product.setName(scanner.next());
		
		System.out.print("��ǰ�� ������ �Է��ϼ���: ");
		product.setPrice(scanner.nextInt());
		
		System.out.print("��ǰ�� ������ �Է��ϼ���: ");
		product.setAmount(scanner.nextInt());
		
		productList.add(product);
	}
	
	// ��ǰ ���
	public static void output() {
		for(int i=0; i<productList.size(); i++) {
			Product product = productList.get(i);
			
			System.out.print("ID: " + product.getId() + "\t");
			System.out.print("�̸�: " + product.getName() + "\t");
			System.out.print("����: " + product.getPrice() + "\t");
			System.out.println("����: " + product.getAmount() + "\t");
		}
	}
	
	// ��ǰ ����
	public static void delete() {
		System.out.print("������ ��ǰ�� ID�� �Է��ϼ���: ");
		String id = scanner.next();
		
		for (Product pr : productList) {
			if(pr.getId().equals(id)){
				productList.remove(pr);
				break;
			}
		}
	}
	
	// ��ǰ �Ǹ�
	public static void sell() {
		LogList logList = new LogList();
		
		System.out.print("�Ǹ��� ��ǰ�� ID�� �Է��ϼ���: ");
		String id = scanner.next();
	
		System.out.print("�Ǹ��� ��ǰ�� ������ �Է��ϼ���: ");
		int amount = scanner.nextInt();
		
		for (Product pr : productList) {
			if(pr.getId().equals(id)){
				
				if (amount > pr.getAmount()) {
					System.out.println("���� ������ �������� ���� ���� �Է��Ͽ����ϴ�");
					break;
				}
				
				pr.setAmount(pr.getAmount() - amount);
				logList.setLog(pr, amount);
			}
		}
		
	}
	
	
}

