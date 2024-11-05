public class Palavra

//public class Palavra implements Comparable<Palavra>
{
    private String texto;

    public Palavra (String texto) throws Exception
    {
        // verifica se o texto recebido é nulo ou então vazio,
        // ou seja, sem nenhum caractere, lançando exceção.
        // armazena o texto recebido em this.texto.
        if (texto == null || texto.isEmpty()) {
            throw new Exception("Palavra vazia");
        }

        this.texto = texto;
    }

    public int getQuantidade (char letra) {
        // percorre o String this.texto, conta e retorna
        // quantas letras existem nele iguais a letra fornecida
        byte count = 0;

        for (int i = 0; i < this.texto.length(); i++) {
            if (this.texto.charAt(i) == letra) {
                count++;
            }
        }

        return count;
    }

    public int getPosicaoDaIezimaOcorrencia (int i, char letra) throws Exception
    {

        // se i==0, retorna a posicao em que ocorre a primeira
        // aparicao de letra fornecida em this.texto;
        // se i==1, retorna a posicao em que ocorre a segunda
        // aparicao de letra fornecida em this.texto;
        // se i==2, retorna a posicao em que ocorre a terceira
        // aparicao de letra fornecida em this.texto;
        // e assim por diante.
        // lançar excecao caso nao encontre em this.texto
        // a Iézima aparição da letra fornecida.

        int occurrenceCount = 0;

        for (int j = 0; j < this.texto.length(); j++) {
            if (this.texto.charAt(j) == letra) {
                if (occurrenceCount == i) {
                    return j;
                }
                occurrenceCount++;
            }
        }

        throw new Exception("Não foi encontrada a " + (i+1) + "ª ocorrência da letra '" + letra + "' em " + this.texto);
    }

    public int getTamanho ()
    {
        return this.texto.length();
    }
//
//    public String toString ()
//    {
//        return this.texto;
//    }
//
//    public boolean equals (Object obj)
//    {
//        // verificar se this e obj possuem o mesmo conteúdo, retornando
//        // true no caso afirmativo ou false no caso negativo
//    }
//
//    public int hashCode ()
//    {
//        // calcular e retornar o hashcode de this
//    }
//
//    public int compareTo (Palavra palavra)
//    {
//        return this.texto.compareTo(palavra.texto);
//    }
}
