public class Cliente {
	private String cpf = ""; 
	private String nome = "";
	private String profissao = "";
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("total de contas é: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("conta: " + this.numero);
	}
	
	
	
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
	
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero){
		if(numero <=0) {
			System.out.println("negativo n pode")
			; return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("não pode valor menor igual a 0");
		return;
		}
		this.agencia = agencia;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
	public static int getTotal() {
		return Conta.total;
	}
	
}
public class TestaGetSet {
public static void main(String[] args) {
	Conta conta = new Conta(1337,24226);

	System.out.println(conta.getNumero());
	
	Cliente paulo = new Cliente();
	paulo.setNome("Paulo Silveira");
	conta.setTitular(paulo);
	
	System.out.println(conta.getTitular().getNome());
	conta.getTitular().setProfissao("Programador");
	
	Cliente titularDaConta = conta.getTitular();
	titularDaConta.setProfissao("programador");
	
	
	
	}
}
public class TestaValores {
public static void main(String[] args) {

	Conta conta = new Conta(1337, 24226);

	System.out.println(conta.getAgencia());
	
	conta.setAgencia(1232123);
	
	Conta conta2 = new Conta(1337, 16549);
	
	
	System.out.println(Conta.getTotal());
}
}

