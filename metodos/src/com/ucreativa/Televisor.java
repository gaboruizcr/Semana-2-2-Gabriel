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
	private int tama�o;
	private String tipo;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getTama�o() {
		return tama�o;
	}
	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
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

	public Televisor(String marca, int tama�o, String tipo) {
		this.marca = marca;
		this.tama�o = tama�o;
		this.tipo = tipo;
	}
	
	public String toString() {
	return "Televisor marca = " + marca + ", tama�o = " + tama�o + ", tipo = " + tipo;
	}
}
