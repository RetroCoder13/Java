import java.util.ArrayList;

public class arrays2 {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Betsy");
        names.add("Anita");
        names.add("Murshed");
        names.add("Hamish");
        System.out.println(names);
        names.remove(1);
        System.out.println(names);
        names.remove("Murshed");
        System.out.println(names);
    }
}