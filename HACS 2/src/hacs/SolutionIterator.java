package hacs;

import java.util.Iterator;

/**
 * Title:        HACS
 * Description:
 * Copyright:    Copyright (c) 2002
 * Company:      msu
 * @author Amit Dave
 * @version 1.0
 */


public final class SolutionIterator implements Iterator<Solution> {
	SolutionList solutionlist;

	int currentSolutionNumber = -1;

	public SolutionIterator() {
	}
        
        public int getCurrentSolutionNumber() {
		return currentSolutionNumber;
	}

	public SolutionIterator(SolutionList thesolutionlist) {
		solutionlist = thesolutionlist;
		MoveToHead();
	}

	public void MoveToHead() {
		currentSolutionNumber = -1;
	}

        @Override
	public boolean hasNext() {
		int size = solutionlist.size();
            return currentSolutionNumber < size - 1;
	}

        @Override
	public Solution next() {
		if (hasNext() == true) {
			currentSolutionNumber++;
			return solutionlist.get(currentSolutionNumber);
		} else {
			return null;
		}

	}

	public Solution next(String UserName) {
		Solution theSolution;
		theSolution = (Solution) next();
		while (theSolution != null) {
			if (UserName.compareTo(theSolution.getTheAuthor()) == 0) {
				return theSolution;
			}
			theSolution = (Solution) next();
		}
		return null;
	}

        @Override
	public void remove() {
		int size = solutionlist.size();
		solutionlist.remove(size-1);
	}

}