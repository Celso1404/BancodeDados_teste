public class Vetorteste {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("João");
        Aluno a2 = new Aluno("Matheus");

        Vetor lista = new Vetor();

        lista.adiciona(2, a1);
        System.out.println(lista);

    }
}
