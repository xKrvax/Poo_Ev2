package cl.inacap.Evaluacion2.campeonato;

public class Equipo {
	
	public class Equipos {	
		private String codEquipo;
		private String nombreEquipo;
		private String plantelTotal;
		
		public Equipos(String codEquipo, String nombreEquipo, String plantelTotal) {
			this.codEquipo = codEquipo;
			this.nombreEquipo = nombreEquipo;
			this.plantelTotal = plantelTotal;
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
		public String getPlantelTotal() {
			return plantelTotal;
		}
		public void setPlantelTotal(String plantelTotal) {
			this.plantelTotal = plantelTotal;
		}


		}
	}
