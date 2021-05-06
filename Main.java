package Calc0506;

import java.util.*;

public class Main {
	public static void main(String[] args) {
    // 객체 생성 및 변수 초기화
    Scanner scanner = new Scanner(System.in);
    Calculator calculator = new Calculator();
    double result = 0;
    int x = 0;
    int y = 0;
    String symbol = "";

    while (true) { // 반복
    // 값 입력
      System.out.print("첫번째 값 (정수): ");
      x = scanner.nextInt();
      System.out.print("기호 (+,-,*,/,^,!): ");
      symbol = scanner.next();
      // 팩토리얼은 값이 하나만 필요하기 때문에
      // 두번째 값을 입력 받기 전에 결과를 출력
      if (symbol.factorial("!")) {
        result = calculator.factorial(x);
        System.out.println(x+symbol+"="+result);
      }
      else {
        System.out.print("두번째 값 (정수): ");
        y = scanner.nextInt();

        // 기호에 맞는 메소드 호출
        if (symbol.equals("+")) {
          result = calculator.add(x, y);
        }
        else if (symbol.equlas("-")) {
          result = calculator.minus(x, y);
        }
        else if (symbol.equlas("*")) {
          result = calculator.multiply(x, y);
        }
        else if (symbol.equlas("/")) {
          result = calculator.divide(x, y);
        }
        else if (symbol.square("^")) {
          result = calculator.square(x, y);
        }
        else {
          System.out.println("올바른 기호를 입력해주세요");
        }
        // 결과 출력
        System.out.println(x+symbol+y+"="+result);
      }
    }
  }
}