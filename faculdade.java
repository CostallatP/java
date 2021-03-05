import java.util.Scanner;

public class votos {
public static void main(String[] args) {
	//
	Scanner leitor = new Scanner(System.in);
	double validos=0;
	double branco;
	double nulo;
	double totais;
	double validos2;
	double branco2;
	double nulo2;
	double totais2;
	double a;
	double b;
	double c;
	double validos3;
	double validos4;
	double validos5;

	//
	System.out.println("votos nulos:");
	nulo = leitor.nextDouble();
	System.out.println("brancos:");
	branco = leitor.nextDouble();
	//
	totais = validos + branco + nulo;
	validos2 = (validos/totais);
	nulo2 = (nulo/totais);
	branco2 = (branco/totais);
	System.out.println("votos em A: ");
	a = leitor.nextDouble();
	System.out.println("votos em B: ");
	b = leitor.nextDouble();
	System.out.println("votos em C: ");
	c = leitor.nextDouble();
	validos = (a + b + c) ;
	totais = validos;
	validos3 = (a*100)/validos;
	validos4 = (b*100)/validos;
	validos5 = (c*100)/validos;

	//System.out.println("votos validos: " +validos );
	//System.out.println("votos nulo: " +nulo );
	//System.out.println("votos brancos: " + branco);
	//System.out.println("% de votos validos: " +validos2 );
	//System.out.println("% de votos nulo: " +nulo2 );
	//System.out.println("% de votos brancos: " +branco2 );
	System.out.println("total de votos: " + totais);
	System.out.println("votos em a% = " + validos3);
	System.out.println(" votos em b% = " + validos4);
	System.out.println(" votos em c% = " + validos5);

}
}

public class TrocaVariavel {
	public static void main(String args[]) {
		//declaracao de variaveis
		int a = 0;
		int b = 1;
		int temp = 2;

		//processamento
		System.out.println("essa é a A = " + a);
		System.out.println("essa é a B = " + b);
	  temp = a;
	  a = b;
	  b = temp;
		System.out.println("essa é a A = " + a);
		System.out.println("essa é a B = " + b);
		//% resto
		a = a+1;
		System.out.println(a);
		a++;
		System.out.println(a);
		
	}		
}
import java.util.Scanner;
public class Temperatura {
	public static void main(String[] args) {
		
	
	//declarações
	int celsius;
	int farenheit;
	Scanner leitor = new Scanner(System.in); //objeto que le do teclado1
	//intruções
	
	
	System.out.println("Digite a temperatura em Celsius: ");
	celsius = leitor.nextInt();
	// Processamento
	farenheit = ((celsius*9)/5)+32;
	System.out.println("A temperatura em farenheit é " + farenheit);
}
}
import java.util.Scanner;

public class segundos {
public static void main(String[] args) {
	// Declarações
	int data1;
	int data2;
	int data3;
	int soma;
	int dias;
	Scanner leitor = new Scanner(System.in); //objeto que le do teclado1
	// Instruções
	System.out.println("Hora: ");
	data1 = leitor.nextInt();
	System.out.println("Minuto: ");
	data2 = leitor.nextInt();
	System.out.println("segundos: ");
	data3 = leitor.nextInt();
	soma = (data1*60);
	soma = soma+ data2;
	soma = soma * 60;
	soma = soma + data3;
	System.out.println("segundos totais: " + soma + ".");
	
}
}
import java.util.Scanner;

