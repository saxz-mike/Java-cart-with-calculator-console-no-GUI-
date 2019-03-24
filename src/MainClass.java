import java.util.Scanner;

class MainClass
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int choice;		
		System.out.println("Welcome to The Chanu MegaStores Ltd.  \n Please chose a category to buy a product ");
		System.out.println(" 1. Electronics \n 2. Books \n 3. Home and Kitchen \n 4. Health and Household \n ");
		choice=input.nextInt();
		switch(choice)
		{
			case 1: Electronics e=new Electronics ();
					e.register();
					break;
                        case 2: Books b=new Books ();
					b.register();
					break;
                        case 3: homeAndKitchen hk=new homeAndKitchen ();
					hk.register();
					break;
                        case 4: healthAndHousehold hh=new healthAndHousehold ();
					hh.register();
					break;

			
			default: System.out.print("Invalid Choice");
		input.close();
		}
	}
}