import java.util.Scanner;

public class Areas {

	public static void main(String[] args) {
		
		System.out.println("Elige una opcion:");
		System.out.println("1 - Cálculo del área de un rectángulo");
		System.out.println("2 - Cálculo del área de un circulo");
		System.out.println("3 - Cálculo del área de un triangulo");
		
		float altura;
		float base;
		float numeroPi = 3.14f;
		float radio;
		
		int opcion;
		
		boolean correcto = false;
		
		Scanner sc = new Scanner(System.in);
		opcion = sc.nextInt();
		
		while (correcto == false) {
		
		switch (opcion) {
		
		case 1:
			correcto = true;
			System.out.println("Has elegido calcular el área de un rectángulo");
			System.out.println("Introduce el valor de la altura: ");
			altura = sc.nextFloat();
			System.out.println("Introduce el valor de la base: ");
			base = sc.nextFloat();
			System.out.println("El área del rectángulo es: " + (altura*base));
			break;
		
		case 2:
			correcto = true;
			System.out.println("Has elegido calcular el área de un círculo");
			System.out.println("Introduce el valor del radio: ");
			radio = sc.nextFloat();
			System.out.println("El área del círculo es: " + (numeroPi*(radio*radio)));
			break;
		
		case 3: 
			correcto = true;
			System.out.println("Has elegido calcular el área de un triángulo");
			System.out.println("Introduce el valor de la altura: ");
			altura = sc.nextFloat();
			System.out.println("Introduce el valor de la base: ");
			base = sc.nextFloat();
			System.out.println("El área del triángulo es: " + (altura*base)/2);
			break;
		default:
			correcto = false;
			System.err.println("Opción no válida");
			System.out.println("Elige una opcion:");
			System.out.println("1 - Cálculo del área de un rectángulo");
			System.out.println("2 - Cálculo del área de un circulo");
			System.out.println("3 - Cálculo del área de un triangulo");
			opcion = sc.nextInt();
	} }sc.close(); 
}

}
