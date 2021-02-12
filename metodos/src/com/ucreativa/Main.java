/**
 * 
 */
package com.ucreativa;

/**
 * @author gruiz
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Televisor tele1 = new Televisor("Samsung", 50, "4k");
		
		System.out.println("Instancia 1");
		System.out.println(tele1.toString());
		
		
		Telefono telefono1 = new Telefono("Xiaomi", "Mi Note 10", 2019);
		
		System.out.println("Instancia 2");
		System.out.println(telefono1.toString());
		
		
		
		Computadora compu1 = new Computadora("lenovo", "laptop", 4);
		
		System.out.println("Instancia 3");
		System.out.println(compu1.toString());
		
		
		
		Lavadora lavadora1 = new Lavadora("Samsung", "si", 10);
		
		System.out.println("Instancia 4");
		System.out.println(lavadora1.toString());
		
		
		
		Impresora Impresora1 = new Impresora("Canon", "color", "laser");
		
		System.out.println("Instancia 5");
		System.out.println(Impresora1.toString());

	}

}
