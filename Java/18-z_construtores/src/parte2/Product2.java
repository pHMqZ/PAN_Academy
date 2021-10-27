package parte2;

public class Product2 {
	public String name;
	public double price;
	public int quantity;
	
	//Construtores devem obrigatoriamente ter o nome da classe
	public Product2 (String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity= quantity;
	}
	
	//Metodo to String que organiza o codigo, não precisa ser invocado
	public String toString() {
		return name + ", $ " + price + ", " + quantity;
	}

}
