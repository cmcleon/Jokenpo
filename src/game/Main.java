//implementa regras do jogo e operação jogar

package game;

import java.util.Random;
import java.util.Scanner;

import senai.Usuario;


public class Main {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Random geradorEscolha = new Random();
		
		System.out.println("--- Game JoKenPo --- ");
		//verificando se o usuário informou o nome
		Jogador humano = new Jogador(verificarNome(leitor));
		Jogador virtual = new Jogador();
		
		//verificando se o usuário escolheu opção entre 1 a 3
		humano.setEscolha(verificarEscolha(leitor));
		
		System.out.println();
		
		int opcaoEscolhidaPC = geradorEscolha.nextInt(3) + 1;
		System.out.println("Jogador Virtual escolheu: " + opcaoEscolhidaPC);
		virtual.setEscolha(opcaoEscolhidaPC);
		
		System.out.println();
			
		Jogar.obterVencedor(humano, virtual);		
	}
	
	public static String verificarNome (Scanner leitor){
		System.out.print("Nome Jogador 1: ");
		String nome= leitor.nextLine();
		
		while (nome =="") {
			System.out.print("Ops! Coloque seu nome: ");
			nome= leitor.nextLine();
			System.out.println();
		}
		return nome;
	}

	
	public static int verificarEscolha (Scanner leitor){
		System.out.print("Escolha entre 1 = Pedra, 2 = Papel, 3 = Tesoura: ");
		int opcaoEscolhida = leitor.nextInt();

		while (opcaoEscolhida == 0 || opcaoEscolhida > 3) {	
			System.out.print("Ops! Você so pode escolher entre : 1 = Pedra, 2 = Papel, 3 = Tesoura: ");
			opcaoEscolhida = leitor.nextInt();
		}
		return opcaoEscolhida;
	}
}
		
		
	


	


