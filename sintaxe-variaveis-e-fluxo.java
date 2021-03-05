
public class TestaWhile {
 public static void main(String[] args) {
	int contador = 0;
	 while(contador <= 10){
		System.out.println(contador);
		//contador = contador + 1;
		//contador += 1;
		contador++;
	}
	 System.out.println(contador);
}
}

public class TestaVariaveis {
	
	public static void main(String[] args) {
		System.out.println("olha novo teste");
	
	int idade;
	idade = 19;
	System.out.println(idade);
	idade = 30 + 10;
	System.out.println(idade);

	idade = (7* 5)+ 2;
	System.out.println(idade);
	
	System.out.println("a idade é " + idade + ", parabéns!!");
	
	}
}

public class TestaValores {

	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		System.out.println(segundo);
	}
}

public class TestaSomatoria {
	public static void main(String[] args) {
		int contador = 0;
		int total = 0;
		while(contador <=10) {
			
		total += contador;

		contador++;
		}
		System.out.println(total);
	}
}

public class TestarLacos {
	public static void main(String[] args) {
		for(int multiplicador = 1; multiplicador <=10;multiplicador++) {
			for(int contador = 0; contador<=10; contador++) {
				System.out.print(multiplicador * contador);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}

public class TestaPontoFlutuante {
	
	public static void main(String[] args) {
		double salario;
		salario = 1250.70;
		System.out.println("meu salario é " + salario);
		
	    double divisao = 3.14 / 2;
	    System.out.println(divisao);
		
	    int outraDivisao = 5/2;
	    System.out.println(outraDivisao);
	    
	    double novaTentativa = 5.0/2;
	    System.out.println(novaTentativa);
	}
}

public class TestaLacos2 {
	public static void main(String[] args) {
		for(int linha = 1; linha <10;linha++) {
			for(int coluna = 0; coluna<= linha; coluna++) {
			
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

public class TestaFor {
	public static void main(String[] args) {
			for(int contador = 0;contador <= 10;contador++){
				System.out.println(contador);
			}

	}
}

public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 20;
		int quantidadePessoas = 3;

		// boolean acompanhado = quantidadePessoas >= 2;
		boolean acompanhado;

		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;

		}
		System.out.println("valor acompanhado " + acompanhado);
		if (idade >= 18 && acompanhado) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("acesso negado.");
		}
	}
}

public class testaConversao {
	
	public static void main(String[] args) {
		double salario = 1270.50;
		int valor = (int)salario;
		System.out.println("é " + valor);
		float pontoFlutuante = 3.14f;
		long numeroGrande = 312312121231231l;
		//System.out.println(numeroGrande);
		short valorPequeno = 2131;
		//System.out.println(valorPequeno);
		byte b = 127;
		//System.out.println(b);
		double valor1 = 0.2;
		double valor2 = 0.1;
		double valorTotal = valor1 + valor2;
		System.out.println(valorTotal);
	}
}

public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println("valor acompanhado " + acompanhado);
		if (idade >= 18 && acompanhado) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("acesso negado.");
		}
	}
}

public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 2;
		int quantidadePessoas = 1;
		if (idade >= 18) {
			System.out.println("você tem mais de 18 anos");
			System.out.println("seja bem vindo");
		}
		else {
			if(quantidadePessoas >= 2) {
				System.out.println("aaa então vc pode");
			}else {
				System.out.println("acesso negado.");
		}}
	}
}

public class TestaCaracteres {
	
	public static void main(String[] args) {
		char letra = 'a';
		System.out.println(letra);
		char valor = 66;
		System.out.println(valor);
		valor = (char)(valor + 1);
		System.out.println(valor);
		
		String palavra = "alura cursos online de tecnologia";
		System.out.println(palavra);
		palavra = palavra + 2020;
		System.out.println(palavra);
	}
}
class Fatorial {
    public static void main(String[] args) {
        int fatorial = 1;
        for (int i = 1; i < 11; i++) {
            fatorial *= i;
            System.out.println("Fatorial de " + i + " = " +fatorial);
        }
    }
}
