package Polinomio;

import java.util.ArrayList;

public class Polinomio {
    ArrayList<Termo> termos = new ArrayList<>();
    Polinomio(Termo objeto){
        termos.set(objeto.expoente,objeto);
    }
    void insere(Termo objeto){
        try{
            termos.get(objeto.expoente);
            objeto.coeficiente=+termos.get(objeto.expoente).coeficiente;
            termos.set(objeto.expoente,objeto);
        } catch (IndexOutOfBoundsException e){
            termos.add(objeto);
        }
    }
    //int calcula(int x){

    //}
}
