package PooUru;

import javax.swing.JOptionPane;

public class UsoCoche {

	public static void main(String[] args) {
	
		Camioneta miCamioneta = new Camioneta();
		
		miCamioneta.estableceColor(JOptionPane.showInputDialog("Introduce el color: "));
		
		miCamioneta.configuraAsientos(JOptionPane.showInputDialog("La camioneta tiene asientos de cuero?"));
		
		miCamioneta.configuraClimatizador(JOptionPane.showInputDialog("La camioneta tiene climatizador?"));
		
		miCamioneta.configuraRueda(JOptionPane.showInputDialog("La camioneta tiene rueda extra?"));
		
		miCamioneta.configuraTraccion(JOptionPane.showInputDialog("La camioneta es de tracción automática?"));
		
		JOptionPane.showMessageDialog(null, miCamioneta.dimeCaracteristicasGenerales());

	}

}
