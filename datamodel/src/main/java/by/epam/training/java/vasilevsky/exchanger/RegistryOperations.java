package by.epam.training.java.vasilevsky.exchanger;

import java.util.Date;

public class RegistryOperations extends AbstractModel {

	private UserCredentials userCredentials;
	private Integer numberOperation;
	private Operation operation;
	private Course courseIn;
	private Course courseOut;
	private Integer summIn;
	private Integer summOut;
	private Date dateOperation;
	private Integer numberRegistry;

	public UserCredentials getUserCredentials() {
		return userCredentials;
	}

	public void setUserCredentials(UserCredentials userCredentials) {
		this.userCredentials = userCredentials;
	}

	public Integer getNumberOperation() {
		return numberOperation;
	}

	public void setNumberOperation(Integer numberOperation) {
		this.numberOperation = numberOperation;
	}

	public Operation getOperation() {
		return operation;
	}

	public void setOperation(Operation operation) {
		this.operation = operation;
	}

	public Course getCourseIn() {
		return courseIn;
	}

	public void setCourseIn(Course courseIn) {
		this.courseIn = courseIn;
	}

	public Course getCourseOut() {
		return courseOut;
	}

	public void setCourseOut(Course courseOut) {
		this.courseOut = courseOut;
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

	public Date getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}

	public Integer getNumberRegistry() {
		return numberRegistry;
	}

	public void setNumberRegistry(Integer numberRegistry) {
		this.numberRegistry = numberRegistry;
	}
}
