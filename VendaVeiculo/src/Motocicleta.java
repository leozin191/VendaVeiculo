public class Motocicleta extends Veiculo {

	private static double ADICIONAL_MOTO = 500;
	private static double ACREC_CARENAGEM = 0.15;
	private int quantMotocicletas;
	public boolean possuiCarenagem;

	@Override
	public double precoVenda() {
		return super.precoVenda() + ADICIONAL_MOTO;
	}

	@Override
	protected double precoBase() {
		return super.precoBase();
	}

	public double precoAdicionais() {
		return precoAdicionais();
	}

	public Motocicleta(String marca, String modelo, double p, int qtd) {
		super(marca, modelo, p);
		this.quantMotocicletas = qtd;
		this.possuiCarenagem = false;
	}

}
