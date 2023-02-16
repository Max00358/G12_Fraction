import java.util.*;

public class Fraction{

	//Create attributes
	private int numerator;
	private int denominator; 
	private int fractionCount;
	private static int numFractions = 0;
	
	//Constructing a method called Fraction
	public Fraction(){ 
		
		//Setting the default value of the fraction to 1
		this(1,1);
	
	}
	
	//Construct a method signature that accept user input for the numerator and the denominator value
	public Fraction(int n, int d){
		//if n or d value is larger than 0, then set n or d to that value, else set n or d value to 1
		if(n > 0){
			numerator = n;
		}
		else{
			numerator = 1;
		}
		if(d > 0){
			denominator = d;
		}
		else{
			denominator = 1;
		}
		//Let fractionCount equal to numFractions, whenever a new fraction is created, numFraction value increase by 1
		fractionCount = numFractions;
		numFractions++;
	}
	
	//Create an accessor method for the fraction's numerator
	public int getNumerator(){
		return numerator;
	}
	//Create a mutator method for the fraction's numerator
	public void setNumerator(int newN){
		numerator = newN;
	}
	
	//Create an accessor method for the fraction's denominator
	public int getDenominator(){
		return denominator;
	}
	//Create a mutator method for the fraction's denominator
	public void setDenominator(int newD){
		denominator = newD;
	}
	
	//Create an accessor method for the number of fraction created
	public int getFractionCount(){
		return fractionCount;
	}
	
	//Create a method that concatenate the numerator and the denominator to form the complete fraction
	public String toString(){
		return "\n\t Fraction: " + numerator + "/" + denominator;
	}
	
	//Create a public string method that turn fraction into mixed number format if the numerator is larger than the denominator
	public String mixedNumber(){
		int newNumerator = 0;
		int sideNum = 0;

		if(numerator > denominator){
			sideNum = numerator / denominator;
			newNumerator = numerator - (sideNum * denominator);
		}
		else{
			sideNum = 0;
			newNumerator = numerator;
		}
		return "\n\t Mixed number: " + sideNum + "(" + newNumerator + "/" + denominator + ")" + "\n\t# of fraction: " + Fraction.numFractions;
	}
	
	//Create a public void method that add n and d value of a new fraction to the original fraction
	public void add(int n, int d){
		int newD;
		int newN1;
		int newN2;
		
		//if the n & d value are both larger than 0 and if the denominator from the original fraction doesn't equal to the new d value, then find the common denominator of the fraction before continuing the addition process
		if(n > 0 && d > 0){
			if(denominator != d){
				newD = denominator * d;
				newN1 = numerator * d;
				newN2 = n * denominator;
				System.out.println("Adding your n/d value: " + (newN1 + newN2) + "/" + newD);
			}
			//else add the numerators together while keeping the denominator value as it is
			else{
				newD = denominator;
				newN1 = numerator;
				newN2 = n;
				System.out.println("Adding your n/d value: " + (newN1 + newN2) + "/" + newD);
			}
		}
		//if either n or d value is less than 0, then tell user to try and input correctly
		else{
			System.out.println("Your n or d value isn't positive, try again.");
		}
	}
	
	//Create a public void method that multiplies the n and d value with the original fraction value
	public void multiply(int n, int d){
		//Only proceed the multiplication when the n and d values are both larger than 0. Multiply the numerator with the n value and the denominator with the d value to gain the result of the multiplication
		if(n > 0 && d > 0){
			System.out.println("The result of multiplication: " + (n * numerator) + "/" +(d * denominator));
		}
		else{
			System.out.println("Your n or d value isn't positive, try again.");
		}
	}
	
	//Create a public void method that allow the program to directly add the new fraction to its previously created fraction in the same run
	public void add(Fraction other){
		int top;
		int bottom;
		
		//if the numerator and the denominator of the other fraction are both larger than 0, and if the denominator of this fraction differs from the denominator of other fraction, then find the common denominator before continuing the addition
		if(other.numerator > 0 && other.denominator > 0){
			if(this.denominator != other.denominator){
				top = (this.numerator * other.denominator) + (other.numerator * this.denominator);
				bottom = this.denominator * other.denominator;
				System.out.println("Adding the fraction you made: " + top + "/" + bottom);
				System.out.println("# of fraction: " + Fraction.numFractions);
			}
			//else add the numerator of this fraction to the numerator of other fraction to complete addition
			else{
				top = this.numerator + other.numerator;
				bottom = this.numerator;
				System.out.println("Adding the fraction you made: " + top + "/" + bottom);
				System.out.println("# of fraction: " + Fraction.numFractions);
			}
		}
		else{
			System.out.println("Your numerator or your denominator value isn't positive, try again.");
		}
	}
	
	//Create a public void method to directly multiply other fraction with the previous fraction created in the same run
	public void multiply(Fraction other){
		int top;
		int bottom;
		
		//if the numerator and the denominator of the other fraction are both larger than 0, then directly multiply this numerator with other numerator and multiply other denominator with this denominator
		if(other.numerator > 0 && other.denominator > 0){
			top = this.numerator * other.numerator;
			bottom = this.denominator * other.denominator;
			System.out.println("Multiplying the fraction you made: " + top + "/" + bottom);
			System.out.println("# of fraction: " + Fraction.numFractions);
		}
		else{
			System.out.println("Your numerator or your denominator value isn't positive, try again.");
		}
	}
}