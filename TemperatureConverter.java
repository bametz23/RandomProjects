import java.util.Scanner;
import java.util.Random;
public class TemperatureConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		boolean quitProgram = false;
		System.out.println("Welcome to the Temperature Gauge Converter!");
		System.out.println("");
		System.out.println("This program will allow the user to enter a temperature \nin a particular format and will convert it into other temperature units");
		
		while (quitProgram == false)
	{
		System.out.println("");
		System.out.println("Enter whether your temperature is in Farenheit, Celsius, or Kelvin \nby typing \"F\", \"C\", or \"K\" and pressing enter");
		String response = keyboard.nextLine();
		
		if(response.equalsIgnoreCase("F"))
		{
			System.out.println("");
			System.out.print("Enter the temperature in degrees Farenheit: ");
		
			double FarenheitNum = keyboard.nextDouble();
		
			keyboard.nextLine();
			System.out.println("");
			System.out.println("You entered " +FarenheitNum +" degrees Farenheit\nThe result is...");
			System.out.println("");
			double CConversion = (+FarenheitNum-32) * 5/9; 
			double FKConversion = +(FarenheitNum + 459.67) * 5/9;
			System.out.println(CConversion +" degrees Celsius and " +FKConversion +" degrees Kelvin");
			System.out.println("");
			System.out.println("Would you like to convert another temperature?");
			String DoAgain = keyboard.nextLine();
			if (DoAgain.equalsIgnoreCase("Yes"))
			{
				quitProgram = false;
			}
			else
			{
				quitProgram = true;
				
			}
		
		}
		
		else if(response.equalsIgnoreCase("C"))
		{
			System.out.println("");
			System.out.print("Enter the temperature in degrees Celsius: ");
			
			double CelsiusNum = keyboard.nextDouble();
			
			keyboard.nextLine();
			System.out.println("");
			System.out.println("You entered " +CelsiusNum+ " degrees Celsius." +"\nThe result is...");
			System.out.println("");
			double FConversion = (+CelsiusNum *9/5 +32);
			double CKConversion = +(CelsiusNum + 273.15);
			System.out.print(+FConversion +" degrees Farenheit and " +CKConversion +" degrees Kelvin");
			System.out.println("");
			System.out.println("Would you like to convert another temperature?");
			String DoAgain = keyboard.nextLine();
			if (DoAgain.equalsIgnoreCase("yes"))
			{
				quitProgram = false;
			}
			else
			{
				quitProgram = true;
				
			}
		}
		
		else if(response.equalsIgnoreCase("K"))
		{
			System.out.println("");
			System.out.print("Enter the temperature in degrees Kelvin: ");
			
			double KelvinNum = keyboard.nextDouble();
			keyboard.nextLine();
			System.out.println("");
			System.out.println("You entered " +KelvinNum+ " degrees Kelvin." +"\nThe result is...");
			double KFConversion = +KelvinNum * 9/5 - 459.67;
			double KCConversion = +KelvinNum - 273.15;
			System.out.println("");
			System.out.print(+KFConversion +" degrees Farenheit and " +KCConversion +" degrees Celsius");
			System.out.println("");
			System.out.println("Would you like to convert another temperature?");
			String DoAgain = keyboard.nextLine();
			if (DoAgain.equalsIgnoreCase("yes"))
			{
				quitProgram = false;
			}
			else
			{
				quitProgram = true;
				
			}
		}
		
		else
		
		{
			System.out.println("Invalid. Please try again...");
			System.out.println("");
			continue;
			
		}

	}
  }
}
