package Emplo_Java;

public class Ejemplo_Array_Unidimensional {

	public static void main(String[] args) {
		
		//Ejemplo de declaracion de arreglos
		//int intArray[];
		//int [] intarray2;
		//double [] doublearrray[];
		
		//declara un arreglo de string
		
		String[] arr;
		arr = new String[5];
		
		//Asignar memoria para 5 string
		arr[0] = "cero";
		arr[1] = "uno";
		arr[2] = "dos";
		arr[3] = "tres";
		arr[4] = "cuatro";
	
		System.out.println("Las posiciones del arreglo es: " + arr[4]);
		System.out.println();
		
		for (int i = 0; i < arr.length; i ++) { 
			System.out.println("Elemento en el indice " + i +":" + arr[i]);
		}
		
		//Ejemplo de arreglo de enteros
		
		int[] intArr = new int[] {1, 2, 3,4,5, 7};
		}
			
		
	}


