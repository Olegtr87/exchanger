package by.epam.training.java.vasilevsky.exchanger;

import java.util.Date;

public class RegistryOperations extends AbstractModel {

	private UserCredentials userCredentials;
	private Integer totalOperations;
	private Operation operation;
	private Course course;
	private Integer summIn;
	private Integer summOut;
	private Currency currencyIn;
	private Currency currencyOut;
	private Date dateOperation;

	public UserCredentials getUserCredentials() {
		return userCredentials;
	}

	public void setUserCredentials(UserCredentials userCredentials) {
		this.userCredentials = userCredentials;
	}

	public Integer getTotalOperations() {
		return totalOperations;
	}

	public void setTotalOperations(Integer totalOperations) {
		this.totalOperations = totalOperations;
	}

	public Operation getOperation() {
		return operation;
	}

	public void setOperation(Operation operation) {
		this.operation = operation;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Integer getSummIn() {
		return summIn;
	}

	public void setSummIn(Integer summIn) {
		this.summIn = summIn;
	}

	public Integer getSummOut() {
		return summOut;
	}

	public void setSummOut(Integer summOut) {
		this.summOut = summOut;
	}

	public Currency getCurrencyIn() {
		return currencyIn;
	}

	public void setCurrencyIn(Currency currencyIn) {
		this.currencyIn = currencyIn;
	}

	public Currency getCurrencyOut() {
		return currencyOut;
	}

	public void setCurrencyOut(Currency currencyOut) {
		this.currencyOut = currencyOut;
	}

	public Date getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}

}
