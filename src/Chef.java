public class Chef extends Funcionario{

    public Chef(String nome, int numeroContratacao) {
        super(nome, numeroContratacao);
    }

    @Override
    public Double receberSalario(Double valor){
        return 100.00 + valor;
    }
}
