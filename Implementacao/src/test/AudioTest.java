package test;

import org.junit.jupiter.api.Test;
import concrect.FormatoAudioFacade;
import concrect.FormatoAudioFactory;
import interfaces.FormatoAudio;

/**
 * @authors Gustavo Henrique Spiess, Gustavo Korbes Heinen, Luciane Tedesco e
 *          Matheus Mahnke
 *
 */
class AudioTest {

	private FormatoAudio audio;
	private FormatoAudioFacade audioModoSimples;

	private final String arquivoAIFF = "abc.aiff";
	private final String arquivoWAV = "abc.wav";
	private final String arquivoWMA = "abc.wma";
	private final String arquivoACC = "abc.acc";
	private final String arquivoMP3DJ = "abc.mp3dj";

	@Test
	public void testArquivoAIFF() {
		audio = FormatoAudioFactory.getExtensaoAudio(arquivoAIFF);
		audio.abrir(arquivoAIFF);
		audio.reproduzir();
		audio.pausar();
		audio.parar();
		audio.avancar(5);
		audio.retornar(5);
		audio.liberar();

		audioModoSimples = new FormatoAudioFacade();
		audioModoSimples.reproduzirSimples(arquivoAIFF);
		audioModoSimples.pararSimples();
	}

	@Test
	public void testArquivoWAV() {
		audio = FormatoAudioFactory.getExtensaoAudio(arquivoWAV);
		audio.abrir(arquivoWAV);
		audio.reproduzir();
		audio.pausar();
		audio.parar();
		audio.avancar(5);
		audio.retornar(5);
		audio.liberar();

		audioModoSimples = new FormatoAudioFacade();
		audioModoSimples.reproduzirSimples(arquivoWAV);
		audioModoSimples.pararSimples();
	}

	@Test
	public void testArquivoWMA() {
		audio = FormatoAudioFactory.getExtensaoAudio(arquivoWMA);
		audio.abrir(arquivoWMA);
		audio.reproduzir();
		audio.pausar();
		audio.parar();
		audio.avancar(5);
		audio.retornar(5);
		audio.liberar();

		audioModoSimples = new FormatoAudioFacade();
		audioModoSimples.reproduzirSimples(arquivoWMA);
		audioModoSimples.pararSimples();
	}

	@Test
	public void testArquivoACC() {
		audio = FormatoAudioFactory.getExtensaoAudio(arquivoACC);
		audio.abrir(arquivoACC);
		audio.reproduzir();
		audio.pausar();
		audio.parar();
		audio.avancar(5);
		audio.retornar(5);
		audio.liberar();

		audioModoSimples = new FormatoAudioFacade();
		audioModoSimples.reproduzirSimples(arquivoACC);
		audioModoSimples.pararSimples();
	}

	@Test
	public void testArquivoMP3DJ() {
		audio = FormatoAudioFactory.getExtensaoAudio(arquivoMP3DJ);
		audio.abrir(arquivoMP3DJ);
		audio.reproduzir();
		audio.pausar();
		audio.parar();
		audio.avancar(5);
		audio.retornar(5);
		audio.liberar();

		audioModoSimples = new FormatoAudioFacade();
		audioModoSimples.reproduzirSimples(arquivoMP3DJ);
		audioModoSimples.pararSimples();
	}

}