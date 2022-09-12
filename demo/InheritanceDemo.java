/*
 * Key points:
 * - Single inheritance
 * - Implements multiple interfaces
 *
 */
class InheritanceDemo
{
	public static void main(String[] args)
	{
		Dog dog = new Dog("Bob", 2);
		dog.eat();
		dog.bark();
	}
}

class Animal
{
	protected String name;
	protected int age;

	public Animal(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public Animal()
	{
		System.out.println("Animal:Animal()");
	}
	public void eat()
	{
		System.out.println(this.name + " is eating...");
	}
	public void run()
	{
		System.out.println(this.name + " is running...");
	}
}

class Dog extends Animal
{
	public Dog()
	{
	}
	public Dog(String name, int age)
	{
		super(name, age);
	}
	public void bark()
	{
		System.out.println(this.name + " is barking...");
	}
}

class Cat extends Animal
{
	public Cat(String name, int age)
	{
		super(name, age);
	}
	public void meow()
	{
		System.out.println("meowing...");
	}
}
