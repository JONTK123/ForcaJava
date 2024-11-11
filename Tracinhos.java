public class Tracinhos implements Cloneable {
    private char texto[];

    public Tracinhos(int qtd) throws Exception {
        if (qtd <= 0) throw new Exception("Quantidade inválida");

        this.texto = new char[qtd];
        for (int i = 0; i < this.texto.length; i++) {
            this.texto[i] = '_';
        }
    }

    public void revele(int posicao, char letra) throws Exception {
        if (posicao < 0 || posicao >= this.texto.length) throw new Exception("Posição inválida");

        this.texto[posicao] = letra;
    }

    public boolean isAindaComTracinhos() {
        for (int i = 0; i < this.texto.length; i++) {
            if (this.texto[i] == '_') {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < this.texto.length; i++) {
            str.append(this.texto[i]);
            if (i < this.texto.length - 1) {
                str.append(" ");
            }
        }
        return str.toString();
    }

    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj.getClass() != this.getClass()) return false;

        Tracinhos other = (Tracinhos) obj;
        for (int i = 0; i < this.texto.length; i++) {
            if (this.texto[i] != other.texto[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int ret = 17;
        for (int i = 0; i < this.texto.length; i++) {
            ret = 31 * ret + Character.hashCode(this.texto[i]);
        }
        return ret;
    }

    public Tracinhos(Tracinhos t) throws Exception {
        if (t == null) throw new Exception("Objeto nulo");

        this.texto = new char[t.texto.length];
        for (int i = 0; i < t.texto.length; i++) {
            this.texto[i] = t.texto[i];
        }
    }

    public Object clone() {
        Tracinhos ret = null;
        try {
            ret = new Tracinhos(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }
}
