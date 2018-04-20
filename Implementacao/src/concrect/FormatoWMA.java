
package concrect;

import interfaces.FormatoAudio;
import problema1.wmaPlay;

/**
 * @authors Gustavo Henrique Spiess, Gustavo Korbes Heinen, Luciane Tedesco e
 *          Matheus Mahnke
 *
 */
public class FormatoWMA implements FormatoAudio {

	private wmaPlay player = null;

	public FormatoWMA() {
		this.player = new wmaPlay();
	}

	@Override
	public void abrir(String audio) {
		this.player.setFile(audio);
		this.player.open();
		this.player.setLocation(0);
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
		this.player.setLocation(0);
	}

	@Override
	public void avancar(int segundo) {
		int posicao = this.player.getLocation();
		posicao += segundo;
		if (posicao < 0) {
			posicao = 0;
		}
		this.player.setLocation(posicao);
	}

	@Override
	public void retornar(int segundo) {
		int negSegundos = segundo * -1;
		this.avancar(negSegundos);
	}

	@Override
	public void liberar() {
		this.player = null;
	}

}
