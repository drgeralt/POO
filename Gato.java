public class Gato {
    int idade;
    int vidasRestantes;
    String nome;

    public static int quantidadeDeGatos = 0;
    private static final int VIDAS_MAXIMAS = 7;

    Gato(){
        quantidadeDeGatos++;
        vidasRestantes = VIDAS_MAXIMAS;
    }
    void miau(){
        System.out.println("Miau");
    }
    void matarGato(){
        if(vidasRestantes==0){
            System.out.println("Já está morto");
        }else{
            vidasRestantes--;
        }
    }
}
