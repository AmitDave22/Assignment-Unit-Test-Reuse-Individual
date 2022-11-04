package hacs;

import java.util.Iterator;
import java.util.*;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 *
 * @author Amit Dave
 * @version 1.0
 * @author mjfindler
 * @version 2.0
 *
 * update to Java 8
 */
public class ReminderVisitor extends NodeVisitor {

	Reminder mReminder;

	public ReminderVisitor() {
	}

	public ReminderVisitor(Reminder reminder) {
		mReminder = reminder;
	}
        
        public Reminder getmReminder() {
		return mReminder;
	}


        @Override
	public void visitFacade(Facade facade) {
		CourseIterator courseList = new CourseIterator(facade.theCourseList);
		while (courseList.hasNext()) {
			Course course = (Course) courseList.next();
			course.accept(this);
		}
	}

        @Override
	public void visitCourse(Course course) {
		Iterator<Assignment> assignmentList = course.getAssignmentList().listIterator();
		while (assignmentList.hasNext()) {
			Assignment assignment = assignmentList.next();
			assignment.accept(this);
		}
	}

        @Override
	public void visitAssignment(Assignment assignment) {
		Date today = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(today);
		int ntoday = calendar.get(Calendar.DAY_OF_YEAR);
		calendar.setTime(assignment.getDueDate());
		int nDueDate = calendar.get(Calendar.DAY_OF_YEAR);
		if (nDueDate <= (ntoday + 1) && nDueDate >= ntoday) 
		{
			mReminder.listUpcoming.add("today is " + today.toString() + " " + assignment.getAssignName() + " Due Date is "
					+ assignment.getDueDateString());
		}
		if (nDueDate < ntoday) {
			mReminder.listOverdue.add(assignment.getAssignName() + " Due Date is " + assignment.getDueDateString());
		}

	}
        
        

}