//implementa regras do jogo e operação jogar

package game;

import java.util.Random;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Random geradorEscolha = new Random();
		
		System.out.println("--- Game JoKenPo --- ");
		
		System.out.print("Nome Jogador 1: ");
		String nome= leitor.nextLine();
		Jogador humano = new Jogador(nome);
		Jogador virtual = new Jogador();
		
		System.out.print("Escolha entre 1 = Pedra, 2 = Papel, 3 = Tesoura: ");
		
		int opcaoEscolhida = leitor.nextInt();
		humano.setEscolha(opcaoEscolhida);
		
		System.out.println();
		
		int opcaoEscolhidaPC = geradorEscolha.nextInt(3) + 1;
		System.out.println("Jogador Virtual escolheu: " + opcaoEscolhidaPC);
		virtual.setEscolha(opcaoEscolhidaPC);
		
		System.out.println();
		
		
		Jogar.obterVencedor(humano, virtual);
		
	}
}
		
		
	


	


