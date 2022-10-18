public class Main {

	public static void main(String[] args) {

		double precoBase = 150000;
		Cliente cliente = new Cliente("Jorge");
		Veiculo v = new Veiculo("BMW", "320i", precoBase);
		System.out.printf("Valor de venda antes: %.2f\n", v.precoVenda());
		cliente.incluirVeiculo(v);
		System.out.printf("Valor de venda depois: %.2f", v.precoVenda());

	}

}