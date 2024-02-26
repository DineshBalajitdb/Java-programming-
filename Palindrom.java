import java.util.Scanner; 
class Palindrom 
{
	public static void main(String[] string)
	{
		int reminder=0,inputNumber,reverseNumber=0;
		
		System.out.println("Enter the number For the palindrom");
		Scanner scanner=new Scanner(System.in);
		inputNumber= scanner.nextInt();
		
		while(inputNumber!=0)
		{	
			reminder=inputNumber%10;
			reverseNumber*=10+reminder;
			inputNumber/=10;
		}
		if(inputNumber==reverseNumber)
		{
			System.out.println( "It is a Palindrom");

		}
		else
		{
			System.out.println(" It is Not a Palindrom");
		}
	}

	
}