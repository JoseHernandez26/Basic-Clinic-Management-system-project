package Model;
import java.util.LinkedList;

public class Billing {
private double totalAmount;	// the total amount of payment
// adding  medicament
	 // list of medicaments 
//defaul constructor
public Billing () {}
//constructor with parameters
public Billing(double totalAmount) {
	
	this.totalAmount = totalAmount;
	

}

//getters and setters
public double getTotalAmount() {
	return totalAmount;
}
//the total amount to pay


public void setTotalAmount(double totalAmount) {
	this.totalAmount = totalAmount;
}


			
}






