package move_in_Management;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class List {
	
	static Scanner scanner = new Scanner(System.in);
	static JSONArray array = new JSONArray();
	static JSONParser parser = new JSONParser();
	
	public static void input() {
		
			// JSONObject 생성
			JSONObject resident = new JSONObject();
		
			System.out.println("동을 입력해주세요");
			resident.put("dong", scanner.nextInt());
			
			System.out.println("호수를 입력해주세요");
			resident.put("ho", scanner.nextInt());
			
			System.out.println("세대주를 입력해주세요");
			resident.put("houseHolder", scanner.next());
			
			System.out.println("연락처를 입력해주세요");
			resident.put("Tel", scanner.next());
			
			System.out.println("주거비를 입력해주세요");
			resident.put("Sell", scanner.next());
		
			// JSONArray에 JSONObject 입력
			array.add(resident);

			// 파일에 덮어쓰기
			try {
				FileWriter file = new FileWriter("jsonlist.json", true);
				file.write(array.toJSONString());
				file.flush();
				file.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		
	}
	
	public static void output() {
		try {
			Object object = parser.parse(new FileReader("jsonlist.json"));
			array = (JSONArray) object;
			for (int i=0; i<array.size(); i++) {
				System.out.println(array.get(i));
			}
			
		}
		catch (FileNotFoundException e) { e.printStackTrace(); } 
		catch (IOException e) { e.printStackTrace(); } 
		catch (ParseException e) { e.printStackTrace(); }

		
	}
}
