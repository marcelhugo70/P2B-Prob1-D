/**
 * 
 */
package concrect;

import interfaces.FormatoAudio;
import problema1.wmaPlay;

/**
 * @author Luciane
 *
 */
public class FormatoWMA /*extends wmaPlay */implements FormatoAudio {

    private wmaPlay player = null;
    
	/**
	 * 
	 */
	public FormatoWMA() {
        this.player = new wmaPlay();
	}

	/* (non-Javadoc)
	 * @see interfaces.FormatoAudio#abrir(java.lang.String)
	 */
	@Override
	public void abrir(String audio) {
        this.player.setFile(audio);
        this.player.open();
        this.player.setLocation(0);
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
        this.player.stop();
	}

	/* (non-Javadoc)
	 * @see interfaces.FormatoAudio#parar()
	 */
	@Override
	public void parar() {
        this.pausar();
        this.player.setLocation(0);
	}

	/* (non-Javadoc)
	 * @see interfaces.FormatoAudio#avancar(int)
	 */
	@Override
	public void avancar(int segundo) {
        int posicao = this.getLocation();
        posicao += segundo;
        if (posicao < 0){
            posicao = 0;
        }
        this.player.setLocation(posicao);
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
        this.player = null;
	}

}
