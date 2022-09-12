class StringToNumberDemo
{
	public static void main(String[] args)
	{
		// string to int
		int a1 = Integer.parseInt("+12");
		int a2 = Integer.parseInt("-12");

		// string to double
		double d1 = Double.parseDouble("+12.0"); 
		double d2 = Double.parseDouble("-12.3"); 

		// int to string
		String s1 = String.format("%d", 12);

		// double to string
		String s2 = String.format("%f", 12.3);
	}
}
