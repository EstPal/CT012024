package Emplo_Java;

public class Ejemplo_Array_Bidimensional {

	public static void main(String[] args) {
		
		//Declaremos un arreglo en 2D
		int arr[][]= {{2,7,9},{3, 6, 1},{7,6,1}};
		
		//System.out.println(arr[0][0])
		
		//imprimir array 2d
		 for (int i=0; i <3; i++) {
			 for (int j = 0; j < 3; j ++) {
				 System.out.print(arr[i][j] + " ");// para imprimir en lla misma linea
			 }
			 System.out.println();
		 }

	}

}
