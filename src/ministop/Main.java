package ministop;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int menu = 0;
		while(true) {
			System.out.println("--------------------");
			System.out.println("1. ��ǰ �԰�");
			System.out.println("2. ��ǰ ���");
			System.out.println("3. ��ǰ ����");
			System.out.println("4. ��ǰ �Ǹ�");
			System.out.println("5. �Ǹ� �α�");
			System.out.println("6. ���α׷� ����");
			System.out.println("--------------------");
			menu = scanner.nextInt();
			
			switch (menu) {
			
				case 1: // ��ǰ �԰�
					ProductList.warehousing();
					break;
					
				case 2: // ��ǰ ���
					ProductList.output();
					break;
					
				case 3: // ��ǰ ����
					ProductList.delete();
					break;
					
				case 4: // ��ǰ �Ǹ�
					ProductList.sell();
					break;
					
				case 5: // �Ǹ� �α�
					LogList.output();
					break;
					
				case 6: // ���α׷� ����
					System.exit(0);
					break;
					
				default:
					System.out.println("��ȿ���� ���� ���Դϴ�.");
					break;
			}
		}
	}

}
