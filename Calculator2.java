public class Calculator2 extends Calculator {
   static int square(int a,int b) {
    int result=a;
    for (int i=0; i<b;i++) {
      result *= a;
    }
      return result;
   }
   static int factorial(int a) {
    int result=1;
    for (int i=1; i<=a; i++) {
      result*=i;
    }
      return result;
   }
}
