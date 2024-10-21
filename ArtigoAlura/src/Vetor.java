import java.util.Arrays;

public class Vetor {
    private Aluno[] alunos = new Aluno[100];
    private int TotaldeAlunos = 0;

    public void adiciona(int posicao, Aluno aluno) {
        for (int i = TotaldeAlunos - 1; i >= posicao; i-=1) {
            alunos[i+1] = alunos[i];
            }
        alunos[TotaldeAlunos] = aluno;
        TotaldeAlunos++;
        }
    public Aluno pega(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        return alunos[posicao];
    }
    private boolean posicaoValida(int posicao) {
        return 
    }
    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < TotaldeAlunos;
    }
    public void remove(int posicao) {

    }
    public boolean contem(Aluno aluno) {
        for (int i = 0; i < TotaldeAlunos; i++) {
            if (alunos.equals(alunos[i])) {
                return true;
            }
        }
        return false;
    }
    public int tamanho() {
        return TotaldeAlunos;
    }
    public String toString() {
        return Arrays.toString(alunos);
    }
}