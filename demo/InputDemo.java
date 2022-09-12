import java.util.Scanner;

class InputDemo
{
	public static void main(String[] args)
	{
		// The default delimiter is "whitespace", 
		// including "\n", " ", "\r", "\t",...
		Scanner scanner = new Scanner(System.in);

		// read a string, doesn't return until getting the token
		//string s = reader.next();

		// read a int
		//int a = reader.nextInt();

		// read a double
		//int d = reader.nextDouble();

		// read two doubles and print out the sum of them.
		double d1, d2;
		d1 = scanner.nextDouble();
		d2 = scanner.nextDouble();

		System.out.println(d1+d2);
	}
}
