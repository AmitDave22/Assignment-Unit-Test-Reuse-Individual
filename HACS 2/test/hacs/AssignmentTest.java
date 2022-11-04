/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacs;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

public class AssignmentTest {
    
    public AssignmentTest() {
    }
    
    
		@Test
		public void testAddAssignment() {
			Assignment instance = new Assignment();
			instance.addSolution(new Solution());
			SolutionList solutionList = instance.getTheSolutionList();
			assertEquals(solutionList.size(), 1);
		}
		
		@Test
		public void testGetSolutionList() {
			Assignment instance = new Assignment();
			SolutionList solutionList = instance.getTheSolutionList();
			assertEquals(solutionList.getClass() == SolutionList.class, true);
		}

		@Test
		public void testIsOverDue() {
			Assignment instance = new Assignment();
			Long currentDate = System.currentTimeMillis();
			instance.setDueDate(new Date(currentDate));
			boolean isOverDue = instance.isOverDue();
			assertFalse(isOverDue);
		}

		@Test
		public void testDateFormat() {
			Assignment instance = new Assignment();
			System.out.println(System.currentTimeMillis());
			Long currentDate = 2571241870172l;
			instance.setDueDate(new Date(currentDate));
			String dueDateString = instance.getDueDateString();
			assertEquals(dueDateString, "6/24/51");
		}
		
		
		  @Test 
		  public void testGetSolution() { 
		  Assignment instance = new Assignment();
		  Solution solution = new Solution(); 
		  solution.setTheAuthor("Amit");
		  instance.addSolution(solution); 
		  Solution sampleSolution = instance.getSolution("Amit");
		  assertNotNull(sampleSolution); 
		  }
		  
    
}
