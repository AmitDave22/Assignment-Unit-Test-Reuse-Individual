/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacs;

import org.junit.Test;
import static org.junit.Assert.*;


public class ClassCourseListTest {
    
    public ClassCourseListTest() {
    }
    
     @Test 
	  public void testFindCourseByCourseName() 
	  { 
		  ClassCourseList list = new ClassCourseList(); 
		  list.initializeFromFile(); 
		  Course course =list.findCourseByCourseName("CSE240");
		  assertEquals(course.getCourseName(),"CSE240");
		 }
	 
    
}
