//implementa regras do jogo e operação jogar

package game;

import java.util.Random;
import java.util.Scanner;


public class Jogo {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Random maquina = new Random();
		
		System.out.println("--- Game JoKenPo --- ");
		
		System.out.print("Nome Jogador 1: ");
		String nome= leitor.nextLine();
		Jogador humano = new Jogador(nome);
		
		System.out.print("Escolha entre 1 = Pedra, 2 = Papel, 3 = Tesoura: ");
		int escolha = leitor.nextInt();
		
		System.out.println();
		
		int escolhaPC = maquina.nextInt(3) + 1;
		System.out.println("Jogador Virtual escolheu: " + escolhaPC);
		//mostrar escolha do PC
//		if (escolhaPC == 1) {
//			System.out.print("Pedra");
//		}
//		else if (escolhaPC == 2) {
//			System.out.print("Papel");
//		}
//		else {
//			System.out.print("Tesoura");
//		}
		
		//regras
		System.out.println();
		if (escolha == escolhaPC) {
			System.out.println("EMPATE!\nOs Jogadores escolheram a mesma opção." );
		}
		else if (escolha - escolhaPC == -1 || escolha - escolhaPC == 2){
			System.out.println("JOGADOR VIRTUAL VENCEU!" );
		}
		else{
			System.out.println("JOGADOR " + humano.getNome() + " VENCEU!");
		}
		
	}
}
	


