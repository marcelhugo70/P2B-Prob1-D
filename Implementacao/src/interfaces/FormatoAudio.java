package interfaces;


public interface FormatoAudio {
	
	public void abrir(String audio);
	
	public void reproduzir();
	
	public void pausar();
	
	public void parar();
	
	public void avancar(int segundo);
	
	public void retornar(int segundo);
	
	public void liberar();

}
