import java.util.Scanner;
public class CharError
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
	String sentance = "i am learning to become a complete java programmer";
	String msg = null;
	int index = 0;
	
	System.out.println(sentance);
	System.out.println(" ");
	System.out.println("Enter the index of the character you'd like to display");
    index = scan.nextInt();
	int number = 0;
	
	try
	{
	char theCharacter  = (sentance.toUpperCase()).charAt(index);
	System.out.println("The Character Found Is:"+" "+theCharacter);
    }
	catch(StringIndexOutOfBoundsException cat)
	{
		System.out.println("the index number enter is too high re-enter");
		index = scan.nextInt();
	}
	finally
	{
        number = index;		
	}
	System.out.println("Index Number is " +" "+number+""+"\n"+"String length is"
	+" "+sentance.length());
	
	
  }
}