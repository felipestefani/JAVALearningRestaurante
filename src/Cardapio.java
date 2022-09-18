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
        int i = 0;
        Collections.sort(comidas);
        if(comidas.isEmpty()){
            System.out.println("Não há comidas no cardápio");
        } else{
            for(Comida comida: comidas){
                System.out.println(i + "-)" + comida.getNome() + " | Valor: " + comida.getValor() + " | Calorias: " + comida.getCalorias());
                i++;
            }
        }
    }

    public List<Comida> getComidas() {
        return comidas;
    }
}
