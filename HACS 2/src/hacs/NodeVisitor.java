package hacs;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 *
 * @author Amit Dave
 * @version 1.0
 */


abstract public class NodeVisitor {

	public NodeVisitor() {
	}

	public NodeVisitor(Object visitee) {
	}

	abstract public void visitFacade(Facade facade);

	abstract public void visitCourse(Course course);

	abstract public void visitAssignment(Assignment assignment);

}