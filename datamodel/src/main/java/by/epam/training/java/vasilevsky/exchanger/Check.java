package by.epam.training.java.vasilevsky.exchanger;

import java.util.Date;

public class Check extends AbstractModel{
	
	private Date dateCheck;	
	private RegistryOperations registyOperations;

	public Date getDateCheck() {
		return dateCheck;
	}

	public void setDateCheck(Date dateCheck) {
		this.dateCheck = dateCheck;
	}

	public RegistryOperations getRegistyOperations() {
		return registyOperations;
	}

	public void setRegistyOperations(RegistryOperations registyOperations) {
		this.registyOperations = registyOperations;
	}
}
