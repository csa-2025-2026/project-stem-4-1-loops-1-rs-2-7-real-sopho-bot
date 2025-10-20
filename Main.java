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

    int nums;
    System.out.println("Enter the amount of numbers you want to input: ");
    nums = scan.nextInt();

    int counter = 0;
    int userInput;
    int max=0;
    while (counter < nums)
    {
      userInput = scan.nextInt();
      if (max < userInput)
      {
        max = userInput;
      }
      counter ++;
    }
    
    System.out.println("The largest score is " + max);
    
   
   String user;
   System.out.println("Enter a word");
   user= scan.next();

   int index = 0;
   int threeCounter = 1;
   String currentLetter = "";
   while (index < user.length())
   {

 

    if (threeCounter == 3)
    {
      threeCounter = 1;
      index++;
    }
    else
    {
     currentLetter = user.substring(index, index + 1);
    }
   threeCounter++; 
    System.out.println(currentLetter);
   }





    scan.close();

    
  }
}
