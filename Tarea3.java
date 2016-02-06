import java.util.Scanner;

public class Tarea3
{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		boolean continuar;

		do {
		System.out.print("Ingrese el primer valor: ");
		int valor1 = teclado.nextInt();
		System.out.print("Ingrese el segundo valor: ");
		int valor2 = teclado.nextInt();
		System.out.println("------------------------------");

		System.out.println("Seleccione su opcion: ");
		System.out.println("1 = Sumar");
		System.out.println("2 = Restar");
		System.out.println("3 = Multimplicar");
		System.out.println("4 = Dividir");
		System.out.println("5 = Salir");
		System.out.println("6 = Cambiar los valores");

		int menu = teclado.nextInt();
		System.out.print("Resultado = ");

		switch (menu){
				case 1 : System.out.println (valor1 + valor2);
				break;
				case 2 : System.out.println (valor1 - valor2);
				break;
				case 3 : System.out.println (valor1 * valor2);
				break;
				case 4 : System.out.println (valor1 / valor2);
				break;
				case 5 : return;
				//break;
				case 6 : do {
						System.out.print("Ingrese el primer valor: ");
						valor1 = teclado.nextInt();
						System.out.print("Ingrese el segundo valor: ");
						valor2 = teclado.nextInt();
						System.out.println("------------------------------");

						System.out.println("Seleccione su opcion: ");
						System.out.println("1 = Sumar");
						System.out.println("2 = Restar");
						System.out.println("3 = Multimplicar");
						System.out.println("4 = Dividir");
						System.out.println("5 = Salir");
						System.out.println("6 = Cambiar los valores");

						menu = teclado.nextInt();
						System.out.print("Resultado = ");

						switch (menu){
								case 1 : System.out.println (valor1 + valor2);
								break;
								case 2 : System.out.println (valor1 - valor2);
								break;
								case 3 : System.out.println (valor1 * valor2);
								break;
								case 4 : System.out.println (valor1 / valor2);
								break;
								case 5 : return;
								//break;
								case 6 : continuar = false; 
								break;
								default: 
								break;
								}	

							System.out.println("------------------------------");
							System.out.print("Quiere cambiar los valores? Y/N: ");

							char continuarChar = teclado.next().charAt(0);
							continuar = false;

							if ( continuarChar == 'y' || continuarChar == 'Y'){
								continuar = true;
							}
						}
						while (continuar);
				break; 
				default: 
				break;
				}

			System.out.println("------------------------------");
			System.out.print("Intentar de nuevo? Y/N: ");

			char continuarChar = teclado.next().charAt(0);
			continuar = false;

			if ( continuarChar == 'y' || continuarChar == 'Y'){
				continuar = true;
			}
		}
		while (continuar);
			
		
		
	}
}