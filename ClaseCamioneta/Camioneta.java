package PooUru;

public class Camioneta {
	
	private int ancho, ruedas, largo, peso, capCarga, precio;
	private String color;
	private boolean asientosCuero, climatizador, esAutomatico, ruedaExtra;
	
	//Método constructor
	
	public Camioneta () {
		ancho = 200;
		largo = 500;
		ruedas = 4;
		peso = 4500;
		capCarga = 150;
		precio = 5000;
	}
	
	//Métodos setter y getter
	
	
	//Color
	public void estableceColor(String colorCamioneta) {
		color = colorCamioneta;
	}
	
	public String dimeColor() {
		return "El color de la camioneta es " + color;
	}
	
	
	//Asientos
	public void configuraAsientos(String asientosCuero) {
		if(asientosCuero.equalsIgnoreCase("si")) {
			this.asientosCuero = true;
		}
		else {
			this.asientosCuero = false;
		}
	}
	
	public String dimeAsientos() {
		if(asientosCuero) {
			return "La camioneta tiene asientos de cuero";
		}
		else {
			return "La camioneta NO tiene asientos de cuero";
		}
	}
	
	
	//Climatizador
	public void configuraClimatizador(String climatizador) {
		if(climatizador.equalsIgnoreCase("si")) {
			this.climatizador = true;
		}
		else{
			this.climatizador = false;
		}	
	}
	
	public String dimeClimatizador() {
		if(climatizador) {
			return "La camioneta tiene climatizador";
		}
		else {
			return "La camioneta NO tiene climatizador";
		}
	}
	
	
	//Rueda extra
	public void configuraRueda(String ruedaExtra) {
		if(ruedaExtra.equalsIgnoreCase("si")) {
			this.ruedaExtra = true;
			ruedas = 5;
		}
		else {
			this.ruedaExtra = false;
		}
	}
	
	public String dimeRuedaExtra() {
		if(ruedaExtra) {
			return "La camioneta tiene una rueda extra de mantenimiento";
		}
		else {
			return "La camioneta NO tiene rueda extra";
		}
	}
	
	
	//Traccion
	public void configuraTraccion(String esAutomatico) {
		if(esAutomatico.equalsIgnoreCase("si")) {
			this.esAutomatico = true;
		}
		else {
			this.esAutomatico = false;
		}
	}
	
	public String dimeTraccion() {
		if(esAutomatico) {
			return "La camioneta es automática";
		}
		else {
			return "La camioneta es sincrónica";
		}
	}
	
	
	//Precio
	public int precioCamioneta() {
		
		if(asientosCuero) {
			precio += 500;
		}
		
		if(climatizador) {
			precio += 1000;
		}
		
		if(ruedaExtra) {
			precio += 200;
		}
		
		if(!esAutomatico) {
			precio += 500;
		}
		
		return precio;
	}
	
	public String dimeCaracteristicasGenerales() {
		return "La camioneta mide " + ancho/100 + "m de ancho y " + largo/100 + "m de largo" 
			 + "\nPesa " + peso + "kg"
			 + "\nTiene una capacidad de carga de " + capCarga + "kg"
			 + "\nTiene " + ruedas + " ruedas"
			 + "\n" + dimeRuedaExtra()
			 + "\n" + dimeColor()
			 + "\n" + dimeAsientos()
			 + "\n" + dimeClimatizador()
			 + "\n" + dimeTraccion()
			 + "\nY por último, tiene un precio de " + precioCamioneta();
	}
}
