package cl.inacap.Evaluacion2.campeonato;

import java.util.InputMismatchException;
import java.util.Scanner;
import cl.inacap.Evaluacion2.campeonato.Eventos;
import cl.inacap.Evaluacion2.campeonato.Equipos;

public class StartTest {
	static Scanner sc = new Scanner(System.in);
	static Eventos ev = new Eventos(null, null, 0);
	static String arrEvento[] = new String[30];
	static int arrEquipo[][] = new int[30][22];
	
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
		case "2": eliminarEventos();
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
		
		for(int i =0; i< arrEvento.length ;i++) {
			System.out.println("Ingrese el Codigo del Evento "+(i+1)+":");
			String codEvento = sc.nextLine().trim();
			System.out.println("Ingrese el Nombre del Evento "+(i+1)+":");
			String nombreEvento = sc.nextLine().trim();
			arrEvento[i]= nombreEvento;
			
			System.out.println("Ingrese la cantidad de Equipos (Tiene que ser Par");
			int cantEquipos = sc.nextInt();
			int verificadorPar = 0;
			for (int j=0; j<cantEquipos ;j++) {
				System.out.println("Ingrese el Codigo del Equipo "+(j+1)+":");
				String codEquipo;
				System.out.println("Ingrese el Nombre del Equipo "+(j+1)+":");
				String nombreEquipo;
				verificadorPar = (cantEquipos / 4);
				do {
					try {
						System.out.println("Ingrese la Cantidad de participantes del Equipo "+(j+1)+":");
						int plantelEquipo = sc.nextInt();
						arrEquipo[i][j]=plantelEquipo;
						sc.nextLine();
						Equipos equipo = new Equipos(codEquipo, nombreEquipo, plantelEquipo);
					}catch(Exception ex) {
						System.out.println("Error: Cantidad de Equipos No Par");
					}
				}while ((verificadorPar% 2) == 0);
				Eventos evento = new Eventos(codEvento, nombreEvento, cantEquipos);
			}
			System.out.println(evento);
		}
		int contador = cantEquipos;
		for (int i = 1; i <= contador; i++) {
			System.out.println("Ingresar el nombre del equipo " + i + ":");
			nombreEquipo[i] = sc.nextLine();
			
		}
	}
	

	public static void eliminarEventos() {
		System.out.println("Ingrese Codigo de Evento a Eliminar");
		String CodigoEvento=sc.nextLine();
		
		int indiceEvento = sc.nextInt();
		int NuevoIndice=0;
		
		for(int i=0; i<indiceEvento; i++) {
			if(arrEvento[i].getCodEvento[].equals(CodigoEvento)) {
				System.out.println("");
			}else {
				arrEventoBuk[NuevoIndice]= arrEvento[i];
				NuevoIndice++;
			}
		}
		ArrEvento=arrEventoBuk;
		indiceEvento=NuevoIndice++;
	}
	public static void verEventos() {
		for(int i=0; i < arrEvento.length; ++i) {
			System.out.println(arrEvento[i]+ " ");
			int retorno = ingresarEvento();
			for (int j=0; j< retorno ;j++) {
			System.out.println(arrEquipo[i][j]+ " ");
			}
			
		}	
	}
}
