import java.util.Scanner;

public class SphereVolume{
	public static void main(String[] args) {
		//variables
		double diameter;
		double radius;
		double volume;
		//final double pi=3.14;
		//string variable for output
		String output;
		//scanner object named input
		Scanner input = new Scanner(System.in);
		//title of this program
		System.out.println("Sphere volume calculator\n");
		//get diameter
		System.out.print("Enter the diameter of a shpere:");
		diameter = input.nextDouble();
		//calculate radius from diameter
		radius = diameter/2.0;
		//calculate volume from the formula
		volume = 4.0/3.0*Math.PI*Math.pow(radius, 3);
		//store output sentence into output variable
		output = "The volume of the shpere whose diameter is " + diameter + " is " + volume + ".";
		//display output
		System.out.println(output);
		//programmer 
		System.out.println("\nThank you for testing this programming");
		System.out.println("Programmer: Sungmin Kim");
		//close scanner object; input
		input.close();
	}
}