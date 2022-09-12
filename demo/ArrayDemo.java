/*
Key points:
  - an Array is a reference type, int[], double[], String[]
  - Array.length 
  - two ways to traverse arrays
*/
class ArrayDemo
{
	public static void main(String[] args)
	{
		// instantiate an array object with inital value
		int a1[] = {1,2}; // C/C++ style, NOT suggested!	
		int[] a2 = {1,2};
		String[] names = {"John", "Issac", "Pete"};

		int[] a3 = new int[10]; // use "new" to create array
		a3[9] = 8;
		a3[0] = 1;
								

		// verify that int[] is a reference type
		System.out.println(int[].class);
		System.out.println(a2.getClass());

		// array's length is fixed and available as "length" final attribute.
		System.out.print("[");
		for(int i=0; i<a3.length; i++){
			System.out.print(a3[i] + ", ");
		}
		System.out.println("]");

		// another simpler traverse way for array
		int sum = 0;
		for(int n : a3){
			sum += n;
		}
		System.out.println(sum);

	}
}
