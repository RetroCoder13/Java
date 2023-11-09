import java.util.HashMap;

public class markovChain {
    public static void main(String args[]){
        String context = "Hans Zimmer , the renowned composer , is a creative force in the world of film and music . With his extraordinary talent , innovative approach , and diverse range , Zimmer has established himself as one of the most influential and successful composers of our time . Born in Germany , Zimmer embarked on his musical journey at a young age , initially working as a synthesizer player and sound engineer . However , it was his collaboration with director Ridley Scott on the film 'Thelma & Louise' in 1991 that marked a turning point in his career . Known for his distinctive style , Zimmer's music combines orchestral elements with electronic sounds , creating immersive and emotionally powerful compositions . He has composed scores for a wide range of films , spanning multiple genres , from epic blockbusters like 'The Dark Knight' and 'Inception' to heartfelt dramas such as 'The Lion King' and 'Gladiator' . Zimmer's ability to capture the essence of a story through his music has earned him critical acclaim and numerous awards , including multiple Academy Awards , Golden Globes , and Grammy Awards . Beyond the realm of film , Zimmer has also worked on various other projects , including video games , live performances , and collaborations with renowned artists . His versatility and willingness to experiment have led to groundbreaking soundtracks that resonate with audiences worldwide . Zimmer's influence extends beyond his compositions ; he has inspired a new generation of composers and pushed the boundaries of film scoring . Despite his immense success , Zimmer remains humble and continues to challenge himself creatively . He is known for his tireless work ethic and dedication to each project he undertakes . Zimmer's commitment to his craft and his ability to evoke deep emotions through his music have made him an iconic figure in the world of film scoring . In conclusion , Hans Zimmer's contributions to the world of music and film have left an indelible mark . His innovative compositions , meticulous attention to detail , and ability to transport audiences into the heart of a story have solidified his place as a true master of his craft . Whether through thrilling action sequences or poignant character moments , Zimmer's music has the power to elevate storytelling to new heights .";
        String prompt = "Hans";
        HashMap<String,HashMap<String,Integer>> markovList = new HashMap<String,HashMap<String,Integer>>();

        createMarkov(context, markovList);
        get(prompt, markovList, 100, 0);
    }

    public static void createMarkov(String context, HashMap<String,HashMap<String,Integer>> markovList){
        String[] contextArray = context.toUpperCase().split(" ");

        for(int i=0;i<contextArray.length;i++){
            if(!markovList.containsKey(contextArray[i])){
                markovList.put(contextArray[i], new HashMap<String,Integer>());
            }
        }

        for(int i=0;i<contextArray.length;i++){
            // markovList.put(contextArray[i]);
            if(i==0){
                if(markovList.get(contextArray[contextArray.length-1]).get(contextArray[i]) != null){
                    markovList.get(contextArray[contextArray.length-1]).put(contextArray[i], markovList.get(contextArray[contextArray.length-1]).get(contextArray[i]) + 1);
                } else {
                    markovList.get(contextArray[contextArray.length-1]).put(contextArray[i], 1);
                }
            } else {
                if(markovList.get(contextArray[i-1]).get(contextArray[i]) != null){
                    markovList.get(contextArray[i-1]).put(contextArray[i], markovList.get(contextArray[i-1]).get(contextArray[i]) + 1);
                } else {
                    markovList.get(contextArray[i-1]).put(contextArray[i], 1);
                }
            }
        }
    }

    public static void get(String item, HashMap<String,HashMap<String,Integer>> markovList, int iterations, int currentIteration){
        if(iterations > currentIteration){
            item = item.toUpperCase();
            int count = 0;
            for(int i=0;i<markovList.get(item).values().size();i++){
                count += markovList.get(item).values().iterator().next();
            }

            count = 0;
            int probability = ((int)(Math.random() * count));
            String value = "";

            for(int i=0;i<markovList.get(item).values().size();i++){
                count += markovList.get(item).values().iterator().next();
                value = markovList.get(item).keySet().iterator().next();
                if(count >= probability){
                    break;
                }
            }
            System.out.println(value);
            get(value, markovList, iterations, currentIteration+1);
        }
    }
}
