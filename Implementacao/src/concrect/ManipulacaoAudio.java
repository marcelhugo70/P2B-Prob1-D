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

	public ManipulacaoAudio() {
	}

	@Override
	public void abrir(String audio) {
        if (audio.toUpperCase().endsWith(".AIFF")){
            this.player = new FormatoAIFF();
        } else if (audio.toUpperCase().endsWith(".WAV")){
            this.player = new FormatoWAV();
        } else if (audio.toUpperCase().endsWith(".WMA")){
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

}
