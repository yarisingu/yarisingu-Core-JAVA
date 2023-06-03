package datatypes;

// Java Program to Demonstrate  Primitive Data Type

// Class
public class PrimitiveDataTypes {

	/*There are 8 main primitive data types in java as mentioned below:
		->	boolean
		->	byte
		->	char
		->	short
		->	int
		->	long
		->	float
		->	double */

	// Main driver method


	public static void main(String args[])
	{

		/* Creating and initializing custom character

		Char uses 2 bytes in java because it uses the Unicode system rather than the ASCII system. 
		" \ u 0 0 0 " is the lowest range of the Unicode system */


		char a = 'G';

		// Integer data type is generally
		// used for numeric values
		int i = 89;

		// use byte and short
		// if memory is a constraint
		byte b = 4;

		// this will give error as number is
		// larger than byte range
		// byte b1 = 7888888955;

		short s = 56;

		// this will give error as number is
		// larger than short range
		// short s1 = 87878787878;

		// by default fraction value
		// is double in java
		double d = 4.355453532;

		// for float use 'f' as suffix as standard
		float f = 4.7333434f;

		// need to hold big range of numbers then we need
		// this data type
		long l = 12121;

		System.out.println("char: " + a);
		System.out.println("integer: " + i);
		System.out.println("byte: " + b);
		System.out.println("short: " + s);
		System.out.println("float: " + f);
		System.out.println("double: " + d);
		System.out.println("long: " + l);
	}
}
