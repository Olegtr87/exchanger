package by.epam.training.java.vasilevsky.exchanger;

public class Balance extends AbstractModel {

	private Integer debit;
	private Integer credit;
	private Currency currency;
	private RegistryOperations registryoperations;

	public Integer getDebit() {
		return debit;
	}

	public void setDebit(Integer debit) {
		this.debit = debit;
	}

	public Integer getCredit() {
		return credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public RegistryOperations getRegistryoperations() {
		return registryoperations;
	}

	public void setRegistryoperations(RegistryOperations registryoperations) {
		this.registryoperations = registryoperations;
	}

}
