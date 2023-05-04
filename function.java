public class function {
    public static void main(String[] args){
        System.out.println("Start of main program");
        printSentence("This is a subroutine");
        System.out.println("End of main program");
    }
    public static void printSentence(String sentence){
        for(int i=0;i<3;i++){
            System.out.println(sentence);
        }
    }
}