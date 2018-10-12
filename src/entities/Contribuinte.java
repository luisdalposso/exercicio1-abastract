package entities;

public abstract class Contribuinte {

	private String nome;
	protected Double renda;

	public Contribuinte() {
	}

	public Contribuinte(String nome, Double renda) {
		this.nome = nome;
		this.renda = renda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRenda() {
		return renda;
	}

	public void setRenda(Double renda) {
		this.renda = renda;
	}

	public abstract double calcImposto();

	public String toString() {
		return "NOME: " + nome + " - IMPOSTO: R$" + calcImposto();
	}
	
}
