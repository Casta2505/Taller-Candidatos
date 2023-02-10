package co.edu.unbosque.model;

import java.io.Serializable;

public class CandidatoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String nombre;
	private String apellido;
	private long cedula;
	private int edad;
	private String cargo;
	
	public CandidatoDTO(String nombre, String apellido, long cedula, int edad, String cargo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.edad = edad;
		this.cargo = cargo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public long getCedula() {
		return cedula;
	}

	public void setCedula(long cedula) {
		this.cedula = cedula;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
}
