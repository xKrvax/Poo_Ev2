package cl.inacap.Evaluacion2.campeonato;

import java.util.Scanner;

public class Start {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		while(menu());
	}
	public static boolean menu() {
		boolean continuar = true;
		System.out.println("Que quiere hacer?:");
		System.out.println("1.- Crear Evento");
		System.out.println("2.- Informe de Eventos");
		System.out.println("0.- Cerrar");
		switch(sc.nextLine().trim()) {
		case "1": ingresarEvento();
		break;
		case "2": verEventos();
		break;
		case "0": continuar = false;
		System.out.println("Sistema Cerrado");
		break;
		}
		return continuar;
	}
	public static void ingresarEvento() {
		int totalEquipo = 0 ;
		int ronda = 0;
		int plantelTotal;
		String nombreEquipo; 
		sc.nextLine();
		
		System.out.println("Ingrese el Nombre del Evento");
		System.out.println("Ingrese el Codigo del Evento");
		System.out.println("Ingrese la Descripcion del Evento");
		
		
	}
	public static void verEventos() {
		
	}
}
