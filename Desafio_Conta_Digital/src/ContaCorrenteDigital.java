public class ContaCorrenteDigital extends Conta {

	public ContaCorrenteDigital(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		Utilitarios.simularEspera(200);
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();


		
	}
	
}
