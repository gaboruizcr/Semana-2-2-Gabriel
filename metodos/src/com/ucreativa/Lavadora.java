/**
 * 
 */
package com.ucreativa;

/**
 * @author gruiz
 *
 */
public class Lavadora {
	private String marca;
	private String seca;
	private int tamaño;
	/**
	 * 
	 */
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getSeca() {
		return seca;
	}
	public void setSeca(String seca) {
		this.seca = seca;
	}
	public int getTamaño() {
		return tamaño;
	}
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public Lavadora(String marca, String seca, int tamaño) {
		super();
		this.marca = marca;
		this.seca = seca;
		this.tamaño = tamaño;
	}
	public String toString() {
	return "Lavadora es marca = " + marca + ", seca? = " + seca + ", tamaño = " + tamaño + " kilos";
	}

}
