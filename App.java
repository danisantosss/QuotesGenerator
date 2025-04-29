import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Quotes quotes = new Quotes();
        
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Spider-Man quote");
            System.out.println("2. Iron Man quote");
            System.out.println("3. Captain America quote");
            System.out.println("4. Manage my quotes");
            System.out.println("5. Exit");
            System.out.print("Option: ");
            
            int heroChoice = scanner.nextInt();
            scanner.nextLine();
            
            if (heroChoice == 5) {
                System.out.println("Exiting...");
                break;
            }
            
            if (heroChoice == 4) {
                while (true) {
                    System.out.println("\nMy quotes:");
                    System.out.println("1. Show my quotes");
                    System.out.println("2. Add new quote");
                    System.out.println("3. Edit a quote");
                    System.out.println("4. Delete a quote");
                    System.out.println("5. Back to the main menu");
                    System.out.print("Choose an action: ");
                    
                    int action = scanner.nextInt();
                    scanner.nextLine();
                    
                    List<String> myQuotes = quotes.getMyQuotes();
                    
                    switch (action) {
                        case 1:
                            for (int i = 0; i < myQuotes.size(); i++) {
                                System.out.println((i + 1) + ". " + myQuotes.get(i));
                            }
                            break;
                        case 2:
                            System.out.print("Enter the new quote: ");
                            String newQuote = scanner.nextLine();
                            quotes.addMyQuote(newQuote);
                            System.out.println("Quote added!");
                            break;
                        case 3:
                            System.out.print("Enter the number of the quote you want to edit: ");
                            int editIndex = scanner.nextInt() - 1;
                            scanner.nextLine();
                            if (editIndex >= 0 && editIndex < myQuotes.size()) {
                                System.out.print("Enter the new quote: ");
                                String editedQuote = scanner.nextLine();
                                quotes.editMyQuote(editIndex, editedQuote);
                                System.out.println("Quote updated!");
                            } else {
                                System.out.println("Invalid quote number.");
                            }
                            break;
                        case 4:
                            System.out.print("Enter the number of the quote you want to delete: ");
                            int deleteIndex = scanner.nextInt() - 1;
                            scanner.nextLine();
                            if (deleteIndex >= 0 && deleteIndex < myQuotes.size()) {
                                quotes.deleteMyQuote(deleteIndex);
                                System.out.println("Quote deleted!");
                            } else {
                                System.out.println("Invalid quote number.");
                            }
                            break;
                        case 5:
                            break;
                        default:
                            System.out.println("Invalid option.");
                            continue;
                    }
                    
                    if (action == 5) {
                        break;
                    }
                }
            } else {
                List<String> heroQuotes = quotes.getHeroQuotes(heroChoice);
                String heroName = quotes.getHeroName(heroChoice);
                
                System.out.println("\n" + heroName + " quotes:");
                for (int i = 0; i < heroQuotes.size(); i++) {
                    System.out.println((i + 1) + ". " + heroQuotes.get(i));
                }
            }
        }

        scanner.close();
    }
}