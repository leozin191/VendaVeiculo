import java.util.ArrayList;

public class Veiculo {

	private static double VERSAO_COMPLETA = 0.35;
	private static double DESVALORIZACAO = 0.20;
	private static double MARGEM_LUCRO = 0.30;

	protected String marca;
	protected String modelo;
	protected boolean saiuConcessionaria;
	protected double precoBase;
	ArrayList<String> opcionais;

	public Veiculo(String marca, String modelo, double p) {
		this.marca = marca;
		this.modelo = modelo;
		this.precoBase = p;
		this.saiuConcessionaria = false;
		this.opcionais = new ArrayList<String>();
	}

	public void setSaiu() {
		this.saiuConcessionaria = true;
	}

	public double precoVenda() {
		double precoVenda = precoBase + (precoBase * Veiculo.MARGEM_LUCRO);
		if (saiuConcessionaria) {
			precoVenda *= 0.8;
		}
		return precoVenda;

	}

	protected double precoBase() {
		return precoBase;
	}

	private double descontoSaidaConcessionaria() {
		double descontoSaidaConcessionaria = this.precoBase - (this.precoBase * Veiculo.DESVALORIZACAO);
		return descontoSaidaConcessionaria;
	}

	public void addOpcionais(String s) {
		this.opcionais.add(s);
	}

	public void visualizarOpcionais() {
		for (String ops : opcionais) {
			System.out.println(ops);
		}
	}

}
