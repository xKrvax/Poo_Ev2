package cl.inacap.Evaluacion2.campeonato;

	public class Equipos {	
		private String codEquipo;
		private String nombreEquipo;
		private String plantelEquipo;
		private int cantEquipos;
		
		public Equipos(String codEquipo, String nombreEquipo, String plantelTotal, int cantEquipos) {
			this.codEquipo = codEquipo;
			this.nombreEquipo = nombreEquipo;
			this.plantelEquipo = plantelTotal;
			this.cantEquipos = cantEquipos;
		}
		public String getCodEquipo() {
			return codEquipo;
		}
		public void setCodEquipo(String codEquipo) {
			this.codEquipo = codEquipo;
		}
		public String getNombreEquipo() {
			return nombreEquipo;
		}
		public void setNombreEquipo(String nombreEquipo) {
			this.nombreEquipo = nombreEquipo;
		}
		public String getPlantelEquipo() {
			return plantelEquipo;
		}
		public void setPlantelEquipo(String plantelEquipo) {
			this.plantelEquipo = plantelEquipo;
		}
		public int getCantEquipo() {
			return cantEquipos;
		}
		public void setCantEquipo(int cantEquipos) {
			this.cantEquipos = cantEquipos;
		}
	}