package Polinomio;

public class Main {
    public static void main(String[] args) {
        //teste do construtor da classe Termo ok
        Termo novo = new Termo(1,1);

        //teste do método calcula ok
        System.out.println("valor do polinomio novo é: " + novo.calcula(2));
        Termo teste = new Termo(2,2);
        //teste do método insere ok
        novo.insere(teste);
        System.out.println("valor do polinomio novo é: " + novo.calcula(2));

        Termo testeNovo = new Termo(2,3);

        //teste construtor polinomio
        Polinomio polinomio1 = new Polinomio(novo);
        //teste do metodo calcula
        System.out.println("valor do polinomio1 é: " + polinomio1.calcula(2));

        Polinomio polinomio2 = new Polinomio(testeNovo);
        System.out.println("valor do polinomio 2 é: " + polinomio2.calcula(2));
        polinomio1.fusao(polinomio2);
        for(Termo termo : polinomio1.termos){
            System.out.println("valor de um termo de polinomio 1: " + termo.calcula(2));
        }
        System.out.println("valor do polinomio 1 é: " + polinomio1.calcula(2));

    }
}
