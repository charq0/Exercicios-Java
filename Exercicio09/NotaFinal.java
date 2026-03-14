/*9. Escreva um programa que leia 2 notas de um aluno, ele deverá calcular a média ponderada utilizando a seguinte fórmula: Media = (N1*2 + N2*3)/5. A partir da média, informar sua situação de acordo com o seguinte critério: 
Se média >= 5 – Aluno aprovado 
Se média < 5 - Aluno reprovado 

*/

import java.util.Scanner;

public class NotaFinal {
	private double n1;
	private double n2;
	private String aluno;
	private double nf;
	private Scanner s;
	private String situacao;
	//optei por armazenar a situacao, nome do aluno e nota final(media), porem caso precise, 
	//eh possivel retira-los e e manter o codigo funcional
	
	public NotaFinal(){
		//incializar variavel
		n1=0;
		n2=0;
		aluno="";
		nf=0;
		situacao="";
	}
	
	public void entrada(){
		s = new Scanner(System.in);
		//coleta de nome, n1 e n2
		System.out.println("\nInforme o nome do aluno: ");
		aluno = s.nextLine();
		System.out.println("\nInforme a primeira nota: ");
		n1 = s.nextDouble();
		System.out.println("\nInforme a segunda nota; ");
		n2 = s.nextDouble();
	}
	public void calcular(){
		//calculo de nota e atribuição da situação no atributo situacao
		nf = (n1*2 + n2*3)/5;
		if(nf>=5){
			situacao="Aprovado!";
		}
		else{
			situacao="Reprovado";
		}
	}
	public void imprimir(){
			//impressao de resultado
			System.out.printf("Aluno: %s\nN1 = %.2f\nN2= %.2f\nMedia = %.2f\nSituação = %s", aluno, n1, n2, nf, situacao);
	}
}
