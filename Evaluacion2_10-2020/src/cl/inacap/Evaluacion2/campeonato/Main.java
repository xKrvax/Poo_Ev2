import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opcion;
		boolean salir = false;
		try{
		System.out.println("Ingrese una opci�n");
		System.out.println("1.- Crear Evento");
		System.out.println("2.- Imprimir Informe del evento");
		System.out.println("3.- Salir");
		opcion = sc.nextInt();
		switch(opcion) {
		case 1:
			System.out.println("Ingrese el Tipo de evento: " + evento);
			evento = in.nextLine();
			break;	
		case 2:
			System.out.println(" asdasd");
			break;
		case 3:
			System.out.println("Saliendo...");
			salir=true;	
			break;
		default: System.out.println("Ingrese una opcion valida intente nuevamente:");
		} 
		}
		catch(InputMismatchException e){
			System.out.println("Esta opci�n debe ser un n�mero");
			sc.next();
		}
		}	
	
		public static void IngresarServicio() {
		sc.nextLine();
		System.out.println("Ingresar Codigo de servicio");
		String CodServicio = sc.nextLine();
		System.out.println("Ingresar Nombre de servicio");
		String NombreServicio = sc.nextLine();

		System.out.println("Ingresar cantidad maxima de camas");
		int NumCamas = sc.nextInt();
		sc.nextLine();	
		}