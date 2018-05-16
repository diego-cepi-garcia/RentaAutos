package Renta;

public class Cliente {
	private String nombre;
	private String email;
	private String gerente;
	private String pais;
	private String registro;
	
	public Cliente (String nombre, String email, String gerente, String pais, String registro) {
		this.nombre = nombre;
		this.email = email;
		this.gerente = gerente;
		this.pais = pais;
		this.registro = registro;
		}
	
	public Cliente() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGerente() {
		return gerente;
	}

	public void setGerente(String gerente) {
		this.gerente = gerente;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	
}