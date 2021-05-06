public class Calculator2 extends Calculator {
   static int square(int a,int b) {
    int result=a;
    for (int i=0; i<b;i++) {
      result *= a;
    }
      return result;
   }
}