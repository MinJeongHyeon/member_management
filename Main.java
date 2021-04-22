import java.util.*;

public class Main {
	public static HashMap<String, Object> map = new HashMap<String, Object>();
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println(" =============================");
		System.out.println(" 회원 관리 프로그램");
		System.out.println(" =============================");
		System.out.println(" 1. 회원 정보 입력");
		System.out.println(" 2. 회원 정보 삭제");
		System.out.println(" 3. 회원 정보 조회");
		System.out.println(" 0. 프로그램 종료");
		System.out.println(" =============================");

		while (true) {
			System.out.print(">> ");
			int menu = s.nextInt();

			switch (menu) {

			case 0:
				exit();
				break;

			case 1:
				insert();
				break;

			case 2:
				delete();
				break;

			case 3:
				inquiry();
				break;
				
      default:
        System.out.println("값이 잘못되었습니다.");

			}
		}

	}


	private static void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}

	private static void delete() {
	

		Scanner s = new Scanner(System.in);
		String id = s.nextLine();
		
		System.out.println(id + "을 삭제합니다.");
		map.remove(id);

	}

	private static void inquiry() {
	
		Set<Map.Entry<String, Object>> set = map.entrySet();

		for(Map.Entry<String, Object> me : set) {
      Member memberValue = (Member)me.getValue();
			System.out.println(me.getKey() + " : " + memberValue.getPassword() + ", " + memberValue.getName()); 
		}

	}

  private static void insert() {

	  Scanner s = new Scanner(System.in);
    Member member = new Member();

		System.out.print("아이디: ");
		String id = s.nextLine();
    System.out.print("비밀번호: ");
		member.setPassword(s.nextLine());
		System.out.print("이름: ");
		member.setName(s.nextLine());
		
		System.out.println("성공적으로 입력되었습니다.");
		map.put(id, member);

	}

}