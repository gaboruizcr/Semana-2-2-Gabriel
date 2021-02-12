package com.ucreativa;
/**
 * @author gruiz
 *
 */
public class Telefono {
	private String marca;
	private String modelo;
	private int a�o;
	
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

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public Telefono(String marca, String modelo, int a�o) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.a�o = a�o;
	}
	
	public String toString() {
	return "Telefono es marca = " + marca + ", modelo = " + modelo + ", a�o en que se creo = " + a�o;
	}



}
