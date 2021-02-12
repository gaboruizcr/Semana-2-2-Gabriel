/**
 * 
 */
package com.ucreativa;

/**
 * @author gruiz
 *
 */
public class Impresora {
	private String marca;
	private String tinta;
	private String tipo;
	/**
	 * 
	 */
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTinta() {
		return tinta;
	}
	public void setTinta(String tinta) {
		this.tinta = tinta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Impresora(String marca, String tinta, String tipo) {
		super();
		this.marca = marca;
		this.tinta = tinta;
		this.tipo = tipo;
	}
	
	public String toString() {
	return "Computadora es marca = " + marca + ", tinta = " + tinta + ", tipo = " + tipo;
	}

}
