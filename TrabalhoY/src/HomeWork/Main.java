package HomeWork;

import javax.swing.JOptionPane;

public class Main extends Person {

	
		public static void main(String[] args) {
		// TODO Auto-generated constructor stub
			Person person = new Person();
			
			
			JOptionPane.showMessageDialog(null," 1 -> Pessoa fisica \n 2 -> Pessoa juridica");
			int personTipe = Integer.parseInt(JOptionPane.showInputDialog("Pessoa fisica ou juridica?"));	
			if (personTipe == 1){
				
			person.PersonF();
			
			JOptionPane.showMessageDialog(null," 1 -> Parcelado \n 2 -> A vista");
			int choise = Integer.parseInt(JOptionPane.showInputDialog("Parcelado ou A vista?"));
			if(choise == 2){
				double discont = person.getValue() - (person.getValue() * 0.05);
				JOptionPane.showMessageDialog(null,person.getName()+" esta comprando um(a) "+person.getProd()+" no valor de "+person.getValue()+" . O valor final do(a) "+person.getProd()+" sera: "+discont);
			}else{
				int amont = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de parcelas"));
				double addition = amont * 3.00;
				double res = addition + person.getValue();
				JOptionPane.showMessageDialog(null,person.getName()+" esta comprando um(a) "+person.getProd()+" no valor de "+person.getValue()+" . O valor final do(a) "+person.getProd()+" sera: "+res);
			}	
				}else{
					
				person.PersonJ();
				
				JOptionPane.showMessageDialog(null," 1 -> Parcelado \n 2 -> A vista");
				int choise = Integer.parseInt(JOptionPane.showInputDialog("Parcelado ou A vista?"));
				
				if(choise == 2){
					double discont = person.getValueJ() - (person.getValueJ() * 0.1);
					JOptionPane.showMessageDialog(null,person.getNameJ()+" esta comprando um(a) "+person.getProdJ()+" no valor de "+person.getValueJ()+" . O valor final do(a) "+person.getProdJ()+" sera: "+discont);
				}else{
					int amont = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de parcelas"));
					double addition = amont * 5.00;
					double res = addition + person.getValueJ();
					JOptionPane.showMessageDialog(null,person.getNameJ()+" esta comprando um(a) "+person.getProdJ()+" no valor de "+person.getValueJ()+" . O valor final do(a) "+person.getProdJ()+" sera: "+res);
				}
			}
	  }
}

