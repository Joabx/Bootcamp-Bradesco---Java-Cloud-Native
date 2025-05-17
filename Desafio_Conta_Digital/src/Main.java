import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Cliente Joab = new Cliente();
		Joab.setNome("Joab");
		
		Conta cc = new ContaCorrenteDigital(Joab);
		Conta poupanca = new ContaPoupanca(Joab);
		/*Depósito e Transfência */
		cc.depositar(2000);
		cc.transferir(100, poupanca);
		
		
		/*Imprime o Extrato */
		cc.imprimirExtrato();
		/*Faz um investimento e seleciona a data de inicio do investimento*/
		LocalDate dataHoje = LocalDate.of(2025, 5, 1);
		cc.investirSaldo(200, dataHoje, 6);
		
		/*Depósito e transfência */
		poupanca.depositar(3300);
		/*Imprime o Extrato */
		poupanca.imprimirExtrato();
		/*Faz um investimento */
		poupanca.investirSaldo(300, dataHoje, 12);

	}

}
