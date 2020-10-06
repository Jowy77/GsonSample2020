package dad.gson.javafx;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Persona persona = new Persona();
		String nombre = "", apellidos = "";
		Integer edad = 0;
		
		boolean datosCorrectos = false;
		while(!datosCorrectos) {
			try {
				
				System.out.print("Escribe tu nombre: ");
				nombre = scanner.nextLine();
				
				System.out.print("\nEscribe tus apellidos: ");
				apellidos = scanner.nextLine();
				
				System.out.print("\nEscribe tu edad: ");
				edad = scanner.nextInt();
				
				datosCorrectos=true;
				
			} catch (InputMismatchException e) {
				System.out.println("ALGUN DATO ES INCORRECTO!!!\n");
				datosCorrectos = false;
				scanner.nextLine();
			}
		
		}
		
		scanner.close();
		
		persona = new Persona(nombre, apellidos, edad);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(persona);
		System.out.println("\n"+json);
	}

}
