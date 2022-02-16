package projecte;
import java.util.Scanner;
public class Projecte
{
	public static final int MAX = 15, VALUES = 5;

	public static void main(String [] args)
	{
            Scanner scan = new Scanner(System.in);
		int [] myArray = new int[MAX];

		for(int i = 0; i < VALUES; i++)
		{
			myArray[i] = i;
		}
		
		System.out.println("Please, tell me " + (MAX - VALUES) + " numbers");

		for (int i = VALUES; i < MAX; i++)
		{
			myArray[i] = scan.nextInt();
		}

		mysteryFunction(myArray);

		System.out.println("-----------");

		for (int i = 0; i < MAX; i++)
		{
			System.out.print(myArray[i] + " ");
		}

		System.out.println("\n-----------");
	}

	public static void mysteryFunction(int [] someArray)
	{
		for (int i = 0; i < someArray.length; i = i + 3) // També podriem indicar i < MAX
		{
			someArray[i] *= 2; // someArray[i] = sumeArray[i] * 2
		}
	}
}
