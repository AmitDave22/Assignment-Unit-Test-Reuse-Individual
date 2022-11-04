/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacs;

import org.junit.Test;
import static org.junit.Assert.*;


public class SolutionIteratorTest {
    
    SolutionList instanceList = new SolutionList();
	Solution solution = new Solution();

	@Test
	public void testSolutionIterator() {
		new SolutionIterator();
	}

	@Test
	public void testSolutionIteratorSolutionList() {
		instanceList.add(solution);
		SolutionIterator solutionIterator = new SolutionIterator(instanceList);
		assertTrue(solutionIterator.hasNext());
	}

	@Test
	public void testMoveToHead() {
		int expected = -1;
		instanceList.add(solution);
		SolutionIterator solutionIterator = new SolutionIterator(instanceList);
		solutionIterator.MoveToHead();
		assertEquals(expected, solutionIterator.getCurrentSolutionNumber());
	}

	@Test
	public void testHasNext() {
		instanceList.add(solution);
		SolutionIterator solutionIterator = new SolutionIterator(instanceList);
		assertTrue(solutionIterator.hasNext());
	}

	@Test
	public void testNext() {
		instanceList.add(solution);
		SolutionIterator solutionIterator = new SolutionIterator(instanceList);
		assertNotNull(solutionIterator.next());
	}

	@Test
	public void testNextString() {
		solution.setTheAuthor("Amit Dave");
		instanceList.add(solution);
		SolutionIterator solutionIterator = new SolutionIterator(instanceList);
		assertNotNull(solutionIterator.next("Amit Dave"));
	}

	@Test
	public void testRemove() {
		int expected = 0;
		instanceList.add(solution);
		SolutionIterator solutionIterator = new SolutionIterator(instanceList);
		solutionIterator.next();
		solutionIterator.remove();
		assertEquals(expected, solutionIterator.solutionlist.size());
	}
    
}
