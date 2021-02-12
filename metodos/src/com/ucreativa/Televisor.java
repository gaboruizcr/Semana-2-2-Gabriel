/**
 * 
 */
package com.ucreativa;

/**
 * @author gruiz
 *
 */
public class Televisor {
	private String marca;
	private int tamaño;
	private String tipo;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getTamaño() {
		return tamaño;
	}
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * 
	 */
	public Televisor() {
		// TODO Auto-generated constructor stub
	}

	public Televisor(String marca, int tamaño, String tipo) {
		this.marca = marca;
		this.tamaño = tamaño;
		this.tipo = tipo;
	}
	
	public String toString() {
	return "Televisor marca = " + marca + ", tamaño = " + tamaño + ", tipo = " + tipo;
	}
}
