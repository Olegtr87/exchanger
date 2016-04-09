package by.epam.training.java.vasilevsky.exchanger;

import java.util.Date;

public class UserProfile extends AbstractModel {

	private String lastName;
	private String firstName;
	private String patronymic;
	private String numberPassport;
	private Date dateIssue;
	private String issued;
	private UserCredentials userCredentials;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getNumberPassport() {
		return numberPassport;
	}

	public void setNumberPassport(String numberPassport) {
		this.numberPassport = numberPassport;
	}

	public Date getDateIssue() {
		return dateIssue;
	}

	public void setDateIssue(Date dateIssue) {
		this.dateIssue = dateIssue;
	}

	public String getIssued() {
		return issued;
	}

	public void setIssued(String issued) {
		this.issued = issued;
	}

	public UserCredentials getUserCredentials() {
		return userCredentials;
	}

	public void setUserCredentials(UserCredentials userCredentials) {
		this.userCredentials = userCredentials;
	}

}
