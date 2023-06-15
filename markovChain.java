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
        HashMap<String,HashMap<String,String>> markovList = new HashMap<String,HashMap<String,String>>();

        for(int i=0;i<contextArray.length;i++){
            if(!markovList.containsKey(contextArray[i])){
                markovList.put(contextArray[i], new HashMap<String,String>());
            }
        }

        for(int i=0;i<contextArray.length;i++){
            // markovList.put(contextArray[i]);
        }
    }
}
