package methodoverriding;

public class AnishBank extends CentralBank {
	@Override
	void getBankName() {
		System.out.println("Anish Bank");
	}
	 @Override
	void getInterestRate() {
		 System.out.println("15%");
	}

}
