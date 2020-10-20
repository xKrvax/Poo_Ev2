package cl.inacap.Evaluacion2.campeonato;

	public class Equipos {	
		private String codEquipo;
		private String nombreEquipo;
		private int plantelEquipo;
		
		public Equipos(String codEquipo, String nombreEquipo, int plantelTotal) {
			this.codEquipo = codEquipo;
			this.nombreEquipo = nombreEquipo;
			this.plantelEquipo = plantelTotal;
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
		public int getPlantelEquipo() {
			return plantelEquipo;
		}
		public void setPlantelEquipo(int plantelEquipo) {
			this.plantelEquipo = plantelEquipo;
		}
	}