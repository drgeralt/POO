public class Main {
    public static void main(String[] args) {
        System.out.println(Gato.quantidadeDeGatos);

        Gato novoGato = new Gato();
        novoGato.miau();
        novoGato.nome = "Gabba";
        novoGato.idade = 19;

        System.out.println(Gato.quantidadeDeGatos);

        System.out.println(novoGato.vidasRestantes);
        novoGato.matarGato();
        System.out.println(novoGato.vidasRestantes);

    }
}
