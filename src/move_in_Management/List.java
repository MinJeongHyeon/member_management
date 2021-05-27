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
					resident.put("tel", scanner.next());
					
					System.out.println("임대 방식을 입력해주세요 (자가, 전세, 월세)");
					resident.put("sell", scanner.next());
				
					// JSONArray에 JSONObject 입력
					array.add(resident);

					// 파일에 덮어쓰기
					try {
						FileWriter file = new FileWriter("jsonlist.json", false);
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
				JSONObject obj = (JSONObject) array.get(i);
				System.out.print(obj.get("dong") + "동\t");
				System.out.print(obj.get("ho") + "호\t");
				System.out.print("세대주: " + obj.get("houseHolder") + "\t");
				System.out.print("연락처: " + obj.get("tel") + "\t");
				System.out.println("임대 방식: " + obj.get("sell") + "\t");
			}
			
		}
		catch (FileNotFoundException e) { e.printStackTrace(); } 
		catch (IOException e) { e.printStackTrace(); } 
		catch (ParseException e) { e.printStackTrace(); }

		
	}
}
