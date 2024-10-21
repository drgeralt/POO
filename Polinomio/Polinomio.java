package Polinomio;

import java.util.ArrayList;

public class Polinomio {
    ArrayList<Termo> termos = new ArrayList<>();
    Polinomio(Termo objeto){
        termos.add(objeto);
    }
    void insere(Termo objeto){
        for(Termo termo : termos) {
            if (objeto.expoente == termo.expoente) {
                termo.coeficiente += objeto.coeficiente;
                return;
            }
        }
        termos.add(objeto);
    }
    int calcula(int x){
        int resultado = 0;
        for(Termo termo : termos){
            resultado += (int) (termo.coeficiente*Math.pow(x,termo.expoente));
        }
        return resultado;
    }
    void fusao(Polinomio recebido){
        for(Termo termo : recebido.termos){
            this.insere(termo);
        }
    }
}
