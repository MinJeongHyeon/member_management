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
		
			// JSONObject ����
			JSONObject resident = new JSONObject();
		
			System.out.println("���� �Է����ּ���");
			resident.put("dong", scanner.nextInt());
			
			System.out.println("ȣ���� �Է����ּ���");
			resident.put("ho", scanner.nextInt());
			
			System.out.println("�����ָ� �Է����ּ���");
			resident.put("houseHolder", scanner.next());
			
			System.out.println("����ó�� �Է����ּ���");
			resident.put("Tel", scanner.next());
			
			System.out.println("�ְź� �Է����ּ���");
			resident.put("Sell", scanner.next());
		
			// JSONArray�� JSONObject �Է�
			array.add(resident);

			// ���Ͽ� �����
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
