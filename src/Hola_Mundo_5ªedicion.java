import java.util.Scanner;

public class Hola_Mundo_5ªedicion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dime tu nombre --> ");
		String nombre = entrada.nextLine();
		
		System.out.println("Buenos dias " + nombre);
		
		entrada.close();

	}
}
