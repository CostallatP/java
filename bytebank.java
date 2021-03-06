
public class TestaMetodo {
 
	public static void main(String[] args) {
		
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);
		
		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
	
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		boolean sucessoTransferencia = 
				contaDaMarcela.transfere(1000, contaDoPaulo);
		if(sucessoTransferencia) {
			System.out.println("transferencia com sucesso");
		}else {
			System.out.println("faltou money.");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoPaulo.saldo);
		
		contaDoPaulo.titular = "Paulo silveira";
		System.out.println(contaDoPaulo.titular);
		
	}
}

public class TesteReferencia {

	public static void main(String[] args) {
		Conta primeiraConta=  new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("saldo da primeira " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da segunda: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("segunda conta " + segundaConta.saldo);
		System.out.println("primeira conta " + primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("mesma conta");
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}

public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
	
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
	
		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;
		
		System.out.println("primeira Conta! tem " + primeiraConta.saldo);
		System.out.println("segunda Conta! tem " + segundaConta.saldo);
	
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		System.out.println(segundaConta.agencia);
		
		primeiraConta.agencia = 146;
		System.out.println(primeiraConta.agencia);
		
		segundaConta.agencia = 146;
		System.out.println(segundaConta.agencia);
		
		if(primeiraConta == segundaConta) {
			System.out.println("mesma conta");
		} else{
			System.out.println("diferentes");
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
		
		
		
		
	}
}
public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;

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
}
