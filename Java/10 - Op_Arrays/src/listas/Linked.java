package listas;

import java.util.LinkedList;

public class Linked {
	public static void main(String[] args) {
		
		LinkedList<String> cars = new LinkedList<String>();
		
		//ArrayList<String> cars = new ArrayList<String>();
		cars.add("EcoSport");
		cars.add("Mercedes");
		cars.add("Fox");
		cars.add("Gol");
		
		System.out.println(cars.contains("Gol"));//true
		
		cars.addFirst("Palio");
		cars.addLast("Mazda");
		//cars.removeLast();
		System.out.println(cars.get(0)); //palio
		System.out.println(cars.getLast());
		
		cars.clear();
		//System.out.println(cars);
		
		LinkedList<String> list = new LinkedList<String>();
		
		//Use add() method  to add elements in the list
		list.add("Geeks");
		list.add("for");
		
		
		//Check if the list contains Geeks
		System.out.println("A lista contem 'Geeks'? " + list.contains("Geeks"));
		
	}

}