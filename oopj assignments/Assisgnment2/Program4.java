
class ElectricityBill{

private String customerName;
private double unitsConsumed;
private double billAmount;

public ElectricityBill(String customerName,double unitsConsumed){
this.customerName=customerName;
this.unitsConsumed=unitsConsumed;

}


public void setCustomerName(String customerName){
    this.customerName=customerName;
}

public  String getCustomerName(){
    return this.customerName;
}

public void setUnitsConsumed(double unitsConsumed){
    this.unitsConsumed=unitsConsumed;
}

public  double getUnitsCunsumed(){
    return this.unitsConsumed;
}

public double getBillAmount() {
        return billAmount;
    }

/**a. For the first 100 units: Rs. 5 per unit
b. For the next 200 units: Rs. 7 per unit
c. For the remaining units: Rs. 10 per uni */
public void calculateBillAmount(){
if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 5;
        } else if (unitsConsumed <= 300) {
            billAmount = 100 * 5 + (unitsConsumed - 100) * 7;
        } else {
            billAmount = 100 * 5 + 200 * 7 + (unitsConsumed - 300) * 10;
        }
    }

}



class Program4 {
    public static void main(String[] args){
   
    ElectricityBill e1 = new ElectricityBill("Sammed patil", 250.10);
    e1.calculateBillAmount();
    System.out.println("Customer Name : "+e1.getCustomerName());
    System.out.println("Units Consumed : "+e1.getUnitsCunsumed());
    System.out.println("Bill Amount : "+e1.getBillAmount());

    }
}