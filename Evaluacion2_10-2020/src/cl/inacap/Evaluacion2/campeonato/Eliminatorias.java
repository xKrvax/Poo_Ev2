package cl.inacap.Evaluacion2.campeonato;

import java.util.Scanner;

public class Eliminatorias {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		String[] nombreEquipo = new String[32];
		
		int totalEquipos = 0;
		//String nombreEquipo = null;
		boolean cosa = false;
		while (!cosa) {
			System.out.println("Ingresar la cantidad de equipos:");
			totalEquipos = sc.nextInt();
			sc.nextLine();
			int ronda = (totalEquipos / 4);
			if ((totalEquipos % 2) == 0) {
				if ((ronda % 2) == 0 || totalEquipos==4) {
					cosa = true;
				} else {
					System.out.println("El numero que ingrese debe ser par y multiplo de 4");
				}
			} else {
				System.out.println("El numero que ingrese debe ser par y multiplo de 4");
			}

		}
		
		int Nazi = totalEquipos;
		for (int i = 1; i <= Nazi; i++) {
			System.out.println("Ingresar el nombre del equipo " + i + ":");
			nombreEquipo[i] = sc.nextLine();
		}
		
	//	arrStrings = nombreEquipo;
		
		int max = totalEquipos;
		int min = 0;
		int range = max - min;
		int rand = (int) (Math.random() * range) + min;
		int rand2 = (int) (Math.random() * range) + min;
		
		
		for (int i = 1; i <= (Nazi/2); i++) {
			rand = (int) (Math.random() * range) + min;
			rand2 = (int) (Math.random() * range) + min;
			//System.out.println("nombre : "+nombreEquipo[Math.random()]);
			//System.out.println("El enfrentamiento "+i+" sera entre " +nombreEquipo[rand] +" y " + nombreEquipo[rand2]);
			if (rand == rand) {
				System.out.println("El enfrentamiento "+i+" sera entre " +nombreEquipo[rand] +" y " + nombreEquipo[rand2]);
			}
			
			
		}		
		
		
		

	}

}