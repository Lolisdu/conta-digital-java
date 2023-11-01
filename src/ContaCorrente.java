
public class ContaCorrente extends Conta {

	public ContaCorrente(Correntista correntista) {
		super(correntista);
	}

	@Override
	public void ImprimirExtrato() {
		
		System.out.println("---Extrato Conta Corrente---");
		super.imprimirInfosComuns();
	}
	
}
