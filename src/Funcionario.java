public abstract class Funcionario {
    private String nome;
    private int numeroContratacao;

    public Funcionario(String nome, int numeroContratacao){
        this.nome = nome;
        this.numeroContratacao = numeroContratacao;
    };

    public Double receberSalario(Double valor){
        return 1.0;
    };

    public String getNome() {
        return nome;
    }

    public int getNumeroContratacao() {
        return numeroContratacao;
    }
}
