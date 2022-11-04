package hacs;

/**
 * Title:        HACS
 * Description:
 * Copyright:    Copyright (c) 2002
 * Company:      msu
 * @author Amit Dave
 * @version 1.0
 */

import java.awt.*;

@SuppressWarnings("serial")
public class HighLevelCourseMenu extends CourseMenu {

	public HighLevelCourseMenu() {
	}

        @Override
        @SuppressWarnings({"empty-statement", "empty-statement"})
	void showMenu(Course theCourse) {
		showViewButtons();
		showRadios();
		showComboxes();
		setVisible(true);
		;
	}

        @Override
	void showAddButtons() {
		assignmentAddButton.addActionListener(this::assignmentAddButton_actionPerformed);
		assignmentAddButton.setText("Add");
		assignmentAddButton.setBounds(new Rectangle(389, 54, 79, 29));
		optionAddButton.setText("Add");
		optionAddButton.setBounds(new Rectangle(390, 125, 79, 29));
		this.getContentPane().add(assignmentAddButton, null);
		this.getContentPane().add(optionAddButton, null);
	}

        @Override
	void showRadios() {
		assignmentRadiao.setText("Assignment");
		assignmentRadiao.setBounds(new Rectangle(21, 55, 103, 26));
		this.getContentPane().add(assignmentRadiao, null);
		optionRadio.setText("HighLevel Presentation");
		optionRadio.setBounds(new Rectangle(21, 128, 103, 26));
		this.getContentPane().add(optionRadio, null);
	}

        @Override
	void showComboxes() {
		assignmentCombox.setBounds(new Rectangle(140, 57, 126, 22));
		optionCombo.setBounds(new Rectangle(137, 127, 126, 22));
		this.getContentPane().add(assignmentCombox, null);
		this.getContentPane().add(optionCombo, null);
		refresh();
	}

        @Override
	void showViewButtons() {
		assignmentViewButton.setText("View");
		assignmentViewButton.setBounds(new Rectangle(290, 54, 79, 29));
		assignmentViewButton.addActionListener(this::assignmentViewButton_actionPerformed);
		optionViewButton.setText("View");
		optionViewButton.setBounds(new Rectangle(290, 124, 79, 29));
		this.getContentPane().add(assignmentViewButton, null);
		this.getContentPane().add(optionViewButton, null);
	}

        @Override
	void showLabel() {
		assignmentContentLable.setText("AssigmentContent");
		assignmentContentLable.setBounds(new Rectangle(23, 186, 432, 99));
		this.getContentPane().add(assignmentContentLable, null);
	}
}