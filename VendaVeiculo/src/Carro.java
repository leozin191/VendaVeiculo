public class Carro extends Veiculo {

	@Override
	public double precoVenda() {

		return super.precoVenda();
	}

	public Carro(String marca, String modelo, double p) {
		super(marca, modelo, p);
	}

	@Override
	protected double precoBase() {

		return super.precoBase();
	}
}
