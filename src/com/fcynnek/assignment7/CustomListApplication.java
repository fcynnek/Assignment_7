package com.fcynnek.assignment7;

import com.coderscampus.arraylist.CustomArrayList;
import com.coderscampus.arraylist.CustomList;

public class CustomListApplication {

	public static void main(String[] args) {

		// TESTING THE CODE:
		CustomList<String> myCustomList = new CustomArrayList<>();

		// then add 10, 20, or 40 elements
		myCustomList.add("element 0"); 
		myCustomList.add("element 1"); 
		myCustomList.add("element 2");
		myCustomList.add("element 3");
		myCustomList.add("element 4");
		myCustomList.add("element 5");
		myCustomList.add("element 6");
		myCustomList.add("element 7");
		myCustomList.add("element 8");
		myCustomList.add("element 9"); // item #10
		myCustomList.add("element 10"); 
		myCustomList.add("element 11"); 
		myCustomList.add("element 12");
		myCustomList.add("element 13");
		myCustomList.add("element 14");
		myCustomList.add("element 15");
		myCustomList.add("element 16");
		myCustomList.add("element 17");
		myCustomList.add("element 18");
		myCustomList.add("element 19"); // item #20
		myCustomList.add("element 20"); 
		myCustomList.add("element 21"); 
		myCustomList.add(11, "new element 11");
		myCustomList.remove(10);
		myCustomList.add(11, "new new element 11");
		myCustomList.remove(30);
		myCustomList.remove(8);
		

		System.out.println(myCustomList.getSize());

		// then validate that all the elements exist in the data structure
		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println(myCustomList.get(i));
		}
	}


}
