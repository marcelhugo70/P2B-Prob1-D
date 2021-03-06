
package concrect;

import interfaces.FormatoAudio;
import problema1.WAVPlayer;

/**
 * @authors Gustavo Henrique Spiess, Gustavo Korbes Heinen, Luciane Tedesco e
 *          Matheus Mahnke
 *
 */
public class FormatoWAV implements FormatoAudio {

	private WAVPlayer player = null;

	@Override
	public void abrir(String audio) {
		this.player = new WAVPlayer(audio);
	}

	@Override
	public void reproduzir() {
		this.player.play();
	}

	@Override
	public void pausar() {
		this.player.stop();
	}

	@Override
	public void parar() {
		this.pausar();
		int posicao = this.player.reward(0);
		this.player.reward(posicao);
	}

	@Override
	public void avancar(int segundo) {
		this.player.forward(segundo * 1000);
	}

	@Override
	public void retornar(int segundo) {
		this.player.reward(segundo * 1000);
	}

	@Override
	public void liberar() {
		this.player = null;
	}

}
