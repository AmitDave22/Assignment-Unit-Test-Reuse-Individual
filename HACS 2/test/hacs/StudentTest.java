/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacs;

import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    
    Student instance = new Student();

	@Test
	public void testStudent() {
		int expected = 0;
		assertEquals(expected, instance.type);
	}

	@Test
	public void testCreateCourseMenu() {
		CourseMenu courseMenu = instance.createCourseMenu(new Course("CSE240", 0), 0);
		assertTrue(courseMenu instanceof HighLevelCourseMenu);
	}
    
}
