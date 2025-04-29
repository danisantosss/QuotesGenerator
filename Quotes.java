import java.util.ArrayList;
import java.util.List;

public class Quotes {

    private List<String> spiderManQuotes;
    private List<String> ironManQuotes;
    private List<String> captainAmericaQuotes;
    private List<String> myQuotes;

    public Quotes() {
        spiderManQuotes = new ArrayList<>();
        ironManQuotes = new ArrayList<>();
        captainAmericaQuotes = new ArrayList<>();
        myQuotes = new ArrayList<>();
        
        spiderManQuotes.add("With great power comes great responsibility.");
        spiderManQuotes.add("I'm just your friendly neighborhood Spider-Man.");
        spiderManQuotes.add("Sometimes, to do what's right, we have to give up what we want the most.");
        
        ironManQuotes.add("I am Iron Man.");
        ironManQuotes.add("Genius, billionaire, playboy, philanthropist.");
        ironManQuotes.add("Sometimes, you have to run before you can walk.");
        
        captainAmericaQuotes.add("I can do this all day.");
        captainAmericaQuotes.add("I don't like bullies, I don't care where they're from.");
        captainAmericaQuotes.add("Freedom is something worth defending.");
    }

    public List<String> getHeroQuotes(int heroChoice) {
        switch (heroChoice) {
            case 1: return spiderManQuotes;
            case 2: return ironManQuotes;
            case 3: return captainAmericaQuotes;
            default: return null;
        }
    }

    public String getHeroName(int heroChoice) {
        switch (heroChoice) {
            case 1: return "Spider-Man";
            case 2: return "Iron Man";
            case 3: return "Captain America";
            default: return null;
        }
    }

    public List<String> getMyQuotes() {
        return myQuotes;
    }

    public void addMyQuote(String quote) {
        myQuotes.add(quote);
    }

    public void editMyQuote(int quoteIndex, String newQuote) {
        if (quoteIndex >= 0 && quoteIndex < myQuotes.size()) {
            myQuotes.set(quoteIndex, newQuote);
        }
    }

    public void deleteMyQuote(int quoteIndex) {
        if (quoteIndex >= 0 && quoteIndex < myQuotes.size()) {
            myQuotes.remove(quoteIndex);
        }
    }
}