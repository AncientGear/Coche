package Coche;

public class Coche {
	String marca;
	String color;
	int km;
	
	public static void main(String[] args){
		Coche coche1 = new Coche();
		
		coche1.marca = "Ferrari";
		coche1.color = "Rojo";
		coche1.km = 0;
		
		Coche coche2 = new Coche();
		
		coche2.marca = "Audi";
		coche2.color = "Plateado";
		coche2.km = 120;
		
		System.out.println("Datos coche 1: ");
		System.out.println("Marca: " + coche1.marca);
		System.out.println("Color: " + coche1.color);
		System.out.println("Km: " + coche1.km);
		
		System.out.println("\n\nDatos coche 2: ");
		System.out.println("Marca: " + coche2.marca);
		System.out.println("Color: " + coche2.color);
		System.out.println("Km: " + coche2.km);
	}
}
