package concrect;

import interfaces.FormatoAudio;
import problema1.MP3DJ;

/**
 * @authors Gustavo Henrique Spiess, Gustavo Korbes Heinen, Luciane Tedesco e
 *          Matheus Mahnke
 *
 */
public class FormatoMP3DJ implements FormatoAudio {

	private MP3DJ player = null;

	@Override
	public void abrir(String audio) {
		this.player = new MP3DJ();
		this.player.setFile(audio);
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
	public void avancar(int segundos) {
		this.player.forward(segundos);
	}

	@Override
	public void retornar(int segundos) {
		this.player.reward(segundos);
	}

	@Override
	public void liberar() {
		this.player = null;
	}

}
