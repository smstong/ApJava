/*
 * Key points:
 *	- resizable array
 *	- ArrayList<T> implemented List<T> interface
 *	- ArrayList<T> is a reference type
 *	- get length with ArrayList.size()
 *  - two ways to traverse
 */

import java.util.ArrayList;
import java.util.List;

class ArrayListDemo
{
	public static void main(String[] args)
	{
		// List<int> list1 = new ArrayList<int>(); // error! generic only works for reference type.
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();

		// verify that ArrayList<Integer> is a class
		System.out.println(list1.getClass());

		// get size
		int n = list1.size();
		System.out.println("size: " + n);

		// append an element to the end
		list1.add(1); // auto boxing
		list1.add(2);
		list1.add(3);
		System.out.println(list1);

		// get an element
		list1.get(0);

		// update an element
		list1.set(0, 10);
		System.out.println(list1);

		// remove an element
		list1.remove(0);
		System.out.println(list1);

		// two ways to traverse
		for(int i=0; i<list1.size(); i++){
			System.out.print(list1.get(i));
		}

		for(int e : list1){ // auto unboxing
			System.out.print(e);
		}

		// advanced: ArrayList of ArrayList
		var arrayList2d = new ArrayList<ArrayList<Double>>();
		arrayList2d.add(new ArrayList<Double>());
		arrayList2d.add(new ArrayList<Double>());
	}

}
