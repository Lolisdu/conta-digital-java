
public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(Correntista correntista) {
		super(correntista);
	}

	@Override
	public void ImprimirExtrato() {
		
		System.out.println("---Extrato Conta Poupança---");
		super.imprimirInfosComuns();	
		
	}
}
