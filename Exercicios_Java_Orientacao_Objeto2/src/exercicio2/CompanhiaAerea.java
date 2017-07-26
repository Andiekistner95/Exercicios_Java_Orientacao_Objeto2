package exercicio2;

public class CompanhiaAerea {

	Boing[] boings;
	Monomotor[] monomotores;
	Bimotor[] bimotores;

	public double retornaFaturamentoPassagens() {

		double faturamentoTotal = 0;
		double faturamentoBoing = 0;
		double faturamentoMono = 0;
		double faturamentoBi = 0;

		for (Bimotor bimotor : bimotores) {
			faturamentoBi += (bimotor.getValorPassagem() * bimotor.getLugares());
		}

		for (Boing boing : boings) {

			faturamentoBi += (boing.getValorPassagem() * boing.getLugares());
		}

		for (Monomotor monomotor : monomotores) {
			faturamentoBi += (monomotor.getValorPassagem() * monomotor.getLugares());
		}

		faturamentoTotal = faturamentoBi + faturamentoBoing + faturamentoMono;

		return faturamentoTotal;
	}

	public Boing[] getBoings() {
		return boings;
	}

	public void setBoings(Boing[] boings) {
		this.boings = boings;
	}

	public Monomotor[] getMonomotores() {
		return monomotores;
	}

	public void setMonomotores(Monomotor[] monomotores) {
		this.monomotores = monomotores;
	}

	public Bimotor[] getBimotores() {
		return bimotores;
	}

	public void setBimotores(Bimotor[] bimotores) {
		this.bimotores = bimotores;
	}

	// terá que pegar todos os arrays de aviões,
	// pegar o valor da passagem de cada avião e multiplicar pela quantidade
	// de aeronaves e lugares do avião.

}
