import java.util.ArrayList;

public class Garcom extends Funcionario{

    private ArrayList<String> listaComidasPedidas = new ArrayList<>();
    private Double valorConta;
    public Garcom(String nome, int numeroContratacao) {
        super(nome, numeroContratacao);
        valorConta = 0.;
    }

    public void anotarPedido(Comida comida){
        listaComidasPedidas.add(comida.getNome());
        valorConta += comida.getValor();
    }

    public void mostrarPedido(){
        System.out.println(listaComidasPedidas);
    }

    public void trazerConta(){
        System.out.println("A conta deu: R$" + valorConta);
    }
}
