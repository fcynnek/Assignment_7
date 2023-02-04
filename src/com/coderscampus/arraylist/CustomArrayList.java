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
		
//		if (index != sizeOfList && index <= sizeOfList) {
			
			Object[] tempItems = new Object[sizeOfList];
			int i = 0;
			
			while (index <= sizeOfList) {
				items[index-1] = tempItems[i];
//				items[index+1] = tempItems[i];
				index++;
				i++;
			}
//			items[index] = item;
			
//			
//		} else if (index > sizeOfList) {
//			System.err.println("Index Out of Bounds Exception");
//		}
		
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

		if (index < sizeOfList) {

			int index1 = index;
			int index2 = index1+1;
			while (index < sizeOfList) {
				swapPositions(index2, index1);
				index1++;
//				items[index] = null;					
				if (index1 == sizeOfList) {
					break;
				} 
//				sizeOfList = sizeOfList-1;
			}
		} 
		else if (index == sizeOfList) {
			items[index] = null;
			sizeOfList = sizeOfList-1;
		} else if (index < sizeOfList) {
			
			while (index < sizeOfList) {
				int index2 = index;
				int index1 = index+1;
				swapPositions(index1, index2);
				index2++;
//				if (index1 == sizeOfList || index2 == sizeOfList) {
//					break;
//				} 
				items[index] = null;
				sizeOfList = sizeOfList-1;
			}
		}

		return null;
	}
	
	public void swapPositions (int index1, int index2) {
		
		Object tempHold = items[index1];
		items[index1] = items[index2];
		items[index2] = tempHold;
		
		
	}
	
}
