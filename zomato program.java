// this package is used to get the input from the user
import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the mobile number ");
		int mobile_number= scanner.nextInt();
		System.out.println("Enter the password ");
		int password = scanner.nextInt();
		System.out.println("ENTER THE NUMBER (40 to 100)");
		int number= scanner.nextInt();
		//this above condition is used to predict user is human or not
		if((number >= 40) &&(number<=100))
		{
		    System.out.println("enter the choice");
			System.out.println("1.nearby_hotel name ");
			System.out.println("2.view menu _card" );
			System.out.println("3.place order");
			System.out.println("4.exit");
			int choice = scanner.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("NEARBY HOTEL LIST");
				System.out.println("KONGU HOTEL");
				System.out.println("ARTHI HOTEL");
				System.out.println("ANNAPORANA HOTEL");
				System.out.println("ABC HOTEL");
				break;
			case 2:
				System.out.println(" menu card");
				System.out.println(" dosa = 50rupees");
				System.out.println("idli = 10rupees");
				System.out.println("briyani=100 rupees");
				System.out.println("meals=100rupees");
				break;
			case 3:
				System.out.println("PLACE ORDER");
				System.out.println(" select the food from menu card");
				System.out.println(" (1)-dosa = 50rupees");
				System.out.println("(2)-idli = 10rupees");
				System.out.println("(3)-briyani=100 rupees");
				System.out.println("(4)-meals=100rupees");
				int foodname =scanner.nextInt();
				int value =0;
				switch(foodname)
				{
				case 1:
					value=50;
					break;
				case 2:
					value=10;
					break;

				case 3:
					value=100;
					break;
				case 4:
					value= 100;
					break;


				}
				System.out.println("enter the count;") ;
				int quantity=scanner.nextInt();
				System.out.println("Total cost is: " + (value * quantity));
				System.out.println("Thank you!");

			case 4:
				System.out.println("exit from the program");
			}

		}

		else
		{
			System.out.println("you are not human");
			System.exit(0);
		}
		
	}
		
}
