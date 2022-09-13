import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Cardapio {
    private List<Comida> comidas = new ArrayList();

    public Cardapio(){};

    public void adicionarComida(Comida comida){
        comidas.add(comida);
    };

    public void mostrarCardapio(){
        Collections.sort(comidas);
        if(comidas.isEmpty()){
            System.out.println("Não há comidas no cardápio");
        } else{
            for(Comida comida: comidas){
                System.out.println(comida.getNome() + " | Valor: " + comida.getValor() + " | Calorias: " + comida.getCalorias());
            }
        }
    }

    public List<Comida> getComidas() {
        return comidas;
    }
}
