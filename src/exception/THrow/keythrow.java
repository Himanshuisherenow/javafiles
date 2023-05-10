package exception.THrow;

import java.util.Scanner;

public class keythrow {

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");

        int age = sc.nextInt();

      if(age<18) {
          throw new RuntimeException("hey i am exception");
      }
      else {
          System.out.println("you are aligeble");
      }

      throw new ArithmeticException("it is not good practice");// if on the above else run, the exact below
                                                               // throw will run and if not than if would give error



    }
}
