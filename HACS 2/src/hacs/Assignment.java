package hacs;

/**
 * Title:        HACS
 * Description:  CSE870 Homework 3:  Implementing Design Patterns
 * Copyright:    Copyright (c) 2002
 * Company:      Department of Computer Science and Engineering, Michigan State University
 * @author Amit Dave
 * @version 1.0
 */

import java.util.*;
import java.text.DateFormat;

public class Assignment {

	protected String assignName;
	protected String strAssignmentFilename;
	protected Date dueDate = new Date();
	protected String assignSpec;
	protected SolutionList theSolutionList = new SolutionList();
	protected Solution suggestSolution = new Solution();

        
	public Assignment() {
	}

	public Date getDueDate() {
		return dueDate;
	}
	
	public void setDueDate(Date theDueDate) {
		this.dueDate = theDueDate;
	}

	public void setAssSpec(String theSpec) {
		this.assignSpec = theSpec;
	}
	
	public String getAssignName() {
		return assignName;
	}

	public void setAssignName(String assignName) {
		this.assignName = assignName;
	}

	public boolean isOverDue() {
		Date today;
		today = new Date();
		if (today.after(this.dueDate)) {
			return true;
		}
		else {
			return false;
		}
	}

	public void addSolution(Solution theSolution) {
		theSolutionList.add(theSolution);
	}

	public SolutionList getTheSolutionList() {
		return theSolutionList;
	}

	public void setTheSolutionList(SolutionList theSolutionList) {
		this.theSolutionList = theSolutionList;
	}
        
	public Solution getSolution(String studentname) {
		SolutionIterator Iterator = new SolutionIterator(theSolutionList);
		return Iterator.next(studentname);
	}

	public Solution getSugSolution() {
		return suggestSolution;
	}

	public void setSuggestSolution(Solution suggestSolution) {
		this.suggestSolution = suggestSolution;
	}

	public SolutionIterator getSolutionIterator() {
		SolutionIterator theSolutionIterator = new SolutionIterator(theSolutionList);
		return theSolutionIterator;
	}

        @Override
	public String toString() {
		return assignName;
	}

	public String getDueDateString() {
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
		return dateFormat.format(dueDate);
	}

	public void accept(NodeVisitor visitor) {
		visitor.visitAssignment(this);
	}
}