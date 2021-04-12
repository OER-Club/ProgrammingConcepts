
package integersum;

import java.util.Scanner;
import static javafx.application.Platform.exit;

/**
 *
 * @author Jessica
 */
public class IntegerSum
{

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args)
  {
    //Create a scanner and ask the user for a number
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("The objective of this program is to return the sum of a four digit number.\r\n");
    
    System.out.println("Please enter a four digit number: ");
    int numberToSum = scanner.nextInt();
    
    if(numberToSum == 0 || numberToSum > 9999 || numberToSum < 1000){
      System.out.println("The number you entered is invalid.");
    }
    
    else{
      int totalSum = sumOfNumbers(numberToSum);

      System.out.println("The sum of the digit entered is: " + totalSum );
    }
  }
  
   public static int sumOfNumbers(int number){
    
    int sum = 0;
    int remainder;
      for(int i = 0; i < 4; i++){
        remainder = number % 10;
        sum = sum + remainder;
        number = number / 10;
      }
  return sum;
}
  
}
