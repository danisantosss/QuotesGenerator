import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        int opcao;
        Quotes quote = new Quotes();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Hello bro, do you want a quote?");
        System.out.println("1 - Yes bro");
        System.out.println("2 - No bro, thanks");
        System.out.println("3 - I want to register my own quote");
        opcao = leitor.nextInt();
        leitor.nextLine();

        if (opcao == 1) {
            System.out.println("\n" + quote.getQuotes());
        } else if (opcao ==2) {
            System.out.println("Hmm okay, no quotes for you 😂");
        } else {
            System.out.println("Ok then, write your quote");
            String frase = leitor.nextLine();
            quote.setQuotes(frase);

            System.out.println("Your quote: " + quote.getQuotes());
        }
        leitor.close();
    }
}