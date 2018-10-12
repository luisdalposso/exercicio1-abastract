package entities;

public class ConPf extends Contribuinte {

	private Double gastoSaude;

	public ConPf() {
		super();
	}

	public ConPf(String nome, Double renda, Double gastoSaude) {
		super(nome, renda);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double calcImposto() {
		double imposto = 0.00;
		if (renda < 20000) {
			imposto = renda * 0.15;
		} else {
			imposto = renda * 0.25;
		}

		if (gastoSaude > 0) {
			imposto -= (gastoSaude / 2);
		}

		return imposto;

	}

}
