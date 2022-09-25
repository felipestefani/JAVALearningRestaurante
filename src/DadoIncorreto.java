public class DadoIncorreto extends  Exception{
    public DadoIncorreto(){
        super();
    }

    public DadoIncorreto(String dado){
        super(dado);
    }

    public String toString(){
        return "Aconteceu isso -> " + this.getClass().getName() + "\n" + " Mensagem: " + this.getMessage() + "\n";
    }
}
