package by.epam.training.java.vasilevsky.exchanger;

import java.util.Date;

public class Check extends AbstractModel{
	
	private Date dateCheck;
	private Integer sum;
	private UserCredentials userCredentials;
	private RegistryOperations registyOperations;

	public Date getDateCheck() {
		return dateCheck;
	}

	public void setDateCheck(Date dateCheck) {
		this.dateCheck = dateCheck;
	}

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}

	public UserCredentials getUserCredentials() {
		return userCredentials;
	}

	public void setUserCredentials(UserCredentials userCredentials) {
		this.userCredentials = userCredentials;
	}

	public RegistryOperations getRegistyOperations() {
		return registyOperations;
	}

	public void setRegistyOperations(RegistryOperations registyOperations) {
		this.registyOperations = registyOperations;
	}


}
