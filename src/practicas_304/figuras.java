package practicas_304;
import java.util.Scanner;
public class figuras {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("1: IF SIMPLE");
		System.out.println("2: IF DOBLE");
		System.out.println("3: IF ANIDADO");
		System.out.println("4 : IMC ");
		System.out.println("5 CARRERA  ");
		System.out.println("6 IMPRIME DE UNO A N");
		System.out.println("7 IMPRIME DE N A M ");
		System.out.println("8 PREGUNTAR POR N NUMEROS Y IMPRIMIR SUMA Y PROMEDIO ");
		System.out.println("9 LA MISMA QUE LA 7 CON WHILE ");
		System.out.println("10 LO MISMO QU LA 8 CON DO WHILE ");
		int op = tec.nextInt();
		switch (op) {
		case 1:
			System.out.println("1: IF SIMPLE");
			int calificacion = tec.nextInt();
			if (calificacion <= 5) {
				System.out.println("Reprobado");
			}
			break;
		case 2:
			System.out.println("2: IF DOBLE");
			int edad = tec.nextInt();
			if (edad < 18) {
				System.out.println("menor de edad");
			} else {
				System.out.println("mayor de edad");
			}
			break;
		case 3:
			System.out.println("3: IF ANIDADO");
			int a = tec.nextInt();
			int b = tec.nextInt();
			int c = tec.nextInt();
			if (a > b && a > c) {
				if (a > c) {
					System.out.println(a + "," + b + "," + c);
				} else {
					System.out.println(a + "," + c + "," + b);

				}
			} else if (b > a && b > c) {
				if (a > c) {
					System.out.println(b + "," + a + "," + c);
				} else {
					System.out.println(b + "," + c + "," + a);
				}
			} else {
				if (a > b) {
					System.out.println(c + "," + a + "," + b);
				} else {
					System.out.println(c + "," + b + "," + a);
				}
			}

			break;
		case 4:
        	System.out.println("peso ");
			int p = tec.nextInt();
        	System.out.println("altura ");
			double h = tec.nextDouble();
			double r = (p / (Math.pow(h, 2)));
			System.out.println(r);
			// x+=m
            if (r<=18.5) {
            	System.out.println("delgado");
            }else if (r<=24.9) {
            	System.out.println("aceptable");
            }else if (r<=29.9) {
            	System.out.println("sobre peso ");
            }else if (r<=34.9) {
            	System.out.println("obesidad 1");
            }else if (r<=39.9) {
            	System.out.println("obsidad 2");
            }else {
            	System.out.println("obsidad 3 (mario y malvado )");
            }
			break;
		case 5:
			
			String opcion = tec.next();
			switch (opcion) {
			case "Ventas":
				System.out.println("301 ");
				System.out.println("302 ");
				break;
			case "Programacion":
				System.out.println("303 ");
				System.out.println("304 ");
				System.out.println("305 ");
				break;
			case "Maquinas":
				System.out.println("306 ");
				System.out.println("307 ");
				break;
			}
			break;
		case 6:
			System.out.println("valor inicial ");
			int n = tec.nextInt();
			for (int x = 1; x <= n; x++) {
				System.out.println(n);
			}
			break;
		case 7:
			System.out.println("valor inicial ");
			n = tec.nextInt();
			System.out.println("valor final ");
			int m = tec.nextInt();
			System.out.println("aumento");
			int au = tec.nextInt();
			for (int x = n; x <= m; x += au) {
				System.out.println(x);
			}
			break;
		case 8:
			int con = 0;
			int to;
			n = tec.nextInt();
			for (int x = 0; x < n; x++) {
				to = tec.nextInt();
				con += to;

			}
			int res = con / n;
			System.out.println(con + "\n" + res);
			break;
		case 9:
			n=tec.nextInt();
			int x =1;
			while(x!=n) {
				System.out.println(x);
			x++;
			}
			System.out.println(x);
			break;
		case 10:
			n=tec.nextInt();
			x =1;
			do {
				System.out.println(x);
			x++;
			}while(x!=n);
			System.out.println(x);
			break;
		}

	}

}