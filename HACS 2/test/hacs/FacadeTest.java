/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacs;

import org.junit.Test;
import static org.junit.Assert.*;


public class FacadeTest {
    
    Facade facade = new Facade();
    ClassCourseList classCourseList = new ClassCourseList();

	@Test
	public void testSubmitSolution() {
		int expected = 1;
		Assignment instance = new Assignment();
		Solution theSolution = new Solution();
		facade.submitSolution(instance, theSolution);
		assertEquals(expected, instance.getTheSolutionList().size());
	}

	@Test
	public void testCreateUser() {
		UserInfoItem instance = new UserInfoItem();
		instance.userType = UserInfoItem.UserType.STUDENT;
		facade.createUser(instance);
		assertTrue(facade.thePerson instanceof Student);
	}

	@Test
	public void testCreateCourseList() {
		int expected = 3;
		facade.createCourseList();
		assertEquals(expected, facade.theCourseList.size());
	}

	@Test
	public void testAttachCourseToUser() {
		int expected = 2;
		UserInfoItem instance = new UserInfoItem();
		instance.userType = UserInfoItem.UserType.STUDENT;
		instance.strUserName = "yaya";
		facade.createUser(instance);
		facade.createCourseList();
		facade.attachCourseToUser();
		assertEquals(expected, facade.thePerson.getCourseList().size());
	}

    
}
