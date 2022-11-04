/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacs;

import org.junit.Test;
import static org.junit.Assert.*;


public class CourseTest {
    
    public CourseTest() {
    }
    
    @Test
	public void testAddAssignment() {
		Course test = new Course("CSE240", 0);
		test.addAssignment(new Assignment());
		assertEquals(test.getAssignmentList().size(), 1);
	}
    
}
