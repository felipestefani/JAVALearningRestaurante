import javax.sound.midi.Soundbank;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner entradaDeDados = new Scanner(System.in); // cria um scanner que será utilizado para a entrada de dados

            System.out.println("\nSeja bem-vindo ao JAVA Learning Restaurant. Vamos aprender um pouco sobre Programação Orientada a objetos " +
                    "enquanto nos deliciamos com alguns tira-gostos");
            System.out.print("Pressione uma tecla para continuar!! ️️");
            entradaDeDados.nextLine();

            System.out.print("\nPrimeiramente, irei me apresentar! \nSerei seu guia por essa jornada gastronômica e me chamo Houser. \nQual é o seu nome? ");
            String nomeUsuario = entradaDeDados.nextLine(); //solicita o nome do usuário
            System.out.println("\nMuito bem, " + nomeUsuario + "! Espero que você se divirta!!\n");
            //TimeUnit.SECONDS.sleep(2);

            System.out.println("Utilizaremos o Scanner para permitir a entrada de dados por meio dos usuários nos nossos programas.");
            //TimeUnit.SECONDS.sleep(2);
            System.out.println("Realizamos uma instância da seguinte forma:\n   Scanner 'nomeDaVariavel' = new Scanner(System.in);\n");
            //TimeUnit.SECONDS.sleep(4);

            System.out.println("Criaremos então uma instancia de nosso restaurante, " + nomeUsuario + ".\nSeremos o dono dele!! Assim poderemos fazer as " +
                    "modificações necessárias em nossas classes e objetos.");
            //TimeUnit.SECONDS.sleep(3);

            System.out.print("Qual nome você deseja dar ao restaurante? ");
            String nomeDoRestaurante = entradaDeDados.nextLine();
            Restaurante restaurante = new Restaurante(nomeDoRestaurante); // instanciamos a Classe Restaurante.
            //TimeUnit.SECONDS.sleep(1);

            System.out.println("\nParabéns! Você acabou de criar o restaurante " + restaurante.getNome() + "! \nPor trás dos panos, foi realizado uma instância da Classe Restaurante " +
                    "da seguinte forma:\n   Restaurante restaurante = new Restaurante('nomeDadoAoRestaurante');\n");
            //TimeUnit.SECONDS.sleep(5);

            System.out.println("Vamos agora criar alguns funcionários para o nosso restaurante.\n");
            //TimeUnit.SECONDS.sleep(3);
            System.out.println("\nTemos 2 tipos de funcionários em nosso restaurante: o Chef e os garçons. \nPorém, eles tem algumas propriedades em comum " +
                    "e por isso, vamos criar uma CLASSE ABSTRATA Funcionario, \nda qual as funçoes específicas herdarão esses atributos.");
            //TimeUnit.SECONDS.sleep(5);

            System.out.println("\nA classe abstrata Funcionários possui os atributos privados: nome e número de contratação. \nE também possui um método " +
                    "para receber o salário, que será sobreescrito em suas classes filhas.");
            //TimeUnit.SECONDS.sleep(3);

            System.out.println("\nPrimeiro, " + nomeUsuario + ", vamos 'contratar' (instanciar a Classe) o chef do " + restaurante.getNome() + ".\n");
            System.out.print("Qual é o nome do Chef contratado? ");
            String nomeChefe = entradaDeDados.nextLine();
            System.out.println("\nMuito bem. Darei, para te ajudar, o numero de contratação: 1, já que é nosso primeiro contratado.\n");
            Chef chef = new Chef(nomeChefe, 1);
            //TimeUnit.SECONDS.sleep(4);

            System.out.println("Voi lá! 'Contratamos' nosso primeiro funcionário, da Classe Chef, " + nomeUsuario + ". \nEle(a) é o(a): " + chef.getNome()
                    + " e tem o número de contratação: " + chef.getNumeroContratacao() + ".");
            //TimeUnit.SECONDS.sleep(4);

            System.out.println("\n Agora que já temos um chefe, vamos criar algumas comidas para que possam ser servidas em nosso restaurante.");
            System.out.println("\n Da mesma forma que criamos uma classe abstrata para o funcinário, teremos alguns tipos de comidas, e por isso \n" +
                    "criaremos uma classe abstrata.");
            System.out.println("\nA classe comida não pode ser instanciada e criaremos as classes filhas que herdarão os atributos em comum.");
            //TimeUnit.SECONDS.sleep(6);

            System.out.print("\n Temos 3 tipos de comida: lanche, salgado e doce" + nomeUsuario + ".\n Qual você deseja criar? ");
            String tipoComida = entradaDeDados.nextLine();
            System.out.print("Qual é o nome do " + tipoComida + " que você deseja criar? ");
            String nomeComida = entradaDeDados.nextLine();
            System.out.print("Quanto você deseja cobrar por esse " + tipoComida + "? ");
            Double valorComida = entradaDeDados.nextDouble();
            System.out.print("Insira um valor de número de calorias para o seu " + tipoComida + ": ");
            Double caloriasComida = entradaDeDados.nextDouble();

            if ("lanche".equals(tipoComida.toLowerCase())) {
                Lanche comida1 = new Lanche(nomeComida, valorComida, caloriasComida);
                System.out.println("\nLanche criado - nome: " + comida1.getNome() + ", valor: " + comida1.getValor() + ", calorias: " + comida1.getCalorias() + ".");
            } else if ("salgado".equals(tipoComida.toLowerCase())) {
                Salgado comida1 = new Salgado(nomeComida, valorComida, caloriasComida);
                System.out.println("\nSalgado criado - nome: " + comida1.getNome() + ", valor: " + comida1.getValor() + ", calorias: " + comida1.getCalorias() + ".");
            } else if ("doce".equals(tipoComida.toLowerCase())) {
                Doce comida1 = new Doce(nomeComida, valorComida, caloriasComida);
                System.out.println("\nDoce criado - nome: " + comida1.getNome() + ", valor: " + comida1.getValor() + ", calorias: " + comida1.getCalorias() + ".");
            } else {
                throw new DadoIncorreto("Esse tipo de comida não existe!");
            }
            //TimeUnit.SECONDS.sleep(3);

            System.out.println("\n Muito bem, " + nomeUsuario + "!!! Você criou a primeira comida do nosso restaurante, " +
                    "instanciando a Classe " + tipoComida.substring(0, 1).toUpperCase() + tipoComida.substring(1) + ".");
            //TimeUnit.SECONDS.sleep(5);
            System.out.println("\nEssa classe, assim como as outras duas fizeram herança da Classe Comida utilizando o 'extends'!!!");
            System.out.println("\nInteressante, né?!?!");
            System.out.println("\nHerança é um dos paradigmas da Programação Orientada a Objetos!\n");
            //TimeUnit.SECONDS.sleep(4);

            System.out.println("\nPara te auxiliar eu criarei mais algumas comidas para nosso restaurante!");
            System.out.println("\nSó um instante... ");
            Lanche hambuguerX = new Lanche("XBurguer", 10., 140.);
            Lanche hamburguerM = new Lanche("MBurguer", 15., 170.);
            Lanche hamburguerL = new Lanche("LBurguer", 20., 200.);
            Doce petitGateau = new Doce("Petit Gateau", 23., 345.);
            Salgado coxinha = new Salgado("Coxinha", 7., 180.);
            //TimeUnit.SECONDS.sleep(6);

            System.out.println("\nProntinho, " + nomeUsuario + "! Vamos agora criar (instanciar a Classe) Cardapio, para podermos adicionar nossas comidas \n" +
                    "em um único lugar e também podermos realizar nossos pedidos.");
            System.out.println("\n Só mais um instante...️");
            Cardapio cardapio = new Cardapio(); //instanciamos a classe Cardapio

            System.out.println("\nFeito! A classe Cardápio implementa o conceito de Collections.");
            System.out.println("\nNela podemos utilizar alguns métodos específicos de Coleções, como sort, por exemplo.");

            System.out.println("\nAlém disso, criamos uma lista dentro da Classe, para podermos apresentar de maneira mais fácil\n " +
                    "as comidas adicionadas. Veremos em seguida!");
            // TimeUnit.SECONDS.sleep(5);

            System.out.println("\nVamos ver nosso cardápio. Para isso, utilizaremos o método mostrarCardapio(). ");
            cardapio.mostrarCardapio();
            //TimeUnit.SECONDS.sleep(4);

            System.out.println("\nO que podemos perceber?\nNão há nenhuma comida inserida em nosso cardápio ainda ");
            //TimeUnit.SECONDS.sleep(3);
            System.out.println("\nVamos então adicionar as comidas em nosso cardápio. Qual método de List utilizamos para isso, você sabe (digite ele aqui)? ");
            String metodoAdicionar = entradaDeDados.nextLine();

            if (metodoAdicionar.toLowerCase().equals("add") || metodoAdicionar.toLowerCase().equals("add()")) {
                System.out.println("\nMUUUUITO BEM! Vamos entao utilizá-lo! Farei a adição, tudo bem, " + nomeUsuario + "?");
            } else {
                System.out.println("\nO método de List é o add(). Vamos entao utilizá-lo! Farei a adição, tudo bem, " + nomeUsuario + "?");
            }
            System.out.println("\nAdicionando comidas ao cardápio! ️\n");

            cardapio.adicionarComida(hambuguerX);
            cardapio.adicionarComida(coxinha);
            cardapio.adicionarComida(hamburguerL);
            cardapio.adicionarComida(hamburguerM);
            cardapio.adicionarComida(petitGateau);
            System.out.println("\nPronto! Agora que adicionamos algumas comidas no cardápio, vamos apresentá-lo novamente!\n");
            cardapio.mostrarCardapio();

            System.out.println("\n");
            System.out.println("\nAqui está nosso cardápio. Então já podemos pedir para prepararem nossa comida ");
            System.out.println(nomeUsuario + ", esquecemos de contratar um garçom para anotar nossos pedidos! Vamos fazer isso\n");

            System.out.print("\nQual o nome do garçom que você deseja contratar? ");
            String nomeGarcom = entradaDeDados.nextLine(); // atribuindo o nome do garçom
            Garcom garcom = new Garcom(nomeGarcom, 2); //instanciando a Classe Garcom
            System.out.println("\nDe novo conseguimos, " + nomeUsuario + "! Contratamos (instanciamos a Classe) o garçom");
            System.out.println("\nEle(a) se chama: " + garcom.getNome() + ", e o numero de contratação dele é: " + garcom.getNumeroContratacao());

            System.out.println("\nVamos então fazer um pedido. Pedirei para você, " + nomeUsuario + ", uma coxinha e um petit gateau, tudo bem?");
            System.out.println("\nPara isso utilizarei o método anotarPedido(), incluso na classe Garcom!");
            garcom.anotarPedido(coxinha);
            garcom.anotarPedido(petitGateau);

            System.out.println("\nPedido feito! Vamos ver como o " + garcom.getNome() + " anotou!!");
            garcom.mostrarPedido();


            int opcao = 0, idPrato;


            while (opcao < 1 || opcao > 3) {
                System.out.println("Agora escolha o que deseja fazer");
                System.out.println("1-)Adicionar um prato ao cartapio");
                System.out.println("2-)Pedir um prato do cartapio");
                System.out.println("Ou\n3-)Fechar a conta");
                opcao = entradaDeDados.nextInt();
                String nomePrato;

                if (opcao == 1) {
                    System.out.println("Digite o nome do prato: ");
                    entradaDeDados.nextLine();
                    nomePrato = entradaDeDados.nextLine();
                    System.out.println("Digite o valor do prato: ");
                    Double valorPrato = Double.parseDouble(entradaDeDados.nextLine());
                    System.out.println("Digite as calorias do prato: ");
                    Double caloriasPrato = Double.parseDouble(entradaDeDados.nextLine());
                    Lanche comidaNova = new Lanche(nomePrato, valorPrato, caloriasPrato);
                    cardapio.adicionarComida(comidaNova);
                    System.out.println("Seu prato: " + nomePrato + " foi adicionado com sucesso! \n o que deseja fazer agora?");
                    opcao = 0;
                } else if (opcao == 2) {
                    System.out.println("Qual refeição deseja pedir?(digite o numero)");
                    cardapio.mostrarCardapio();
                    idPrato = entradaDeDados.nextInt();
                    garcom.anotarPedido(cardapio.getComidas().get(idPrato));
                    System.out.println("Prontinho, o garçom anotou seu pedido: " + cardapio.getComidas().get(idPrato).getNome());
                    System.out.println("Deseja fazer o que agora? ");
                    opcao = 0;
                } else if (opcao == 3) {
                    System.out.println("\nAgora que já comemos e estamos satisfeitos, vamos pedir a conta! \n");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("\nGARÇOOOOOM, TRAZ A COOONTA\n");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("\nBrincadeiras a parte, vamos utilizar agora o método trazerConta()");
                    TimeUnit.SECONDS.sleep(5);

                    System.out.println("Deseja dividir a conta entre quantas pessoas? ");
                    int pessoas = entradaDeDados.nextInt();
                    if (pessoas == 1) {
                        garcom.trazerConta();
                    } else if (pessoas > 1) {
                        garcom.trazerConta(pessoas);
                    } else {
                        throw new RuntimeException("Digite um valor válido " + nomeUsuario + "!!");
                    }
                    TimeUnit.SECONDS.sleep(3);

                    TimeUnit.SECONDS.sleep(4);

                    System.out.println(nomeUsuario + ", infelizmente nossa jornada está chegando ao fim!\n");
                    System.out.println("\nAinda há muito o que aprimorarmos, mas espero que essa experiencia tenha te ajudado um pouco ️");
                    System.out.println("\nAté a próxima!");
                } else {
                    System.out.println("Opção errada campeão! tenta de novo!");
                    opcao = 0;
                }
            }


        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } catch (InputMismatchException exception) {
            System.err.println("Voce inseriu um tipo de dado incorreto!");
        } catch (NumberFormatException exception) {
            System.err.println("Voce inseriu um tipo de dado incorreto!");
        } catch (DadoIncorreto exception) {
            System.err.println(exception.getMessage());
        }

    }
}
