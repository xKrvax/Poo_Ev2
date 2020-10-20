package cl.inacap.Evaluacion2.campeonato;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Start {
	static Scanner sc = new Scanner(System.in);
	static Eventos ArrEvento[] = new Eventos[30];
	static Equipos ArrEquipo[] = new Equipos[30];
	static int indiceServicio = 0;
	static int indiceServicio2 = 0;
	
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
		String[] nombreEquipo = new String[32]; 
		int totalEquipo = 0 ;
		int ronda = 0;
		int plantelEquipo = 0;
		int cantEquipos = 0;
		String codEquipo;
		String descEvento;
		sc.nextLine();
		
		System.out.println("Ingrese el Nombre del Evento");
		System.out.println("Ingrese el Codigo del Evento");
		System.out.println("Ingrese la Descripcion del Evento");
		System.out.println("Ingresar la definicion del deporte o actividad del evento: ");
		String codEvento = sc.nextLine();

		System.out.println("Ingresar el nombre del evento:");
		String nombreEvento = sc.nextLine();

		boolean cosa = false;
		while (!cosa) {
			System.out.println("Ingresar la cantidad de equipos:");
			cantEquipos = sc.nextInt();
			sc.nextLine();
			ronda = (cantEquipos / 4);
			if ((cantEquipos % 2) == 0) {
				if ((ronda % 2) == 0 || cantEquipos == 4) {
					cosa = true;
				} else {
					System.out.println("El numero que ingrese debe ser par y multiplo de 4");
				}
			} else {
				System.out.println("El numero que ingrese debe ser par y multiplo de 4");
			}
		}

		int contador = cantEquipos;
		for (int i = 1; i <= contador; i++) {
			System.out.println("Ingresar el nombre del equipo " + i + ":");
			nombreEquipo[i] = sc.nextLine();
			
		}
		
		int max = cantEquipos;
		int min = 0;
		int range = max - min + 1;
		int rand = (int) (Math.random() * range) + min;
		int rand2 = (int) (Math.random() * range) + min;

		int max2 = 7;
		int min2 = 0;
		int range2 = max2 - min + 1;
		int rand3 = (int) (Math.random() * range) + min;
		int rand4 = (int) (Math.random() * range) + min;

		for (int i = 1; i <= (contador / 2); i++) {
			boolean cosa456 = false;
			while (!cosa456) {
				rand = (int) (Math.random() * range) + min;
				rand2 = (int) (Math.random() * range) + min;
				if (rand != rand2) {
					System.out.println("El enfrentamiento " + i + " sera entre " + nombreEquipo[rand] + " vs "
							+ nombreEquipo[rand2]);
					rand3 = (int) (Math.random() * range2) + min2;
					rand4 = (int) (Math.random() * range2) + min2;
					if (rand3 > rand4) {
						System.out.println("el ganador es " + nombreEquipo[rand]);
					} else {
						System.out.println("el ganador es " + nombreEquipo[rand2]);
					}
					cosa456 = true;
				}
			}
		}

		boolean cosa2 = false;
		while (!cosa2) {
			try {
				System.out.println("Ingresar la cantidad de personas que conforman el equipo:");
				plantelEquipo = sc.nextInt();
				sc.nextLine();
				cosa2 = true;

			} catch (InputMismatchException e) {
				System.out.println("Esta opcion debe ser un numero");
				sc.next();
			}
		}
		// Llamada a constructor, parametrizando el objeto nuevo
		Eventos s = new Eventos(codEvento, nombreEvento, cantEquipos);
		ArrEvento[indiceServicio] = s; // Agregar Objeo a Arreglo
		indiceServicio++; // Aumento de variable statica para indicar indice de arreglo

		
		Equipos b = new Equipos (codEquipo, nombreEquipo, plantelEquipo);
		ArrEquipo[indiceServicio2] = b; // Agregar Objeo a Arreglo
		indiceServicio2++; // Aumento de variable statica para indicar indice de arreglo

	}
	public static void verEventos() {
		
	}
}
