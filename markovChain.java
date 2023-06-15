import java.io.Console;
import java.util.HashMap;

public class markovChain {
    public static void main(String args[]){
        String context = "Hans Zimmer is a successful film composer";
        String prompt = "";

        createMarkov(context);
    }

    public static void createMarkov(String context){
        String[] contextArray = context.toUpperCase().split(" ");
        String[] words = {};
        HashMap<String,HashMap<String,String>> markovList = new HashMap<String,HashMap<String,String>>();
    }
}
