public class Member {
  String id = "";
  String name = "";
  int age = 0;

public Member(String id, String name, int age){
  this.id = id;
  this.name = name;
  this.age = age;
}
public String getId() {
  return this.id.getId();
}

public void setId(String id) {
  this.id.setId(id);
}

public String getName() {
  return this.id.getId();
}

public void setName(String name) {
  this.id.setName(name);
}

public int getAge() {
  return this.id.getAge();
}

public void setAge(String age) {
  this.id.setAge(age);
}


private static void deleteGrade() {
   

      Scanner s = new Scanner(System.in);
      String id = s.nextLine().trim();
      
      System.out.println(id + "을 삭제합니다.");
      map.remove(id);

   }
}
