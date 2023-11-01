
public class Teste {

	public static void main(String[] args) {
		Correntista Eduardo = new Correntista();
		Eduardo.setNome("Eduardo");
		
		Conta cc = new ContaCorrente(Eduardo);
		cc.depositar(100);
		
		Conta cp = new ContaPoupanca(Eduardo);
		 cc.depositar(100);
		
		cc.ImprimirExtrato();
		cp.ImprimirExtrato();

	}

}
