package Emplo_Java;

public class DemoVehiculo {
	
	public static void main (String[]args) {
		
		Vehiculo minivan = new Vehiculo ();
		
		int rango;
		//Asignar los valores  a los campos de minivan
		
		minivan.pasajeros = 9;
		minivan.capacidad = 15;
		minivan.kmh = 20;
		
		//Calcular un rango asumiendo un tanque lleno
		
		rango = minivan.capacidad * minivan.kmh;
		System.out.println("LA minivan puede llevar" + minivan.pasajeros + "pasajeros con unrango de " + rango + "Kilometros");
	
	
		Vehiculo carro = new Vehiculo();
		carro.pasajeros = 4;
		System.out.println("Numero de pasajeros en el carro es:" + carro.pasajeros);
	
	
	}

}
