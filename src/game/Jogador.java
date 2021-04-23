package game;

public class Jogador {
	//atributos
	private String nome;
	private int escolha;
	
	//construtores
	public Jogador(String nome) {
		this.nome = nome;
	}

	public Jogador() {
		nome = "PC";
	}


	//geters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEscolha() {
		return escolha;
	}

	public void setEscolha(int escolha) {
		this.escolha = escolha;
	}

	
	
	

}
