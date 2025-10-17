import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter non-negative numbers (Enter -1 to stop)");
    double input = 0;
    double sum = 0;

    while (input != -1)
    {
      input = scan.nextDouble();
      sum += input;
    }

    if (input == -1);
    {
      sum ++;
      System.out.println("Sum is " + sum);
    }


    System.out.println("Enter the amount of numbers you want to input: ");
    int input = scan.nextInt();
    int nums = 0; 
    
    if (input > Integer.MAX_VALUE())
    {
      
    }

    scan.close();

    
  }
}
