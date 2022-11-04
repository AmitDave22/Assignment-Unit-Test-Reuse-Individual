/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacs;

import org.junit.Test;
import static org.junit.Assert.*;


public class InstructorTest {
    
    Instructor instance = new Instructor();
    
    public InstructorTest() {
    }
    
    @Test
	public void testCreateCourseMenu() {
		CourseMenu courseMenu = instance.createCourseMenu(new Course("CSE240", 0), 0);
		assertTrue(courseMenu instanceof HighLevelCourseMenu);
	}

	@Test
	public void testInstructor() {
		int expected = 1;
		assertEquals(expected, instance.type);
	}
    
}
