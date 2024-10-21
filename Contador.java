import java.util.Scanner;
import java.util.Locale;
public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int x,y;
        x = sc.nextInt();
        y = sc.nextInt();

        if (x > y) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }else{
            for (int i=1; i <= y-x; i++) {
                System.out.println("imprimindo o numero " + i);
            }
        }

    }
}
