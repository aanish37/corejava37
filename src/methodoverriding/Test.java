package methodoverriding;

public class Test {
	public static void main(String[] args) {
		// static or early binding of object
		PrabhuBank pb = new PrabhuBank();
		pb.getBankName();
		pb.getInterestRate();
		
	    // up-Ban 
	    CentralBank bank  = new AnishBank();
	    printBankInfo(bank);
		}
	// late or dyanamic binding of object 
	// run time polymorphsism
	static void printBankInfo(CentralBank b) {
		
		b.getBankName();
		b.getInterestRate();
	}
   
}
