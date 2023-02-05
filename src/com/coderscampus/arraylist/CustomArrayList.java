package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	
	int capacity = 10; // initial max capacity of items array
	
	Object[] items = new Object[capacity];
	
	int sizeOfList = 0;

	@Override
	public boolean add(T item) {
		
		items[sizeOfList] = item;
		sizeOfList++;
		
		if (sizeOfList == capacity) {
			capacity = 2 * capacity;
			
			Object[] newItems = new Object[capacity];
			int i = 0;
				
			while (i <= sizeOfList-1) {
				newItems[i] = items[i];
				i++;
			}
						
			items = newItems;
		} 
		
		return false;
	}

	
	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		add(item);
		
		if (index < 0 || index > sizeOfList) {
			System.err.println("The list is currently empty");
		}
		int i = sizeOfList - 1;
		while (i >= index) {
			swapPositions(i, i + 1);
			i--;
		}
		items[index] = item;
		
		return false;
	}
	
	
	@Override
	public int getSize() {
		
		if (sizeOfList == 0) {
			System.err.println("The list is currently empty");
		}
		return sizeOfList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		
		if (index >= getSize() || index < 0)  {
			System.err.println("Index is out of Bounds");
		} else {
			return (T) items[index];
		}
		return null;
	}


	@Override
	public T remove(int index) throws IndexOutOfBoundsException {

		if (index < 0 || index >= sizeOfList) {
			System.err.println("Index is out of Bounds");
		}
		Object item = items[index];
		int i = index;
		while (i < sizeOfList - 1) {
			swapPositions(i, i + 1);
			i++;
		}
		items[sizeOfList - 1] = null;
		sizeOfList = sizeOfList - 1;
		return null;
	}
	
	public void swapPositions (int index1, int index2) {
		
		Object tempHold = items[index1];
		items[index1] = items[index2];
		items[index2] = tempHold;
	}
	
}
