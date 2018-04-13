/**
 * 
 */
package concrect;

import interfaces.FormatoAudio;
import problema1.AIFFSuperPlayer;

/**
 * @author Luciane
 *
 */
public class FormatoAIFF /*extends AIFFSuperPlayer*/ implements FormatoAudio {

    private AIFFSuperPlayer player;
    private int cursor = 0;
	/**
	 * @param file
	 */
	public FormatoAIFF() {
	}

	/* (non-Javadoc)
	 * @see interfaces.FormatoAudio#abrir(java.lang.String)
	 */
	@Override
	public void abrir(String audio) {
        this.player = new AIFFSuperPlayer(audio);
	}

	/* (non-Javadoc)
	 * @see interfaces.FormatoAudio#reproduzir()
	 */
	@Override
	public void reproduzir() {
        this.player.setCursor(this.cursor);
        this.player.play();
	}

	/* (non-Javadoc)
	 * @see interfaces.FormatoAudio#pausar()
	 */
	@Override
	public void pausar() {
        this.cursor = this.player.pause();
	}

	/* (non-Javadoc)
	 * @see interfaces.FormatoAudio#parar()
	 */
	@Override
	public void parar() {
        this.player.stop();
        this.cursor = 0;
	}

	/* (non-Javadoc)
	 * @see interfaces.FormatoAudio#avancar(int)
	 */
	@Override
	public void avancar(int segundo) {
        this.pausar();
        this.cursor += segundo;
        if (this.cursor < 0){
            this.cursor = 0;
        }
        this.reproduzir();
	}

	/* (non-Javadoc)
	 * @see interfaces.FormatoAudio#retornar(int)
	 */
	@Override
	public void retornar(int segundo) {
        int negSegundos = segundo * -1;
        this.avancar(negSegundos);
	}

	/* (non-Javadoc)
	 * @see interfaces.FormatoAudio#liberar()
	 */
	@Override
	public void liberar() {
        this.player.release();
	}

}
