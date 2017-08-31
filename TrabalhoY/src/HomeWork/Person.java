package HomeWork;

import javax.swing.JOptionPane;

public class Person{

	private String name;
	private String product;
	private double value;
	private String nameJ;
	private String productJ;
	private double valueJ;
	private String menssage;
	private String menssageJ;
	public String PersonF(){
				
			 name = JOptionPane.showInputDialog("Digite seu nome completo");
			 product = JOptionPane.showInputDialog("Digite o nome do protudo");
			 value = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do protudo"));
			 
		return menssage;
		
		
	}
	
	public String PersonJ(){
		 nameJ = JOptionPane.showInputDialog("Digite o nome da sua empresa");
		 productJ = JOptionPane.showInputDialog("Digite o nome do protudo");
		 valueJ = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do protudo"));
		 return menssageJ;
	}
	
	public String getName(){
		return this.name;
	}
	public double getValue(){
		return this.value;
	}
	public String getProd(){
		return this.product;
	}
	public String getNameJ(){
		return this.nameJ;
	}
	public double getValueJ(){
		return this.valueJ;
	}
	public String getProdJ(){
		return this.productJ;
	}
}

