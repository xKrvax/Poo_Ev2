package cl.inacap.Evaluacion2.campeonato;

	public class Eventos {
		private String codEvento;
		private String nombreEvento;
		private String descEvento;
		
		public Eventos(String codEvento, String nombreEvento, String descEvento) {
			this.codEvento = codEvento;
			this.nombreEvento = nombreEvento;
			this.descEvento = descEvento;
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

		public String getDescripcion() {
			return descEvento;
		}

		public void setDescripcion(String descripcion) {
			descEvento = descripcion;
		}
	}


	
