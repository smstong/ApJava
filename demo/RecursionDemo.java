/*
 * Key Points:
 * - Recursion: something that runs itself
 * - "end" condition to exit 
 * - same method, different data (stack frame)
 * - Dont' excess the stack limit
 */

class RecursionDemo
{
	public static void main(String[] args)
	{
		System.out.println(fib(6));
	}

	static int fib(int n)
	{
		// exit condition
		if(n == 1) {
			return 1;
		}
		// exit condition
		if(n == 2) {
			return 2;
		}
		return fib(n-1) + fib(n-2);
	}
}
