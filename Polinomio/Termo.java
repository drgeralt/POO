package Polinomio;

public class Termo {
    int coeficiente, expoente;
    Termo(int a, int b){
        coeficiente = a;
        expoente = b;
    }
    void insere(Termo dados){
        this.coeficiente = dados.coeficiente;
        this.expoente = dados.expoente;
    }
    int calcula(int valor){
        return (int) (this.coeficiente * Math.pow(valor,this.expoente));
    }
}
//tudo certo com essa classe
