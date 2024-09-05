import java.util.Scanner;

public class Convertion{
public static void main(String[]args){
	
	Scanner myScanner = new Scanner(System.in);
	
	System.out.print("Enter the number of inches: ");
	double inches = myScanner.nextDouble();
	double foot = inches / 12;
	
	System.out.println(inches + "inches is equal to " + foot + " feet");

}
}