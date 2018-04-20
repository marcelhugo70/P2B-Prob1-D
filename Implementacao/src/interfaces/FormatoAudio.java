package interfaces;

/**
 * @authors Gustavo Henrique Spiess, Gustavo Korbes Heinen, Luciane Tedesco e
 *          Matheus Mahnke
 *
 */
public interface FormatoAudio {

    /**
     * O método abrir(String) carrega um arquivo de áudio na memória, recebendo como parâmetro o nome do arquivo.
     * 
     * @param audio Nome do arquivo.
     */
    public void abrir(String audio);

    /**
     * O método reproduzir() reproduz o arquivo de áudio que foi carregado na memória pelo método abrir(). A reprodução
     * ocorre a partir do início do arquivo (na primeira vez) ou no ponto onde a reprodução tenha sido pausada.
     */
    public void reproduzir();

    /**
     * O método pausar() para a reprodução do arquivo.
     */
    public void pausar();

    /**
     * O método parar() para a reprodução e retorna para o início do arquivo.
     */
    public void parar();

    /**
     * O método avançar(int) recebe como parâmetro a quantidade de segundos que devem ser avançados no arquivo a partir
     * do ponto atual.
     * 
     * @param segundo Quantidade de segundos que devem ser avançados.
     */
    public void avancar(int segundo);

    /**
     * O método retornar(int) recebe como parâmetro a quantidade de segundos que devem ser retrocedidos no arquivo a
     * partir do ponto atual.
     * 
     * @param segundo Quantidade de segundos que devem ser retrocedidos.
     */
    public void retornar(int segundo);

    /**
     * O método liberar() fecha o arquivo e libera a memória.
     */
    public void liberar();

}
