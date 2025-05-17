import java.text.Format;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Conta implements IConta {
	
	protected int agencia;
	protected int numero;
	protected double saldo = 0;
	protected Cliente cliente;
	private double valorInvestido, valorTotalResgatado, porcentagemLucro;

	public Conta(Cliente cliente) {
		this.agencia = (int) (Math.random() * 100 );
		this.numero = (int) (Math.random() * 1000 );
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	@Override
	public void investirSaldo(double valor, LocalDate dataInvestimento, int tempoInvestido){
		Utilitarios.simularEspera(200);
		porcentagemLucro = 14;
		valorInvestido = valor;
		LocalDate dataDevolucaoInvestimento = dataInvestimento.plusMonths(tempoInvestido);
		DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dataFormatoBR = dataDevolucaoInvestimento.format(formatoBR);
		if(saldo > 0){
			if (saldo - valorInvestido < 0) {
				System.out.println("Saldo da conta Corrente menor que o valor selecionado para investimento...");
				return;
			}else{
				saldo -= valorInvestido;
				valorTotalResgatado = valorInvestido * (1+ porcentagemLucro/100);
				System.out.printf("Valor investido no total de: R$%.2f reais... "+
								"\nSeu saldo atual é de R$%.2f  reais..."+
								"\nSeu investimento estará trancado até dia: %.28s... "+
								"\nValor total a ser resgatado será de: R$%.2f reais..."+
								"\nCom rendimento sobre o valor inicial de: %.0f %%", valorInvestido,saldo,dataFormatoBR,valorTotalResgatado,porcentagemLucro );
				
			}

		}


	}

	public double getValorInvestido(){
		return valorInvestido;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {

		System.out.println(String.format("Titular: %s ", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %04d ", this.agencia));
		System.out.println(String.format("Numero: %06d", this.numero));
		System.out.println(String.format("Saldo: R$%.2f reais", this.saldo));


	}
}
