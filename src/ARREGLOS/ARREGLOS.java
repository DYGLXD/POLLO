package ARREGLOS;

import java.util.Scanner;

public class ARREGLOS {
	public static void main(String[] ars) {
		Scanner in = new Scanner(System.in);
		int op = 1;
		do {
			System.out.println("menu de arrays ");

			System.out.println("1. array lineal ");

			System.out.println("2. tamaño rellenar e imprimir ");

			System.out.println("3 metodo burbuja");

			System.out.println();

			System.out.println();
			op = in.nextInt();
			switch (op) {
			case 1:

				System.out.println("array lineal ");
				int numeros[] = { 1, 2, 3, 4, 5, 6, 7, 4, 5, 8, 4, 65 };
				System.out.println("tamaño de array " + numeros.length);
				for (int x = 0; x < numeros.length; x++) {

					System.out.println("numero[" + x + "]=" + numeros.length);

				}
				break;
			case 2:
				System.out.println("tamaño rellena e imprime  ");
				System.out.println("tamaño ");
				int tam=in.nextInt();
				int array1[] = new int [tam];
				for (int x = 0; x < array1.length; x++) {

					array1[x]=in.nextInt();

				}
				for (int x = 0; x < array1.length; x++) {

					System.out.println(array1[x]+" ");
				}
				break;

			default:

				System.out.println("no valido ");

				break;
			}
		} while (op != 0);

	}
}
