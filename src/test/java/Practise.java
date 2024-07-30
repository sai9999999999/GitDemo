import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Practise {

	public static void main(String[] args) {
		// collections();
		//list();
		getData();	
	}
	
	

	public static void collections() {

		Collection<String> fruits = new ArrayList<>();

		fruits.add("apple");
		fruits.add("orange");
		fruits.add("mango");

		System.out.println(fruits);

		fruits.remove("apple");

		System.out.println(fruits);

		System.out.println(fruits.contains("orange"));

		fruits.forEach((element) -> System.out.println(element));

		fruits.clear();

	}

	public static void list() {

		List<String> fruits = new ArrayList<>();

		// Allows duplicates
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("apple");

		// System.out.println(fruits);

		// inserted in order
		// System.out.println(fruits.get(1));

		fruits.add(null);

		List<String> fruits1 = Arrays.asList("apple", "orange");

//System.out.println(fruits1);

		for (Iterator iterator = fruits1.iterator(); iterator.hasNext();) {
			String fruit = (String) iterator.next();
			// System.out.println(fruit);

			Iterator it = fruits1.iterator();
			while (it.hasNext()) {

				String fruit2 = (String) it.next();

				System.out.println(fruit2);

			}

		}

		
		
		
		
	}

	
	public static void getData() {
		 List<Employees> data  = new ArrayList<Employees>();
	
	
	data.add(new Employees(1,"sai",28,100000));
	data.add(new Employees(2,"varun",30,10000));
	data.add(new Employees(3,"ajay",23,780000));
	data.add(new Employees(4,"sachin",59,900000));
	Collections.sort(data, new Comparator<Employees>() {

		@Override
		public int compare(Employees o1, Employees o2) {
			// TODO Auto-generated method stub

			return (int) (o1.getSalary() - o2.getSalary());		}
	});

		System.out.println(data);
	}
	
	
	class SortBy implements Comparator<Employees>{

		
		@Override
		public int compare(Employees o1, Employees o2) {
			
			return (int) (o1.getSalary() - o2.getSalary());
		}
	
	
	}
	
	
	public static void print(String name) {
		
		  System.out.println(name);
		  System.out.println("commit by gutY");
		  System.out.println("gitstuff commit");
		
	}
	
	
	
	
	
	
	
	
	
}
