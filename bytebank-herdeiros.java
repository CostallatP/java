
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1= new Gerente();
		g1.setNome("marcos");
		g1.setSalario(5000.0);
		

		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(g1);
		controle.registra(ev);
		
		System.out.println(controle.getSoma());
	}
	

}

public class TesteGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("marco");
		g1.setCpf("23455678909");
		g1.setSalario(5000.0);
		
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		System.out.println(g1.getNome());
		
		g1.setSenha(2222);
		
		boolean autentica = g1.autentica(2222);
		System.out.println(autentica);
		
		System.out.println(g1.getBonificacao());
	}
}

public class TestaFuncionario {
public static void main(String[] args) {
	Gerente nico = new Gerente();
	nico.setNome("rapazinho do lado");
	nico.setCpf("04845073110");
	nico.setSalario(2580.00);
	
	System.out.println(nico.getNome());
	System.out.println(nico.getBonificacao());
}
}

public class Gerente extends Funcionario{

	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if(this.senha == senha) 
		{
			return true;
		}else {
			return false;
		}
	}
	
	  public double getBonificacao(){
		  System.out.println("chamando o metodo de boni do gerente");
		  return super.getSalario(); 
		  }
	 
	
}

//nao pode instaciar dessa classe, pq é abstrata
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
//metodo sem corpo, não ha implementacao
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}

public class EditorVideo extends Funcionario{

	  public double getBonificacao(){
		  System.out.println("sou o editor de video e minha boni");
		  return 150; 
		  }
	 
	
}

public class design extends Funcionario{

	  public double getBonificacao(){
		  System.out.println("sou o designer minha boni");
		  return 200; 
		  }
	 
	
}

public class ControleBonificacao {
	
	private double soma;
	
	
	//funcionario
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma+boni;
	}

	
	//resultado
	public double getSoma() {
		return soma;
	}
}
