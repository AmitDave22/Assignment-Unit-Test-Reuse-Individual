package hacs;

import java.util.*;

/**
 * Title:        HACS
 * Description:  CSE870 Homework 3:  Implementing Design Patterns
 * Copyright:    Copyright (c) 2002
 * Company:      Department of Computer Science and Engineering, Michigan State University
 * @author Amit Dave
 * @version 1.0
 * @author mjfindler
 * @version 2.0
 * Update to Java 8
 */

public class Course {
	protected String courseName;
	protected ArrayList<Assignment> assignmentList = new ArrayList<>();
	protected int assignCount;
	protected int courseLevel;

	public Course(String strCourse, int theLevel) {
		this.courseName = strCourse;
		this.courseLevel = theLevel;
		this.assignCount = 0;
	}

	public ArrayList<Assignment> getAssignmentList() {
		return assignmentList;
	}

	public void setAssignmentList(ArrayList<Assignment> assignmentList) {
		this.assignmentList = assignmentList;
	} 
	
	public void addAssignment(Assignment newAss) {
		getAssignmentList().add(newAss);
	}

        @Override
	public String toString() {
		return courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	void accept(NodeVisitor visitor) {
		visitor.visitCourse(this);
	}

	public int getAssignCount() {
		return assignCount;
	}

	public void setAssignCount(int assignCount) {
		this.assignCount = assignCount;
	}
}