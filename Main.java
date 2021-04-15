import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static HashMap<String, Member> map = new HashMap<String, Member>();
	
	private static final int EXIT = 0;
	private static final int INSERT = 1;
	private static final int DELETE = 2;
	private static final int INQUIRY = 3;
	private static final int SUM = 4;
	private static final int AVG = 5;
	
	
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

			case EXIT:
				exitGrade();
				break;

			case INSERT:
				insertGrade();
				break;

			case DELETE:
				deleteGrade();
				break;

			case INQUIRY:
				inquiryGrade();
				break;
				

			}
		}

	}

	private static void exitGrade() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
}