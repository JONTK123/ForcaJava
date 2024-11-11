public class ControladorDeErros implements Cloneable {
    private int qtdMax, qtdErr = 0;

    public ControladorDeErros(int qtdMax) throws Exception {
        if (qtdMax <= 0) throw new Exception("Quantidade inválida");

        this.qtdMax = qtdMax;
    }

    public void registreUmErro() throws Exception {
        if (this.qtdErr == this.qtdMax) throw new Exception("Errou além do máximo");

        this.qtdErr++;
    }

    public boolean isAtingidoMaximoDeErros() {
        return this.qtdErr == this.qtdMax;
    }

    public String toString() {
        return this.qtdErr + "/" + this.qtdMax;
    }

    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj.getClass() != this.getClass()) return false;

        ControladorDeErros other = (ControladorDeErros) obj;
        return this.qtdMax == other.qtdMax && this.qtdErr == other.qtdErr;
    }

    public int hashCode() {
        int ret = 17;
        ret = 31 * ret + this.qtdMax;
        ret = 31 * ret + this.qtdErr;
        return ret;
    }

    public ControladorDeErros(ControladorDeErros c) throws Exception {
        if (c == null) throw new Exception("Objeto nulo");

        this.qtdMax = c.qtdMax;
        this.qtdErr = c.qtdErr;
    }

    public Object clone() {
        ControladorDeErros ret = null;
        try {
            ret = new ControladorDeErros(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }
}
