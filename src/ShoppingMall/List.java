<<<<<<< HEAD
/**
   @name output
   @title 상품 출력
   @detail 상품을 출력하는 메소드
   @author 김영임
   @since 2021.06.03
   @version 1.0
   ============edit log============
   Date - Author - Note
   2021.06.03 - 김영임 - 초안 작성

 */

public static void output() {
      try {
         Object object = parser.parse(new FileReader("product_list.json"));
         array = (JSONArray) object;
         for (int i=0; i<array.size(); i++) {
            JSONObject obj = (JSONObject) array.get(i);
            System.out.print("아이디: " + obj.get("id") + "\t");
            System.out.print("이름: " + obj.get("productName") + "\t");
            System.out.print("가격: " + obj.get("price") + "\t");
            System.out.println("수량: " + obj.get("amount") + "\t");
         }
         
      }
      catch (FileNotFoundException e) { e.printStackTrace(); } 
      catch (IOException e) { e.printStackTrace(); } 
      catch (ParseException e) { e.printStackTrace(); }

      
   }

/**
   @name delete
   @title 상품 삭제 메소드
   @detail 상품을 삭제하는 메소드
   @author 김동엽
   @since 2021.06.03
   @version 1.0
   ============edit log============
   Date - Author - Note
   2021.06.03 - 김동엽 - 초안 작성
=======
package shoppingmall;
>>>>>>> 51a16106103ece8b6d91423383fae68f19d6f80c

static Scanner scanner = new Scanner(System.in);
static JSONArray array = new JSONArray();
static JSONParser parser = new JSONParser();

public static void input() {
   
   // JSONObject 생성
            JSONObject product = new JSONObject();
         
            System.out.println("id를 입력해주세요");
            product.put("id", scanner.nextInt());
            
            System.out.println("상품명을 입력해주세요");
            product.put("productName", scanner.nextInt());
            
            System.out.println("가격을 입력해주세요");
            product.put("price", scanner.next());
            
            System.out.println("수량을 입력해주세요");
            product.put("amount", scanner.next());
            
         
            // JSONArray에 JSONObject 입력
            array.add(product);

            // 파일에 덮어쓰기
            try {
               FileWriter file = new FileWriter(" product_list.json", false);
               file.write(array.toJSONString());
               file.flush();
               file.close();
            }
            catch (IOException e) {
               e.printStackTrace();
            }
   
}