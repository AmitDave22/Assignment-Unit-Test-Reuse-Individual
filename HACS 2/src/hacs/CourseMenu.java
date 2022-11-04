package hacs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Iterator;

/**
 * Title:        HACS
 * Description:
 * Copyright:    Copyright (c) 2002
 * Company:      msu
 * @author Amit Dave
 * @version 1.0
 */

@SuppressWarnings("serial")
abstract public class CourseMenu extends JDialog {
	private Course theCourse;
	
	public Course getTheCourse() {
		return theCourse;
	}

	public void setTheCourse(Course theCourse) {
		this.theCourse = theCourse;
	}

	boolean bLogout = true;
	JRadioButton assignmentRadiao = new JRadioButton();
	JComboBox<Assignment> assignmentCombox = new JComboBox<>();
	JButton assignmentViewButton = new JButton();
	JButton assignmentAddButton = new JButton();
	JRadioButton optionRadio = new JRadioButton();
	JLabel assignmentContentLable = new JLabel();
	JComboBox<Rectangle> optionCombo = new JComboBox<>();
	JButton optionViewButton = new JButton();
	JButton optionAddButton = new JButton();
	JButton buttonChangeCourse = new JButton();
	JButton buttonLogout = new JButton();

	public CourseMenu() {

		try {
			jbInit();
		} catch (Exception e) {
		}
		setModal(true);
		setSize(503, 294);
	}

	private void jbInit() throws Exception {
		buttonChangeCourse.setText("ChangeCourse");
		buttonChangeCourse.setBounds(new Rectangle(101, 211, 73, 37));
		buttonChangeCourse.addActionListener(this::buttonChangeCourseActionPerformed);
		this.getContentPane().setLayout(null);
		this.setTitle("");
		buttonLogout.setText("Logout");
		buttonLogout.setBounds(new Rectangle(267, 215, 73, 37));
		buttonLogout.addActionListener(this::buttonLogoutActionPerformed);
		this.getContentPane().add(buttonChangeCourse, null);
		this.getContentPane().add(buttonLogout, null);
	}

	abstract void showMenu(Course theCourse);

	abstract void showAddButtons();

	abstract void showViewButtons();

	abstract void showRadios();

	abstract void showComboxes();

	abstract void showLabel();

	void assignmentAddButton_actionPerformed(ActionEvent e) {
		Hacs.theFacade.addAssignment(theCourse);
		refresh();
	}

	void assignmentViewButton_actionPerformed(ActionEvent e) {
		Assignment theAss = (Assignment) assignmentCombox.getSelectedItem();
		Hacs.theFacade.viewAssignment(theAss);
	}

	void refresh() {
		assignmentCombox.removeAllItems();
		Iterator<Assignment> Iter = theCourse.getAssignmentList().iterator();
		while (Iter.hasNext()) {
			assignmentCombox.addItem(Iter.next());
		}
	}

	void buttonChangeCourseActionPerformed(ActionEvent e) {
		bLogout = false;
		setVisible(false);
	}

        @SuppressWarnings("empty-statement")
	void buttonLogoutActionPerformed(ActionEvent e) {
		bLogout = true;
		setVisible(false);
		;
	}

	boolean ifLogout() {
		return bLogout;
	}
}