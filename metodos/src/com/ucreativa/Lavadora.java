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
	private int tama�o;
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
	public int getTama�o() {
		return tama�o;
	}
	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}

	public Lavadora(String marca, String seca, int tama�o) {
		super();
		this.marca = marca;
		this.seca = seca;
		this.tama�o = tama�o;
	}
	public String toString() {
	return "Lavadora es marca = " + marca + ", seca? = " + seca + ", tama�o = " + tama�o + " kilos";
	}

}
