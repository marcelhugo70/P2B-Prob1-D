
package concrect;

import interfaces.FormatoAudio;

/**
 * @authors Gustavo Henrique Spiess, Gustavo Korbes Heinen, Luciane Tedesco e
 *          Matheus Mahnke
 *
 */
public class FormatoAudioFactory {

	public static FormatoAudio getExtensaoAudio(String audio) {
		
		if (audio.toLowerCase().endsWith(".wma")) {
			return new FormatoWMA();
		} else if (audio.toLowerCase().endsWith(".aiff")) {
			return new FormatoAIFF();
		} else if (audio.toLowerCase().endsWith(".wav")) {
			return new FormatoWAV();
		} else if (audio.toLowerCase().endsWith(".acc")) {
			return new FormatoAAC();
		} else if (audio.toLowerCase().endsWith(".mp3dj")) {
			return new FormatoMP3DJ();
		}

		throw new IllegalArgumentException("Formato de áudio não suportado");
	}

}
