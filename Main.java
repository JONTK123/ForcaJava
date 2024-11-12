public class Main {
    public static void main(String[] args) {
        try {
            // Testando a classe Palavra
            System.out.println("=== Testando Palavra ===");
            Palavra palavra = new Palavra("EXEMPLO");
            System.out.println("Tamanho da palavra: " + palavra.getTamanho());
            System.out.println("Quantidade de letras 'E': " + palavra.getQuantidade('E'));
            System.out.println("Palavra como string: " + palavra.toString());
            System.out.println("Posição da primeira ocorrência de 'E': " + palavra.getPosicaoDaIezimaOcorrencia(0, 'E'));
            System.out.println("Posição da segunda ocorrência de 'E': " + palavra.getPosicaoDaIezimaOcorrencia(1, 'E'));
            System.out.println("Palavra é igual a 'EXEMPLO'? " + palavra.equals(new Palavra("EXEMPLO")));
            System.out.println("Hash code da palavra: " + palavra.hashCode());

            // Testando a classe ControladorDeErros
            System.out.println("\n=== Testando ControladorDeErros ===");
            ControladorDeErros controladorDeErros = new ControladorDeErros(3);
            controladorDeErros.registreUmErro();
            controladorDeErros.registreUmErro();
            System.out.println("Atingiu o máximo de erros? " + controladorDeErros.isAtingidoMaximoDeErros());
            System.out.println("Controlador de erros como string: " + controladorDeErros.toString());
            System.out.println("Controlador de erros é igual a outro controlador com 3 erros? " + controladorDeErros.equals(new ControladorDeErros(3)));
            System.out.println("Hash code do controlador de erros: " + controladorDeErros.hashCode());

            // Testando a classe ControladorDeLetrasJaDigitadas
            System.out.println("\n=== Testando ControladorDeLetrasJaDigitadas ===");
            ControladorDeLetrasJaDigitadas letrasJaDigitadas = new ControladorDeLetrasJaDigitadas();
            letrasJaDigitadas.registre('A');
            letrasJaDigitadas.registre('B');
            System.out.println("Letra 'A' já foi digitada? " + letrasJaDigitadas.isJaDigitada('A'));
            System.out.println("Letra 'C' já foi digitada? " + letrasJaDigitadas.isJaDigitada('C'));
            System.out.println("Letras já digitadas: " + letrasJaDigitadas.toString());
            System.out.println("Controlador de letras já digitadas é igual a outro controlador? " + letrasJaDigitadas.equals(new ControladorDeLetrasJaDigitadas()));
            System.out.println("Hash code do controlador de letras já digitadas: " + letrasJaDigitadas.hashCode());

            // Testando a classe Tracinhos
            System.out.println("\n=== Testando Tracinhos ===");
            Tracinhos tracinhos = new Tracinhos(palavra.getTamanho());
            tracinhos.revele(0, 'E');
            tracinhos.revele(2, 'X');
            System.out.println("Estado dos tracinhos: " + tracinhos.toString());
            System.out.println("Ainda há tracinhos? " + tracinhos.isAindaComTracinhos());
            System.out.println("Tracinhos é igual a outro tracinhos? " + tracinhos.equals(new Tracinhos(palavra.getTamanho())));
            System.out.println("Hash code dos tracinhos: " + tracinhos.hashCode());

            System.out.println("\nTodos os métodos foram testados com sucesso.");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
            e.printStackTrace();
        }
    }
}