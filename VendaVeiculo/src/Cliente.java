import java.util.ArrayList;

public class Cliente {
	private static double IMPOSTOS = 0.08;
	public String nome;
	ArrayList<Veiculo> historico;
	public double impostosAcumulados;
	private double proxDesconto;

	public void incluirVeiculo(Veiculo novo) {
		novo.setSaiu();
		historico.add(novo);
	}

	private boolean verificarDesconto() {
		return false;
	}

	public void calcularImpostos() {

	}

	public Cliente(String nome) {
		this.nome = nome;
		historico = new ArrayList<Veiculo>();
		impostosAcumulados = 0;
		proxDesconto = 0;
	}

}