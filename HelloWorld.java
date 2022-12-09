package HelloWorld;

import java.util.Scanner;

public class HelloWorld {
   
   public static int fibonacci(int n) {
      if (n < 0) return -1;
      if (n == 2) return 1;
      int result = 0;
      int int1 = 1;
      int int2 = 1;
      for (int i = 2; i < n; i ++) {
         result = int1 + int2;
         int1 = int2;
         int2 = result;
      }
      return result;
   }
   
   public static void main(String[] args) {
	   
      Scanner scanner = new Scanner(System.in);
      int startNum;
      
      startNum = scanner.nextInt();
      System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
   }
}
