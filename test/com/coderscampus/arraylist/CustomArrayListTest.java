package com.coderscampus.arraylist;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	@Test
	public void testAddMethod() {
		CustomArrayList<Integer> list = new CustomArrayList<>();
		assertEquals(null, list.get(0));
		assertEquals(false, list.add(1));
		assertEquals(1, list.getSize());
		
		for (int i = 0; i<20; i++) {
			list.add(i);
		}
		assertEquals(21, list.getSize());
	}
	
	@Test
	public void testAddAtIndexMethod() {
		CustomArrayList<String> list = new CustomArrayList<>();
		list.add("Hello");
		assertEquals(false, list.add(0, "World"));
		assertEquals("World", list.get(0));
		assertEquals("Hello", list.get(1));
		assertEquals(2, list.getSize());
	}
	
	@Test
	public void testGetMethod() {
		CustomArrayList<Double> list = new CustomArrayList<>();
		list.add(3.14);
		assertEquals(3.14, list.get(0), 0);
		assertEquals(1, list.getSize());
	}
	
	@Test
	public void testGetMethodWithInvalidIndex() {
		CustomArrayList<Boolean> list = new CustomArrayList<>();
		list.get(0);
	}
	
	@Test
	public void testRemoveMethod() {
		CustomArrayList<Character> list = new CustomArrayList<>();
		list.add('A');
		list.add('B');
		list.remove(0);
		assertEquals('B', list.get(0));
		assertEquals(1, list.getSize());
	}
	
	@Test
	public void testRemoveMethodWithInvalidIndex() {
		CustomArrayList<Integer> list = new CustomArrayList<>();
		list.remove(0);
	}
	
	@Test
	public void testExceptions() {
		CustomArrayList<String> list = new CustomArrayList<>();
//		assertThrows(IndexOutOfBoundsException.class, () -> list.remove(0));
		assertThrows(IndexOutOfBoundsException.class, () -> list.add(30, "Hello World")); 
//		assertThrows(IndexOutOfBoundsException.class, () -> list.remove(5));
	}

}
