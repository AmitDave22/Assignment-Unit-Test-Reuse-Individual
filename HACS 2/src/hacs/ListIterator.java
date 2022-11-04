package hacs;

import java.util.*;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 *
 * @author Amit Dave
 * @version 1.0
 * @author mjfindler
 * @version 2.0 use <e> notation
 */

public class ListIterator implements Iterator<Object> {
	private ArrayList<Object> theList;
	private int currentNumber = -1;

	public ListIterator() {
		
	}

	public ListIterator(ArrayList<Object> list) {
		theList = list;
	}

	public ArrayList<Object> getTheList() {
		return theList;
	}

        @Override
	public boolean hasNext() {
            return currentNumber < theList.size() - 1;
	}

        @Override
	public Object next() {
		if (hasNext() == true) {
			currentNumber++;
			return theList.get(currentNumber);
		} else {
			return null;
		}
	}

        @Override
	public void remove() {
		theList.remove(currentNumber);
	}
}