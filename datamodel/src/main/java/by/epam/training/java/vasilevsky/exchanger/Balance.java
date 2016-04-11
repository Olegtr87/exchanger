package by.epam.training.java.vasilevsky.exchanger;

public class Balance extends AbstractModel {

	private Integer debit;
	private Integer credit;
	private RegistryOperations numberRegistry;

	public RegistryOperations getNumberRegistry() {
		return numberRegistry;
	}

	public void setNumberRegistry(RegistryOperations numberRegistry) {
		this.numberRegistry = numberRegistry;
	}

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

}
