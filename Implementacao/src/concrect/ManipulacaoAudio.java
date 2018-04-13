/**
 * 
 */
package concrect;

import interfaces.FormatoAudio;

/**
 * @author Luciane
 *
 */
public class ManipulacaoAudio implements FormatoAudio {

    private FormatoAudio player;

	/**
	 * 
	 */
	public ManipulacaoAudio() {
	}

	/* (non-Javadoc)
	 * @see interfaces.FormatoAudio#abrir(java.lang.String)
	 */
	@Override
	public void abrir(String audio) {
        if (audio.matches("\\.AIFF$")){
            this.player = new FormatoAIFF();
        } else if (audio.matches("\\.WAV$")){
            this.player = new FormatoWAV();
        } else if (audio.matches("\\.WMA$")){
            this.player = new FormatoWMA();
        }
        this.player.abrir(audio);
	}

	/* (non-Javadoc)
	 * @see interfaces.FormatoAudio#reproduzir()
	 */
	@Override
	public void reproduzir() {
        this.player.reproduzir();

	}

	/* (non-Javadoc)
	 * @see interfaces.FormatoAudio#pausar()
	 */
	@Override
	public void pausar() {
        this.player.pausar();
	}

	/* (non-Javadoc)
	 * @see interfaces.FormatoAudio#parar()
	 */
	@Override
	public void parar() {
        this.player.parar();
	}

	/* (non-Javadoc)
	 * @see interfaces.FormatoAudio#avancar(int)
	 */
	@Override
	public void avancar(int segundo) {
        this.player.avancar(segundo);
	}

	/* (non-Javadoc)
	 * @see interfaces.FormatoAudio#retornar(int)
	 */
	@Override
	public void retornar(int segundo) {
        this.player.retornar(segundo);
	}

	/* (non-Javadoc)
	 * @see interfaces.FormatoAudio#liberar()
	 */
	@Override
	public void liberar() {
        this.player.liberar();
	}

}
