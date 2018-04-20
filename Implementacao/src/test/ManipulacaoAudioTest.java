package test;

import org.junit.jupiter.api.Test;

import concrect.ManipulacaoAudio;

/**
 * @authors Gustavo Henrique Spiess, Gustavo Korbes Heinen, Luciane Tedesco e
 *          Matheus Mahnke
 *
 */
class ManipulacaoAudioTest extends ManipulacaoAudio {

	private ManipulacaoAudio audio = new ManipulacaoAudio();

	private final String arquivoAIFF = "abc.aiff";
	private final String arquivoWAV = "abc.wav";
	private final String arquivoWMA = "abc.wma";

	@Test
	public void testArquivoAIFF() {
		audio.abrir(arquivoAIFF);
		audio.reproduzir();
		audio.pausar();
		audio.parar();
		audio.avancar(5);
		audio.retornar(5);
		audio.liberar();
		audio.reproduzirSimples(arquivoAIFF);
		audio.pararSimples();
	}

	@Test
	public void testArquivoWAV() {
		audio.abrir(arquivoWAV);
		audio.reproduzir();
		audio.pausar();
		audio.parar();
		audio.avancar(5);
		audio.retornar(5);
		audio.liberar();
		audio.reproduzirSimples(arquivoWAV);
		audio.pararSimples();
	}

	@Test
	public void testArquivoWMA() {
		audio.abrir(arquivoWMA);
		audio.reproduzir();
		audio.pausar();
		audio.parar();
		audio.avancar(5);
		audio.retornar(5);
		audio.liberar();
		audio.reproduzirSimples(arquivoWMA);
		audio.pararSimples();
	}

}