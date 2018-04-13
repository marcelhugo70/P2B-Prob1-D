/**
 * 
 */
package concrect;

import interfaces.FormatoAudio;
import problema1.WAVPlayer;

/**
 * @author Luciane
 *
 */
public class FormatoWAV /*extends WAVPlayer*/ implements FormatoAudio {

    private WAVPlayer player;
	/**
	 * 
	 */
	public FormatoWAV() {
	}

	/* (non-Javadoc)
	 * @see interfaces.FormatoAudio#abrir(java.lang.String)
	 */
	@Override
	public void abrir(String audio) {
        this.player = new WAVPlayer(audio);
	}

	/* (non-Javadoc)
	 * @see interfaces.FormatoAudio#reproduzir()
	 */
	@Override
	public void reproduzir() {
        this.player.play();
	}

	/* (non-Javadoc)
	 * @see interfaces.FormatoAudio#pausar()
	 */
	@Override
	public void pausar() {
        this.player.play();
	}

	/* (non-Javadoc)
	 * @see interfaces.FormatoAudio#parar()
	 */
	@Override
	public void parar() {
        this.pausar();
        int posicao = this.player.forward(0);
        this.player.reward(posicao);
	}

	/* (non-Javadoc)
	 * @see interfaces.FormatoAudio#avancar(int)
	 */
	@Override
	public void avancar(int segundo) {
        this.player.forward(1000 * segundo);
	}

	/* (non-Javadoc)
	 * @see interfaces.FormatoAudio#retornar(int)
	 */
	@Override
	public void retornar(int segundo) {
        this.player.reward(segundo);
	}

	/* (non-Javadoc)
	 * @see interfaces.FormatoAudio#liberar()
	 */
	@Override
	public void liberar() {
        this.player = null;
	}

}
