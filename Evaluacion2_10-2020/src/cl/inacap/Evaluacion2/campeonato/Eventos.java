package cl.inacap.Evaluacion2.campeonato;

	public class Eventos {
		private String codEvento;
		private String nombreEvento;
		private int cantEquipos;
		private Equipos[] equipos = new Equipos[30];
		
		public Eventos(String codEvento, String nombreEvento, int cantEquipos) {
			this.codEvento = codEvento;
			this.nombreEvento = nombreEvento;
			this.cantEquipos = cantEquipos;
		}
		public void agregarEquipo(Equipos equipo) {
			int pos = -1;
			for(int i=0; i < this.equipos.length; i++) {
				if(this.equipos[i] == null) {
					pos = i;
					break;
				}
			}
			if(pos >=0) {
				this.equipos[pos] = equipo;
			}else {
				System.out.println("No hay espacio para el Equipo");	
			}	
		}
		public  Equipos[] getEquipo() {
			return equipos;
		}

		public String getCodEvento() {
			return codEvento;
		}

		public void setCodEvento(String codEvento) {
			this.codEvento = codEvento;
		}

		public String getNombreEvento() {
			return nombreEvento;
		}

		public void setNombreEvento(String nombreEvento) {
			this.nombreEvento = nombreEvento;
		}

		public int getCantEquipos() {
			return cantEquipos;
		}

		public void setCantEquipos(int cantEquipos) {
			this.cantEquipos = cantEquipos;
		}
	}


	
