For this assignment, you will create a class which must be named Fraction to store fractions. 
The class will hold two integer values: a numerator and a denominator. 
For your class, we will stick to positive fractions, meaning the numerator and the denominator must both be greater than 0. 
Your Fraction class will also keep track of the number of Fraction objects created by a program. 
You will need to create appropriate variables to store the information in these fields, all of which should be private.

You will also need to add all of the public constructors and methods which are described below. 
You may choose to add other methods to help you implement these.

Constructors

Fraction(): default constructor which creates a fraction 1/1

Fraction(int n, int d): If n is positive, set numerator to n. 
	Otherwise, set numerator to 1. If d is positive, set denominator to d. 
	Otherwise, set denominator to 1.

Accessors

int getNumerator(): Returns the numerator of the fraction.

int getDenominator(): Returns the denominator of the fraction.

static int getNumFractions(): Returns the number of fractions created in a program so far.

String toString(): Returns the fraction as a string in the format “numerator/denominator”. For example 1/2 or 5/3.

String mixedNumber(): Returns any improper (top-heavy) fraction as a mixed number, for example, 2 3/5. 
	If the numerator of the fraction part is 0, return only the integer part of the mixed number. 
	If the fraction is proper, return only the fraction part.

Mutators

void setNumerator(int n): Sets the numerator of the fraction to n if it is positive.

void setDenominator(int d): Sets the denominator of the fraction to d if it is positive.

void add(int n, int d): If n and d are both positive, add the fraction n/d to this fraction. 
	Otherwise, leave the fraction unchanged. 
	
void add(Fraction other): Add the fraction represented by other to this fraction. 
	Postcondition: the other Fraction is left unchanged.
	
void multiply(int n, int d): If n and d are both positive, multiply the fraction n/d by this fraction. 
	Otherwise, leave the fraction unchanged. Unsimplified is ok in this case. 
	
void multiply(Fraction other): Set this fraction to the product of this fraction and other. 
	Unsimplified is ok in this case. Postcondition: the other Fraction is left unchanged.
	
To test your code, you will need to run a FractionTester class with a main method. 
Don't add a main method to your Fraction class. 
