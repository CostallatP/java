package bytebank_composto;

public class TestaBanco {
 public static void main(String[] args) {
	Cliente paulo= new Cliente();
	paulo.nome = "Paulo Siveira";
	paulo.cpf = "222.222.222-22";
	paulo.profissao = "programador";

	Conta contaDoPaulo = new Conta();
	contaDoPaulo.deposita(100);
	
	contaDoPaulo.titular = paulo;
	System.out.println(contaDoPaulo.titular.nome);
	System.out.println(paulo);
 
 
 
 }
}
package bytebank_composto;

public class TesteSacaNegativo {
public static void main(String[] args) {
	Conta conta = new Conta();
	conta.deposita(100);
	System.out.println(conta.saca(101));
	
	conta.saca(101);
	System.out.println(conta.getSaldo());

}
}
package bytebank_composto;

public class TestaContaSemCliente {
 public static void main(String[] args) {
	Conta contaDaMarcela = new Conta();
	System.out.println(contaDaMarcela.getSaldo());
	
	contaDaMarcela.titular = new Cliente();
	System.out.println(contaDaMarcela.titular);
	
	contaDaMarcela.titular.nome="Marcela";
	System.out.println(contaDaMarcela.titular.nome);
}
}

package bytebank_composto;

public class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
					return true;
		}else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo>= valor){
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}
package bytebank_composto;

public class Cliente {
	String cpf = ""; 
	String nome = "";
	String profissao = "";

}
