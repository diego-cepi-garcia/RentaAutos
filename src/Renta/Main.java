package Renta;

import Renta.*;

public class Main{
	public static void main(String[] args) {
	Vehiculos vehiculos = new Vehiculos();
	Todoterreno todoterreno = new Todoterreno();
	Compacto compacto = new Compacto();
	SUV suv = new SUV();
	Sedan sedan = new Sedan();
	
	suv.setColor("Gris");
	suv.setEstado("Disponible");
	suv.setMarca("Toyota");
	suv.setModelo("RAV4");
	suv.setTransmision("Manual");
	suv.setPatente("AB123CD");
	
	//vehiculos.alquilarVehiculo();
	suv.alquilarVehiculo();
	}
}