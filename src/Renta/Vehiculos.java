package Renta;

public class Vehiculos {
	private String marca;
	private String modelo;
	private String color;
	private String transmision;
	private String estado;
	private String patente;
	
	public Vehiculos (String marca, String modelo, String color, String transmision, String estado, String patente) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.transmision = transmision;
		this.estado = estado;
		this.patente = patente;
		
	}
	
	
	
	public void alquilarVehiculo() {
		System.out.println(String.format("Marca: %s", marca));
		System.out.println(String.format("Modelo: %s", modelo));
		System.out.println(String.format("Color: %s", color));
		System.out.println(String.format("Transmision: %s", transmision));
		System.out.println(String.format("Estado: %s", estado));
		System.out.println(String.format("Patente: %s", patente));
	}
	
	public Vehiculos() {
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTransmision() {
		return transmision;
	}

	public void setTransmision(String transmision) {
		this.transmision = transmision;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}
	
//*	public String tipoalquilerVehiculos(String t) {
		if (t.equals("SUV")){
			
		}
		
	}
}




