package evaluation3.question4;

public class Customer {
private String userName;
private String password;
private String mobileNumber;
private String email;
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public boolean showDetails(String username,String password,String mobileNumber,String email ) {
	
	 if(this.userName.length()>8||this.userName.length()<3){
		 return true;
	 }
	 
	
	return true;
}

}
