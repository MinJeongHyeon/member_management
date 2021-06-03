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

 */

public static void delete() {
      Object object = parser.parse(new FileReader("product_list.json"));
        array = (JSONArray) object;
        System.out.println("삭제할 상품의 id를 입력해주세요");
        int productId = scanner.next();
        for (int i=0; i<array.size(); i++) {
           JSONObject obj = (JSONObject) array.get(i);
            if(obj.get("id")==productId) {
               System.out.println(obj.get("productName") + " 상품이 제거되었습니다.");
            }
            else {
               System.out.println("해당 상품을 찾지 못했습니다.");
            }
         }


   }