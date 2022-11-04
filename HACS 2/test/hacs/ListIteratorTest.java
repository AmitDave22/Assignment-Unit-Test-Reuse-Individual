/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;


public class ListIteratorTest {
    
    ListIterator instance = new ListIterator();

	@Test
	public void instanceListIteratorArrayListOfObject() {
		int expected = 1;
		ArrayList<Object> instanceList = new ArrayList<>();
		instanceList.add(1);
		ListIterator instance = new ListIterator(instanceList);
		assertEquals(expected, instance.getTheList().size());
	}

	@Test
	public void testHasNext() {
		ArrayList<Object> instanceList = new ArrayList<>();
		instanceList.add(1);
		ListIterator instance = new ListIterator(instanceList);
		assertTrue(instance.hasNext());
	}

	@Test
	public void testNext() {
		ArrayList<Object> instanceList = new ArrayList<>();
		instanceList.add(1);
		ListIterator instance = new ListIterator(instanceList);
		assertNotNull(instance.next());
	}

	@Test
	public void testRemove() {
		int expected = 0;
		ArrayList<Object> instanceList = new ArrayList<>();
		instanceList.add(1);
		ListIterator instance = new ListIterator(instanceList);
		instance.next();
		instance.remove();
		assertEquals(expected, instance.getTheList().size());
	}
    
}
