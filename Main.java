public class Main {
    public static void main(String[] args) {
        try {
            // Testando a classe Palavra
            System.out.println("=== Testando Palavra ===");
            Palavra palavra = new Palavra("EXEMPLO");
            System.out.println("Tamanho da palavra: " + palavra.getTamanho());
            System.out.println("Quantidade de letras 'E': " + palavra.getQuantidade('E'));
            System.out.println("Palavra como string: " + palavra.toString());

            // Testando a classe ControladorDeErros
            System.out.println("\n=== Testando ControladorDeErros ===");
            ControladorDeErros controladorDeErros = new ControladorDeErros(3);
            controladorDeErros.registreUmErro();
            controladorDeErros.registreUmErro();
            System.out.println("Atingiu o máximo de erros? " + controladorDeErros.isAtingidoMaximoDeErros());
            System.out.println("Controlador de erros como string: " + controladorDeErros.toString());

            // Testando a classe ControladorDeLetrasJaDigitadas
            System.out.println("\n=== Testando ControladorDeLetrasJaDigitadas ===");
            ControladorDeLetrasJaDigitadas letrasJaDigitadas = new ControladorDeLetrasJaDigitadas();
            letrasJaDigitadas.registre('A');
            letrasJaDigitadas.registre('B');
            System.out.println("Letra 'A' já foi digitada? " + letrasJaDigitadas.isJaDigitada('A'));
            System.out.println("Letra 'C' já foi digitada? " + letrasJaDigitadas.isJaDigitada('C'));
            System.out.println("Letras já digitadas: " + letrasJaDigitadas.toString());

            // Testando a classe Tracinhos
            System.out.println("\n=== Testando Tracinhos ===");
            Tracinhos tracinhos = new Tracinhos(palavra.getTamanho());
            tracinhos.revele(0, 'E');
            tracinhos.revele(2, 'X');
            System.out.println("Estado dos tracinhos: " + tracinhos.toString());

            System.out.println("\nTodos os métodos foram testados com sucesso.");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
