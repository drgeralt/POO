public class Gato {
    int idade;
    int vidasRestantes;
    String nome;
    float altura;
    public static int quantidadeDeGatos = 0;
    private static final int VIDAS_MAXIMAS = 7;

    Gato(){
        quantidadeDeGatos++;
        vidasRestantes = VIDAS_MAXIMAS;
    }

    /**
     *Esse método faz o gato miar
     */
    void miau(){
        System.out.println("Miau");
    }

    /**
     * Esse método remove uma vida do gato
     * @author mamae e papai do rhyan
     */
    void matarGato(){
        if(vidasRestantes==0){
            System.out.println("Já está morto");
        }else{
            vidasRestantes--;
        }
    }
}
