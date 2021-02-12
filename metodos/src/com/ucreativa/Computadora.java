/**
 * 
 */
package com.ucreativa;

/**
 * @author gruiz
 *
 */
public class Computadora {
	private String marca;
	private String tipo;
	private int ram;	
	/**
	 * 
	 */
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}


	public Computadora(String marca, String tipo, int ram) {
		this.marca = marca;
		this.tipo = tipo;
		this.ram = ram;
	}

	public String toString() {
	return "Computadora es marca = " + marca + ", tipo = " + tipo + ", ram = " + ram;
	}
	

}
