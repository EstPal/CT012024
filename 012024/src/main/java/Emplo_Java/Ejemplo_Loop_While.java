package Emplo_Java;

public class Ejemplo_Loop_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		
		while (a <= 10) { // va salir del ciclo cuando la variable sea mayor de 10
			System.out.println("El valor de A: " + a);
			a++; // incrementa el valor de la variable para la siguiente iteracion
			// si no se pone este incremneto, el valor de la variable siempre sera uno y se quedará en un ciclo infinito
		}
		
		
	}

}
