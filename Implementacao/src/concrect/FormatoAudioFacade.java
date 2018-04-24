package concrect;

import interfaces.FormatoAudio;

/**
 * @authors Gustavo Henrique Spiess, Gustavo Korbes Heinen, Luciane Tedesco e
 *          Matheus Mahnke
 *
 */
public class FormatoAudioFacade {
	
	private FormatoAudio player;

	/**
	 * Abre o arquivo especificado pelo parâmetro e o reproduz a partir do início.
	 * 
	 * @param arquivo Nome do arquivo.
	 */
	public void reproduzirSimples(String arquivo) {
		this.player = FormatoAudioFactory.getExtensaoAudio(arquivo);
		this.player.abrir(arquivo);
		this.player.reproduzir();
	}

	/**
	 * Encerra a reprodução libera a memória e o arquivo.
	 */
	public void pararSimples() {
		player.parar();
		player.liberar();
	}

}
