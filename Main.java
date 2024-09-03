import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println(Gato.quantidadeDeGatos);

        Gato novoGato = new Gato();
        novoGato.miau();
        novoGato.nome = scanner.nextLine();
        novoGato.idade = 19;

        novoGato.altura = scanner.nextFloat();
        System.out.println(novoGato.nome);

        System.out.println(novoGato.vidasRestantes);
        novoGato.matarGato();
        System.out.println(novoGato.vidasRestantes);




    }
}
