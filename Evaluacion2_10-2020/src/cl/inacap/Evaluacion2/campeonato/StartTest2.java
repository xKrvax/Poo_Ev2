package cl.inacap.Evaluacion2.campeonato;

import java.util.InputMismatchException;
import java.util.Scanner;
import cl.inacap.Evaluacion2.campeonato.Eventos;
import cl.inacap.Evaluacion2.campeonato.Equipos;

public class StartTest2 {
	static Scanner sc = new Scanner(System.in);
	static Eventos arrEvento[] = new Eventos[30];
	static Equipos arrEquipo[][] = new Equipos[30][22];
	
	public static void main(String[] args) {
		while(menu());
	}
	public static boolean menu() {
		boolean continuar = true;
		System.out.println("Que quiere hacer?:");
		System.out.println("1.- Crear Evento");
		System.out.println("2.- Eliminar Evento");
		System.out.println("3.- Informe de Eventos");
		System.out.println("0.- Cerrar");
		switch(sc.nextLine().trim()) {
		case "1": ingresarEvento();
		break;
		case "2": eliminarEvento();
		break;
		case "3": verEventos();
		break;
		case "0": continuar = false;
		System.out.println("Sistema Cerrado");
		break;
		}
		return continuar;
	}
	public static void ingresarEvento() {
		String nombreEvento;
		do {
			System.out.println("Ingrese el Nombre del Evento");
			nombreEvento =sc.nextLine().trim();
		}while(nombreEvento.isEmpty());
		//
		String codEvento;
		do {
			System.out.println("Ingrese el Codigo del Evento");
			codEvento =sc.nextLine().trim();
		}while(codEvento.isEmpty());
		//
		int cantEquipos=0;
		int verificadorPar=0;
		String cantEquiposStr;
		do {
			try{
				System.out.println("Ingrese la Cantidad de participantes del Equipo: ");
				cantEquiposStr=sc.nextLine().trim();
				cantEquipos=Integer.parseInt(cantEquiposStr);
				verificadorPar= (cantEquipos/4);
				if(verificadorPar%2!=0){
					System.out.println("La cantidad no es par");
					cantEquiposStr="";
				}
			}catch(Exception ex) {
				System.out.println("Debe ingresar numeros");
				cantEquiposStr="";
			}
		}while(cantEquiposStr.isEmpty());
		//
		Eventos evento = new Eventos(codEvento, nombreEvento, cantEquipos);
		int pos = 1;
		if(pos < 0 ) {
			System.out.println("no hay espacio");
		}else {
			arrEvento[pos] = evento;
		}
	}
	public static void ingresarEquipo() {
		System.out.println("Eventos existentes:");
		for (int i = 0; i < arrEvento.length; i++) {
			if (arrEvento[i] != null) {
				System.out.println(i + "-" + arrEvento[i]);
			}
		}
		try {
			System.out.println("¿Que Evento quiere?");
			int pos = Integer.parseInt(sc.nextLine().trim());
			Eventos seleccionado = arrEvento[pos];
			
			
			String codEquipo;
			do {
				System.out.println("Ingrese codigo del equipo: ");
				codEquipo = sc.nextLine().trim();
			}while(codEquipo.isEmpty());
			
			String nombreEquipo;
			do {
				System.out.println("Ingrese el Nombre del Equipo: ");
				nombreEquipo = sc.nextLine().trim();
			}while(nombreEquipo.length() !=4);
			
			int plantelEquipo =-1;
			do {
				System.out.println("Ingrese cantidad de canciones");
				try {
					plantelEquipo = Integer.parseInt(sc.nextLine().trim());
				}catch (Exception ex) {
					plantelEquipo = -1;
				}
			}while(plantelEquipo < 0);
			Equipos equipo = new Equipos(codEquipo, nombreEquipo, plantelEquipo);
			
		}catch(NumberFormatException ex) {//Convertir algo que no es un numero
			System.out.println("debe ingresar un numero");
		}catch(ArrayIndexOutOfBoundsException ex) {//ingresar a una posicion que no existe
			System.out.println("Ingrese una posicion Valida");
		}
	}
	

	public static void verEventos() {
		for (Eventos evento: arrEvento) {
			if (evento != null) {
				System.out.println(evento);
			}
		}
	}
	public static void verEquipos() {

		System.out.println("Eventos existentes :");
		for (int i = 0; i < arrEvento.length; i++) {
			if (arrEvento[i] != null) {
				System.out.println(i + "-" + arrEvento[i]);
			}
		}
		try {
			System.out.println("¿Que artista quiere mostrar?");
			int pos = Integer.parseInt(sc.nextLine().trim());
			Eventos seleccionado = arrEvento[pos];
			Equipos[] equiposDelEvento = seleccionado.getEquipo();
			for(Equipos equipo : equiposDelEvento) {
				if(equipo != null) {
					System.out.println(equipo);
				}
			}
		}catch(Exception ex) {
			System.out.println("Evento no encontrado");
		}
	}
	
	public static void eliminarEvento();{
		
	}
}




