
class TelephoneBill {

	private String customerName;
	private long phoneNumber;
	private int numberOfCalls;
	private int durationOfCalls;

	public TelephoneBill(String customerName, long phoneNumber, int numberOfCalls, int durationOfCalls) {
		super();
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.numberOfCalls = numberOfCalls;
		this.durationOfCalls = durationOfCalls;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getNumberOfCalls() {
		return numberOfCalls;
	}

	public void setNumberOfCalls(int numberOfCalls) {
		this.numberOfCalls = numberOfCalls;
	}

	public int getDurationOfCalls() {
		return durationOfCalls;
	}

	public void setDurationOfCalls(int durationOfCalls) {
		this.durationOfCalls = durationOfCalls;
	}

	public static void PhoneBill() {

	}

	public double CalculateBill() {
		int flatrate=10;
		double bill;
		if(numberOfCalls <=100){
            bill = 50*numberOfCalls + flatrate;
        }
        else{
            bill = 100*50 + (numberOfCalls-100)*25 + flatrate;
        }
        return bill;
		
	}

    }

public class Program5 {

	public static void main(String[] args) {
		TelephoneBill t1 = new TelephoneBill("sammed", 73878787, 10, 55);
	    double result = t1.CalculateBill();
		System.out.println(t1.getCustomerName());
		System.out.println(t1.getPhoneNumber());
		System.out.println(t1.getNumberOfCalls());
		System.out.println(t1.getDurationOfCalls());
        System.out.println("Phone bill is :"+result);
       
	}

}
