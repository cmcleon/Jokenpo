package game;

// implementa regras do jogo e operação PLAY
public class Jogada {

	public static void obterVencedor(Jogador jogadorHumano, Jogador jogadorPc) {
		if (jogadorHumano.getEscolha() == jogadorPc.getEscolha()){
			System.out.println("EMPATE!\nOs Jogadores escolheram a mesma opção." );
		}
		else if (jogadorHumano.getEscolha() - jogadorPc.getEscolha() == -1 || jogadorHumano.getEscolha() - jogadorPc.getEscolha() == 2){
			System.out.println("JOGADOR VIRTUAL VENCEU! \n" + explicaVitoria(jogadorPc.getEscolha())  );
		}
		else{
			System.out.println("JOGADOR " + jogadorHumano.getNome() + " VENCEU! \n" + explicaVitoria(jogadorHumano.getEscolha()) );
		}
	}
	
	private static String explicaVitoria(int escolhaVencedor ) {
		if (escolhaVencedor == 1) {
			return "Pedra quebra Tesoura";
		}
		else if (escolhaVencedor == 2) {
			return "Papel envolve Pedra";
		}
		else {
			 return "Tesoura corta Papel";
		}
	}
}

