package exception.throwsx;

import java.io.InterruptedIOException;

public class localclass {
      // java throws use to bypass the exception. while compile time it ask to main method who
      // who is going to handle this exception and it direct to the JVM and show this (throws InterruptedException)
    // there is a no gerunty in this type for handling method this is like you are giving your work to someone
    public static void main(String[] args) throws InterruptedException,ArithmeticException {
        for (int i=0; i<6;i++) {
            System.out.println(i);
            Thread.sleep(2000);

        }// you can do this also by try and catch
        //throws also use with checked exception
        // it can just handle one exception
        
    }
}

