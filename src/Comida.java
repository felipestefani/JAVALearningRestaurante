public abstract class Comida implements Comparable<Comida>{
    private String nome;
    private Double valor;
    private Double calorias;

    public Comida(String nome, Double valor, Double calorias) {
        this.nome = nome;
        this.valor = valor;
        this.calorias = calorias;
    }

    @Override
    public int compareTo(Comida c){
        if(this.getValor() == c.getValor()){
            return 0;
        } else if (this.getValor() < c.getValor()){
            return -1;
        } else {
            return 1;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getCalorias() {
        return calorias;
    }

    public void setCalorias(Double calorias) {
        this.calorias = calorias;
    }
}
