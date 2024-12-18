public class ControladorDeLetrasJaDigitadas implements Cloneable
{
    private String letrasJaDigitadas;

    public ControladorDeLetrasJaDigitadas ()
    {
        // torna this.letrasJaDigitadas igual ao String vazio
        this.letrasJaDigitadas = "";
    }

    public boolean isJaDigitada (char letra)
    {
        // percorrer o String this.letrasJaDigitadas e verificar se ele
        // possui a letra fornecida, retornando true em caso afirmativo
        // ou false em caso negativo
        if (this.letrasJaDigitadas == null) {
            return false;
        }

        for(int i = 0; i < letrasJaDigitadas.length(); i++ ) {
            if (this.letrasJaDigitadas.charAt(i) == letra) {
                return true;
            }
        }

        return false;
    }

    public void registre (char letra) throws Exception
    {
        // verifica se a letra fornecida ja foi digitada (pode usar
        // o m�todo this.isJaDigitada, para isso), lancando uma exce��o
        // em caso afirmativo.
        // concatena a letra fornecida a this.letrasJaDigitadas.
        if (isJaDigitada(letra)) {
            throw new Exception("Palavra ja digitada");
        } else {
            this.letrasJaDigitadas += letra;
        }
    }
    
    @Override
    public String toString ()
    {
		// retorna um String com TODAS as letras presentes em
		// this.letrasJaDigitadas separadas por v�rgula (,).

        StringBuilder listaDigitadas = new StringBuilder();
        for(int i = 0; i < letrasJaDigitadas.length(); i++ ){
            listaDigitadas.append(letrasJaDigitadas.charAt(i));
            if(i < letrasJaDigitadas.length() - 1){
                listaDigitadas.append(",");
            }
        }

        return listaDigitadas.toString();
    }

    @Override
    public boolean equals (Object obj)
    {
       // verificar se this e obj s�o iguais
        if(obj == null) return false;
        if(obj == this) return true;
        if(obj.getClass() != this.getClass()) return false;

        ControladorDeLetrasJaDigitadas other = (ControladorDeLetrasJaDigitadas) obj;
        if (this.letrasJaDigitadas.length() != other.letrasJaDigitadas.length()) return false;
        return true;
    }

    @Override
    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
        int ret = 1;
        ret = ret* 2 + String.valueOf(this.letrasJaDigitadas).hashCode();
        return ret;
    }

   public ControladorDeLetrasJaDigitadas(ControladorDeLetrasJaDigitadas controladorDeLetrasJaDigitadas) throws Exception // construtor de c�pia
    {
        // copiar c.letrasJaDigitadas em this.letrasJaDigitadas
        if(controladorDeLetrasJaDigitadas == null) throw new Exception("Controlador de letras já digitadas inválido");
        this.letrasJaDigitadas = controladorDeLetrasJaDigitadas.letrasJaDigitadas;
    }

    @Override
    public Object clone ()
    {
        // criar uma c�pia do this com o construtor de c�pia e retornar
        ControladorDeLetrasJaDigitadas other = null;
        try{
            other = new ControladorDeLetrasJaDigitadas(this);
        }catch(Exception e){}

        return other;
    }
}
