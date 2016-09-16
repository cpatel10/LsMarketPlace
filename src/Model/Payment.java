package Model;

public class Payment {
	// inherited by Debit, Credit and Paypal
	
	// attributes
	private int paymentID;
	
	// getters and setters
	public int getPaymentID() {
		return paymentID;
	}
	
	public void setPaymentID(int paymentID) {
		this.paymentID = paymentID;
	}
	
	
}
