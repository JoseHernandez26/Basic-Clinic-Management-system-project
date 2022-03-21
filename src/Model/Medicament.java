package Model;

public class Medicament {
private String Name; // name of the medicament
private int QuantityMedicament;// Quantity of the medicament
private double Price; // price per unity
private String Description; // application of the medicament, details how to consume it
//contructor by default
public Medicament() {}
// parametrized constructor 
public Medicament(String name, int quantityMedicament, double price, String description) {

	Name = name;
	QuantityMedicament = quantityMedicament;
	Price = price;
	Description = description;
}

//Getters and setters
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getQuantityMedicament() {
	return QuantityMedicament;
}
public void setQuantityMedicament(int quantityMedicament) {
	QuantityMedicament = quantityMedicament;
}
public double getPrice() {
	return Price;
}
public void setPrice(double price) {
	Price = price;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}
@Override
public String toString() {
	return "\nMedicament [Name=" + Name + ", Quantity of the Medicament=" + QuantityMedicament + ", Price=" + Price
			+ ", Description=" + Description + "]";
}



}
