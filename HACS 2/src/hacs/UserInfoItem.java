package hacs;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 *
 * @author Amit Dave
 * @version 1.0
 * @author mjfindler
 * @version 2.0
 *
 * Update to Java 8
 */

public class UserInfoItem {

	public enum UserType {
		STUDENT, INSTRUCTOR
	}

	String strUserName;
	UserType userType;
	
	public String getStrUserName() {
		return strUserName;
	}
	public void setStrUserName(String strUserName) {
		this.strUserName = strUserName;
	}
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
}