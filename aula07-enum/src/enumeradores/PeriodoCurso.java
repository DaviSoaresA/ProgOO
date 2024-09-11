package enumeradores;

public enum PeriodoCurso {
	NOTURNO("ter e qua", 2500., 40), INTEGRAL("seg e sex", 1800., 20), TARDE("qui e sex", 3200., 80);

	private final String dias;
	private final Double valor;
	private final Integer cargaHoraria;

	private PeriodoCurso(String dias, Double valor, Integer cargaHoraria) {
		this.dias = dias;
		this.valor = valor;
		this.cargaHoraria = cargaHoraria;
	}

	public String getDias() {
		return dias;
	}

	public Double getValor() {
		return valor;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}
	
	

}
