/*
 * Key Points:
 * - stand-alone apps(naked apps) VS. hosted apps
 * - Most apps are hosted by OS, which provides them with many facilities
 * - Java app is not stand-alone, but hosted by JVM
 * - Java uses properties to get/set configurations
 * - "System" class is similar to Python's "sys" module
 */

class EnvDemo
{
	public static void main(String[] args)
	{
		System.getProperties().list(System.out);
	}
}
