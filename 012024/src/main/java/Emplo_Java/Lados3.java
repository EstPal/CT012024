package Emplo_Java;

public class Lados3 {

	public static void main(String[] args) {
		
		Triangulo t1 = new Triangulo();
		
		t1.base = 4.0;
		t1.altura = 4.0;
		t1.estilo = "Estilo 1";
		
		System.out.println ("información para t1: ");
		t1.mostrarEstilo();
		t1.mostrarDimensions();
		System.out.println("sua area es: " +t1.area());
		System.out.println();
		
		Triangulo t2 = new Triangulo();
		
		t2.base= 8.0;
		t2.altura = 12.0;
		t2.estilo = "Estilo 2";
		
		System.out.println("información para t2:" );
		t2.mostrarEstilo();
		t2.mostrarDimensions();
		System.out.println("sua area es: " + t2.area());
	}

}
