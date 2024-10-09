package Polinomio;

public class Main {
    public static void main(String[] args) {
        Termo n0 = new Termo(2,1);
        Termo n1 = new Termo();
        n1.insere(n0);
        Termo n2 = new Termo(2,2);
        Termo n3 = new Termo(2,4);
        System.out.println(n1.calcula(1));
        System.out.println(n2.calcula(2));
        System.out.println(n3.calcula(3));
        Polinomio p1 = new Polinomio(n1);
        Polinomio p2 = new Polinomio(n0);
        System.out.println(p1.calcula(1));
        System.out.println(p2.calcula(1));
        p1.insere(n2);
        p2.insere(n3);
        System.out.println(p1.calcula(1));
        System.out.println(p2.calcula(1));
        p1.fusao(p2);
        System.out.println(p1.calcula(1));
    }
}
