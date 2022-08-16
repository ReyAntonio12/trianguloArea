package Poligon;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static ArrayList<Poligono> poligono = new ArrayList <Poligono>();
	static Scanner entrada = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		// Fill the polygon
		llenarPoligono();
		
		
		//Show data and area of each polygon
		
		mostrarResultados();

	}
	public static void llenarPoligono () {
		
		int opcion;
		char respuesta;
		
		do {
			 
			
			do {

				System.out.println("Digite el poligono que desea: \n");
				System.out.println("1. Triangulo \n");
				System.out.println("2. Rectangulo\n");
				System.out.println("Opcion: ");
				opcion = entrada.nextInt();
				
			}while(opcion<1 || opcion>2);
				
			
			switch (opcion)
			{
			case 1: llenarTriangulo();
				break;
			case 2: llenarRectangulo();
				break;
				
			}
			
			System.out.println("¿Desea introducir otro poligono? (S/N)\n");
			respuesta = entrada.nextLine().charAt(0);
			System.out.println("");
			
			
		}while(respuesta == 's' || respuesta == 'S');
		
	}
	
	public static void llenarTriangulo () {
		double lado1, lado2, lado3;
		
		System.out.println("Digite el lado 1 del triangulo: ");
		lado1 = entrada.nextDouble();
		System.out.println("\n Digite el lado 2 del triangulo: ");
		lado2 = entrada.nextDouble();
		System.out.println("\n Digite el lado 3 del triangulo: ");
		lado3 = entrada.nextDouble();
		
		Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
		
		//Saving a triangle inside the arraylist of polygons 
		poligono.add(triangulo);
		
		}
	
	public static void llenarRectangulo()
	{
		double lado1, lado2;
		
		System.out.println("Digite el lado 1 del rectangulo: ");
		lado1 = entrada.nextDouble();
		System.out.println("\n Digite el lado 2 del rectangulo: ");
		lado2 = entrada.nextDouble();
		
		Rectangulo rectangulo = new Rectangulo(lado1, lado2);
		
		//Saving a rectangle inside the arraylist of polygons 
		poligono.add(rectangulo);
		
	}
	
	public static void mostrarResultados()
	{
		//Going through the Array Polygon
		
		for (Poligono poli: poligono)
		{
			System.out.println(poli.toString());
			System.out.println("Area: "+poli.area());
			System.out.println("");
		}
	}

}
