class BoxingDemo
{
	public static void main(String[] args)
	{
		// primitive type to wrapper class
		// Integer obj = new Integer(3); // deprecated!!!
		
		Integer objInt = Integer.valueOf(3);
		Double objDouble = Double.valueOf(3.0);
		Boolean objBoolean = Boolean.valueOf(true);


		// wrapper class to primitive

		int a = objInt.intValue();
		double d = objDouble.doubleValue();

		// auto boxing/unboxing
		testAutoBoxing(5);
		testAutoUnBoxing(objInt);
	}

	static void testAutoBoxing(Integer obj)
	{
		System.out.println(obj.getClass());
	}

	static void testAutoUnBoxing(int a)
	{
	}
}
