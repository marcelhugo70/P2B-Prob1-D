
package concrect;

import interfaces.FormatoAudio;
import problema1.AIFFSuperPlayer;

/**
 * @authors Gustavo Henrique Spiess, Gustavo Korbes Heinen, Luciane Tedesco e
 *          Matheus Mahnke
 *
 */
public class FormatoAIFF implements FormatoAudio {

	private AIFFSuperPlayer player;
	private int cursor = 0;

	@Override
	public void abrir(String audio) {
		this.player = new AIFFSuperPlayer(audio);
	}

	public void reproduzir() {
		this.player.setCursor(this.cursor);
		this.player.play();
	}

	@Override
	public void pausar() {
		this.cursor = this.player.pause();
	}

	@Override
	public void parar() {
		this.player.stop();
		this.cursor = 0;
	}

	@Override
	public void avancar(int segundo) {
		this.pausar();
		this.cursor += segundo;
		if (this.cursor < 0) {
			this.cursor = 0;
		}
		this.reproduzir();
	}

	@Override
	public void retornar(int segundo) {
		int negSegundos = segundo * -1;
		this.avancar(negSegundos);
	}

	@Override
	public void liberar() {
		this.player.release();
	}
}
