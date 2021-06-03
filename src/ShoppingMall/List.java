package shoppingmall;

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