public class oiRs {
	public static void main(String[] args) {
		// Declarações
		double arestaCubo;
		double raioEsfera;
		double raioCilindro;
		double alturaCilindro;
		double volumeCubo;
		double volumeEsfera;
		double volumeCilindro;
		Scanner leitor = new Scanner(System.in);
		// Instruções
		System.out.println("digite a aresta do cubo: ");
		arestaCubo = leitor.nextDouble();
		
		System.out.println("digite a raio do esfera: ");
		raioEsfera = leitor.nextDouble();
		
		System.out.println("digite a raio do cilindro: ");
		raioCilindro = leitor.nextDouble();
		
		System.out.println("digite a altura do cilindro: ");
		alturaCilindro = leitor.nextDouble();
		
		// Processamento
		volumeCubo = Math.pow(arestaCubo, 3);
		volumeEsfera = (4 * Math.PI * Math.pow(raioEsfera, 3))/3;
		volumeCilindro = Math.PI * Math.pow(raioCilindro, 2) * alturaCilindro;
		
		//Saida de dados
		System.out.println("O volume do cubo e: " + volumeCubo);
		System.out.println("O volume da esfera e: " + volumeEsfera);
		System.out.println("o volume do cilindro e: " + volumeCilindro);
	}
}
import java.util.Scanner;

public class mediaSala {
public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	int aluno;
	double nota;
	double soma;
	double media;
	// Instruções
	soma = 0;
	for (aluno = 0; aluno < 6; aluno++) {	
		System.out.println("Digite a nota do " + aluno + " aluno: ");
		nota = leitor.nextDouble();
		soma = soma + nota;
	}
	media = soma / aluno;
	System.out.println("A média da turma é " + media);
     }
}


import java.util.Scanner;

public class IMC {
public static void main(String[] args) {
	double altura;
	double altura2;
	double peso;
	double imc;
	Scanner leitor = new Scanner(System.in); //objeto que le do teclado1

	// Instruções
	System.out.println(" Qual e seu peso?: ");
	peso = leitor.nextDouble();
	System.out.println(" Qual e a sua altura?: ");
	altura = leitor.nextDouble();
	altura2 = Math.pow(altura, 2);
	imc = (peso/altura2);
	System.out.println("Seu imc e: " + imc);
}
}
import java.util.Scanner;

public class guri {
public static void main(String[] args) {
	
	// variaveis
	
	Scanner leitor = new Scanner(System.in);
	double p1;
	double p2;
	double p3;
	double m;
	double e1;
	double e2;
	double e3;
	
	// Instruções
	
	System.out.println("prova1: ");
	p1 = leitor.nextDouble();
	System.out.println("prova2: ");
	p2 = leitor.nextDouble();
	System.out.println("prova3: ");
	p3 = leitor.nextDouble();
	System.out.println("ex1: ");
	e1 = leitor.nextDouble();
	System.out.println("ex2: ");
	e2 = leitor.nextDouble();
	System.out.println("conceito: ");
	e3 = leitor.nextDouble();
	m = ((e3 * 3)+(e2 * 1)+(e1 * 1)+ (p3 * 3)+(p2 * 2)+(p1 * 2))/12;
	// saida
	System.out.println("media final = " + m);
}
}

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class Calculadora {
	public static void main(String args[]) {
		//declaracao de variaveis
		int operando1 = 0;
		int operando2 = 0;
		int soma = 0;
		int sub = 0;
		int mult = 0;
		double div = 0 ;
		int rest = 0;
		int inc = 0;
		Scanner leitor = new Scanner(System.in); //objeto que le do teclado1
		
		// Entrada de dados
		System.out.print("Escreva a seguir o primeiro numero: ");
		operando1 = leitor.nextInt();
		
		System.out.print("Escreva a seguir o segundo numero: ");
		operando2 = leitor.nextInt();
		
		//processamento
		soma = operando1 + operando2;
		sub = operando1 - operando2;
		mult = operando1 * operando2;
		div = operando1 / operando2;
		rest = operando1 % operando2;
		inc = ++operando1; 
		//saida
		System.out.println("o resultado da soma é: " + soma + "");
		System.out.println("o resultado da sub é: " + sub + "");
		System.out.println("o resultado da mult é: " + mult + "");
		System.out.println("o resultado da div é: " + div + "");
		System.out.println("o resultado o rest é: " + rest + "");
		System.out.println("o resultado inc é: " + inc + "");

		
	}

}
