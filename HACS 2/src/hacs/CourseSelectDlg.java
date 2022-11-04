package hacs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 *
 * @author Amit Dave
 * @version 1.0
 */


@SuppressWarnings("serial")
public class CourseSelectDlg extends JDialog {
	ClassCourseList theCourseList;
	Course selectedCourse;
	int nCourseLevel = 0;
	
	
	boolean mBLogout = false;
	JComboBox<Course> courseNameCom = new JComboBox<>();
	JRadioButton highLevelRadio = new JRadioButton();
	JRadioButton lowLevelRadio = new JRadioButton();
	JLabel jLabel1 = new JLabel();
	JButton okButton = new JButton();
	ButtonGroup buttonGroup1 = new ButtonGroup();
	JButton buttonLogout = new JButton();

	public CourseSelectDlg() {
		try {
			jbInit();
			setSize(420, 238);
			setModal(true);
		} catch (Exception e) {
		}
	}

	private void jbInit() throws Exception {
		this.getContentPane().setLayout(null);
		courseNameCom.setBounds(new Rectangle(155, 41, 203, 22));
		highLevelRadio.setText("HighLevel");
		highLevelRadio.setBounds(new Rectangle(50, 87, 103, 26));
		lowLevelRadio.setToolTipText("");
		lowLevelRadio.setSelected(true);
		lowLevelRadio.setText("LowLevel");
		lowLevelRadio.setBounds(new Rectangle(236, 88, 103, 26));
		jLabel1.setText("CourseName");
		jLabel1.setBounds(new Rectangle(39, 44, 85, 18));
		okButton.setText("OK");
		okButton.setBounds(new Rectangle(78, 139, 79, 29));
		okButton.addActionListener(this::okButton_actionPerformed);
		buttonLogout.setText("Logout");
		buttonLogout.setBounds(new Rectangle(224, 140, 73, 31));
		buttonLogout.addActionListener(this::buttonLogout_actionPerformed);
		this.getContentPane().add(courseNameCom, null);
		this.getContentPane().add(jLabel1, null);
		this.getContentPane().add(highLevelRadio, null);
		this.getContentPane().add(lowLevelRadio, null);
		this.getContentPane().add(okButton, null);
		this.getContentPane().add(buttonLogout, null);
		buttonGroup1.add(highLevelRadio);
		buttonGroup1.add(lowLevelRadio);
	}

	public Course showDlg(ClassCourseList courseList) {

		theCourseList = courseList;
		CourseIterator theIterator = new CourseIterator(theCourseList);
		Course theCourse;
		while ((theCourse = (Course) theIterator.next()) != null) 
		{
			courseNameCom.addItem(theCourse);
		}
		setVisible(true);
		return selectedCourse;
	}

	void okButton_actionPerformed(ActionEvent e) {
		selectedCourse = (Course) courseNameCom.getSelectedItem();
		if (highLevelRadio.isSelected())
			nCourseLevel = 0;
		else
			nCourseLevel = 1;
		setVisible(false);
	}

	public boolean isLogout() {
		return mBLogout;
	}

	void buttonLogout_actionPerformed(ActionEvent e) {
		mBLogout = true;
		setVisible(false);
	}
}