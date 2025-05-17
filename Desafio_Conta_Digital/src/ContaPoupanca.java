public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		Utilitarios.simularEspera(200);
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
		
	}
}
