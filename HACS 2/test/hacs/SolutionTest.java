/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacs;

import org.junit.Test;
import static org.junit.Assert.*;


public class SolutionTest {
    
    public SolutionTest() {
    }
    
    Solution instance = new Solution();

	@Test
	public void testToString() {
		instance.setTheAuthor("AmitDave");
		instance.setSolutionFileName("FOE");
		assertEquals("AmitDave FOE Grade=0 not reported", instance.toString());
	}

	@Test
	public void testGetGradeString() {
		String expected = "-1";
		assertEquals(expected, instance.getGradeString());
	}

	@Test
	public void testGetGradeInt() {
		int expected = 0;
		assertEquals(expected, instance.getGradeInt());
	}

	@Test
	public void testSetReported() {
		instance.setReported(true);
		assertTrue(instance.isReported());
	}

	@Test
	public void testIsReported() {
		instance.setReported(true);
		assertTrue(instance.isReported());
	}
    
}
