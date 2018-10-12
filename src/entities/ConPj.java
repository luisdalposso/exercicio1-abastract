package entities;

public class ConPj extends Contribuinte {

	private Integer numFunc;

	public ConPj() {
		super();
	}

	public ConPj(String nome, Double renda, Integer numFunc) {
		super(nome, renda);
		this.numFunc = numFunc;
	}

	public Integer getNumFunc() {
		return numFunc;
	}

	public void setNumFunc(Integer numFunc) {
		this.numFunc = numFunc;
	}

	@Override
	public double calcImposto() {
		double imposto = 0.00;
		if (numFunc > 10) {
			imposto = (renda * 0.14);
		} else {
			imposto = (renda * 0.16);
		}

		return imposto;
	}

}
