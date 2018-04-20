
package concrect;

import interfaces.FormatoAudio;

/**
 * @authors Gustavo Henrique Spiess, Gustavo Korbes Heinen, Luciane Tedesco e
 *          Matheus Mahnke
 *
 */
public class ManipulacaoAudio implements FormatoAudio {

	private FormatoAudio player;

	@Override
	public void abrir(String audio) {
		if (audio.toUpperCase().endsWith(".AIFF")) {
			this.player = new FormatoAIFF();
		} else if (audio.toUpperCase().endsWith(".WAV")) {
			this.player = new FormatoWAV();
		} else if (audio.toUpperCase().endsWith(".WMA")) {
			this.player = new FormatoWMA();
		}
		this.player.abrir(audio);
	}

	@Override
	public void reproduzir() {
		this.player.reproduzir();

	}

	@Override
	public void pausar() {
		this.player.pausar();
	}

	@Override
	public void parar() {
		this.player.parar();
	}

	@Override
	public void avancar(int segundo) {
		this.player.avancar(segundo);
	}

	@Override
	public void retornar(int segundo) {
		this.player.retornar(segundo);
	}

	@Override
	public void liberar() {
		this.player.liberar();
	}

	/**
	 * Abre o arquivo especificado pelo parâmetro e o reproduz a partir do início.
	 * 
	 * @param arquivo Nome do arquivo.
	 */
	public void reproduzirSimples(String arquivo) {
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
