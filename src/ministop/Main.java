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
