package Polinomio;

import java.util.ArrayList;

public class Polinomio {
    ArrayList<Termo> termos = new ArrayList<>();
    Polinomio(Termo objeto){
        termos.add(objeto);
    }
    void insere(Termo objeto){
        int teste = 0;
        for (int i = 0; i < termos.size(); i++) {
            if(termos.get(i).expoente== objeto.expoente) {
                termos.get(i).coeficiente = +objeto.coeficiente;
                teste = 1;
                continue;
            }
        }
        if (teste==0) {
            termos.add(objeto);
        }
    }
    int calcula(int x){
        int n=0;
        for (int i = 0; i < termos.size(); i++) {
            n=+(int)((int)termos.get(i).coeficiente*Math.pow(x,termos.get(i).expoente));
        }
        return n;
    }
    void fusao(Polinomio p2){
        for (int i = 0; i < p2.termos.size(); i++) {
            insere(p2.termos.get(i));
        }
    }
}
