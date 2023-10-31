public class TesteFuncionario {
    public static void main(String[] args) {
        double aumento = 1.5;
        String nome;
        Funcionario f1 = new Funcionario("bruno", 2023, 1.500, "Profesor", "Tecnologia");

        nome = f1.getNome();

        System.out.println("O primeiro nome é: " + nome);

        f1.setNome("Dhyego");

        System.out.println("O segundo nome é: " + f1.getNome());

        double aumento1 = f1.darAumento();
        System.out.println("Aumento 1: " + aumento1);

        double aumento2 = f1.darAumentoIndividual(aumento);
        System.out.println("Aumento 1: " + aumento2);

    }
}
