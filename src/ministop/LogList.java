package ministop;
import java.util.*;

public class LogList {
	// Scanner, ArrayList 객체 생성
	static Scanner scanner = new Scanner(System.in);
	static ArrayList<Log> logList = new ArrayList<Log>();
	
	public static void output() {
		for(int i=0; i<logList.size(); i++) {
			Log log = logList.get(i);
			System.out.print("ID: " + log.getId() + "\t");
			System.out.print("이름: " + log.getName() + "\t");
			System.out.println("판매수량: " + log.getAmount() + "\t");
			System.out.println("판매액: " + log.getSales() + "\t");
			System.out.println("누적판매액: " + log.getTotal() + "\t");
			
		}
	}
	
	public void setLog(Product product, int amount) {
		Log log = new Log();
		log.setId(product.getId());
		log.setName(product.getName());
		log.setAmount(amount);
		log.setSales(amount*product.getPrice());
		if (logList.size() == 0) {
			log.setTotal(log.getSales());
		}
		else {
			log.setTotal(logList.get(logList.size()-1).getTotal() + log.getSales());
		}
		logList.add(log);
	}
}
